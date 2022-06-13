import java.util.Scanner;
import CompositionInfo.*;

public class Main {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        int n = Input.nextInt();
        ListenedSong[] compositions = new ListenedSong[n];

        String[] titles = new String[]{"paths of the fossils","run","Highway to Hell","highway to hell","believer"};
        String[] authors = new String[]{"Ludovico Einaudi","ACDC","Imagine Dragons"};
        String[] genres = new String[]{"instrumental", "rock", "pop"};
        String[] texts = new String[]{"without text", "powerful and strong words", "very popular word for everyone"};

        for(int i=0;i<compositions.length;i++){
            int maxSpeed = (int)(Math.random()*((200-100)+1))+100;
            String title = titles[(int)(Math.random()*titles.length)];
            String author = authors[(int)(Math.random()*authors.length)];
            String genre = genres[(int)(Math.random()*genres.length)];
            String text = texts[(int)(Math.random()*texts.length)];

            compositions[i]=new ListenedSong(new Song(title,author,genre,text));
            System.out.println(compositions[i].getDescription());

        }

        Input.close();
    }
}