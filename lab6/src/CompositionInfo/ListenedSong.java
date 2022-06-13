package CompositionInfo;

public class ListenedSong extends SongDecorator{
    public ListenedSong(Composition composition) {
        super(composition);
    }
    @Override
    public String getDescription() {
        return composition.getDescription()+"Song was listen.\n";
    }
}

