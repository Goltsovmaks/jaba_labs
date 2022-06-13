package CompositionInfo;

public class MusicalComposition extends Composition {
    public String genre; // enum?

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\nGenre is " + genre;
    }
}
