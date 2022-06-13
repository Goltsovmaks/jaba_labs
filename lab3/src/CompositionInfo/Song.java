package CompositionInfo;

public class Song extends MusicalComposition {

    public String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Song(
            String title,
            String author,
            String genre,
            String text) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.text = text;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nText of song " + text;
    }
}
