
class Producer {
    private int produceMs = 60;

    public void produce(Warehouse wh) throws InterruptedException {
        while (true) {
            synchronized (wh.getLock()) {
                while (wh.getCurrentCount() == wh.getCapacity()) {
                    wh.getLock().wait();
                }
                wh.setCurrentCount(wh.getCurrentCount()+1);
                System.out.println("Произведен 1 продукт. Кол-во продуктов = " + wh.getCurrentCount());
                wh.getLock().notify();
                Thread.sleep(produceMs);
            }
        }
    }
}

class Consumer {
    private int consumeMs = 600;
    public void consume(Warehouse wh) throws InterruptedException {
        while (true) {
            synchronized (wh.getLock()) {
                while (wh.getCurrentCount() <= 0) {
                    wh.getLock().wait();
                }
                System.out.println("Потребляю продукт. Количество продуктов на складе: " + wh.getCurrentCount());
                wh.setCurrentCount(wh.getCurrentCount()-1);
                wh.getLock().notify();
                Thread.sleep(consumeMs);
            }
        }
    }
}

class Warehouse {
    private int capacity = 10;
    private int currentCount = 0;
    private final Object lock = new Object();


    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int  currentCount) {
        this.currentCount = currentCount;
    }

    public int getCapacity() {
        return capacity;
    }

    public Object getLock() {
        return lock;
    }
}


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Producer pr = new Producer();
        Consumer cr = new Consumer();
        Warehouse wh = new Warehouse();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pr.produce(wh);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    cr.consume(wh);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}