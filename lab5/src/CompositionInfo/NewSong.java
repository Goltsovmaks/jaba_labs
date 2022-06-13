package CompositionInfo;

//песни до 21 века

public class NewSong extends MusicalComposition {
    public String text;
    private int year;
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public NewSong(
            String title,
            String author,
            String genre,
            String text,
            int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.text = text;
        if (year < 2000) {
            this.year = 2000;
        } else {
            this.year=year;
        }
    }


    @Override
    public String getDescription() {
        return super.getDescription() + "\nText of new song: " + text+ "\nYear:" +year;
    }}
