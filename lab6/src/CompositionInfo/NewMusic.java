package CompositionInfo;


public class NewMusic extends MusicalComposition {
    private int year;

    public NewMusic(
            String title,
            String author,
            String genre,
            int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        if (year < 2000) {
            this.year = 2000;
        } else {
            this.year=year;
        }
    }


    @Override
    public String getDescription() {
        return super.getDescription() + "\nNew music\nYear:" +year;
    }
}
