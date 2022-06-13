package CompositionInfo;

public class MusicFactory {
    public Composition createNewMusic(
            String title,
            String author,
            String genre,
            int year) {
        return new NewMusic(title,author,genre,year);
    }
    public Composition createOldMusic(
            String title,
            String author,
            String genre,
            int year) {
        return new OldMusic(title,author,genre,year);
    }

}
