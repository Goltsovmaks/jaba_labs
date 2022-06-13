package CompositionInfo;

public class SongFactory {
    public Composition createNewSong(
            String title,
            String author,
            String genre,
            String text,
            int year) {
        return new NewSong(title,author,genre,text,year);
    }
    public Composition createOldSong(
            String title,
            String author,
            String genre,
            String text,
            int year) {
        return new OldSong(title,author,genre,text,year);
    }

}
