import java.util.*;

class Room {
    private String type;
    private int square;

    public Room(String type, int square) {
        this.type = type;
        this.square = square;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getSquare() {
        return square;
    }

}

public class Main {
    static int type1 = 0;
    static int type2 = 0;
    static int secondFloorType = 0;
    static int type3 = 0;
    static int thirdFloorType = 0;
    public static void main(String[] args) {
        Room[] floor1 = new Room[10];
        ArrayList<Room> floor2 = new ArrayList<>();
        LinkedList<Room> floor3 = new LinkedList<>();

        int count = floor1.length;
        for (int i = 0; i < count; i++) {
            floor1[i] = new Room("Type1", i);

            floor2.add(new Room("Type2", i));
            floor2.add(new Room("SecondFloorType", i));

            floor3.add(new Room("Type3", i));
            floor3.add(new Room("ThirdFloorType", i));

        }

        // площадь по этажам

        //1 этаж
        int firstFloorSquare = CalculateSquareOfFloor(Arrays.stream(floor1).iterator());
        System.out.println("Square of first floor" + firstFloorSquare);

        //2 этаж
        int secondFloorSquare = CalculateSquareOfFloor(floor2.iterator());
        System.out.println("Square of second floor" + secondFloorSquare);

        // 3 этаж
        int thirdFloorSquare = CalculateSquareOfFloor(floor3.iterator());
        System.out.println("Square of third floor" + thirdFloorSquare);

        // total
        int total = firstFloorSquare + secondFloorSquare + thirdFloorSquare;
        System.out.println("Total: " + total);

        //площадь по типу
        System.out.println(
                "Type1: " + type1 + "\n" +
                "Type2: " + type2 + "\n" +
                "Type3: " + type3 + "\n" +
                "SecondFloorType: " + secondFloorType + "\n" +
                "ThirdFloorType: " + thirdFloorType + "\n"
        );

    }

    public static int CalculateSquareOfFloor(Iterator<Room> iterator ) {
        int square = 0;
        while (iterator.hasNext()) {
            Room room = iterator.next();
            square += room.getSquare();
            sumRoomSquareByType(room);
        }
        return square;
    }

    public static void sumRoomSquareByType(Room room){
        switch (room.getType()){
            case "Type1":
                type1 += room.getSquare();
                break;
            case "Type2":
                type2 += room.getSquare();
                break;
            case "Type3":
                type3 += room.getSquare();
                break;
            case "SecondFloorType":
                secondFloorType += room.getSquare();
                break;
            case "ThirdFloorType":
                thirdFloorType += room.getSquare();
                break;
        }
    }
}













