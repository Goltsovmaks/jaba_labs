import java.util.Scanner;
import CompositionInfo.*;

public class Main {
    public static void main(String[] args) {

        String[] titles = new String[]{"paths of the fossils","run","Highway to Hell","highway to hell","believer"};
        String[] authors = new String[]{"Ludovico Einaudi","ACDC","Imagine Dragons"};
        String[] genres = new String[]{"instrumental", "rock", "pop"};
        String[] texts = new String[]{"without text", "powerful and strong words", "very popular word for everyone"};

        int oldYear = 1824;
        int newYear = 2012;

        // фабрика создает два вида песен - старые и новые
        SongFactory factory = new SongFactory();
        System.out.println(
                factory.createOldSong(titles[0],authors[0],genres[0],texts[0],oldYear).getDescription()
        );
        System.out.println(
            factory.createNewSong(titles[1],authors[1],genres[1],texts[1],newYear).getDescription()
        );

    }
}