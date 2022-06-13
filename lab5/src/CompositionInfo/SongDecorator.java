package CompositionInfo;

public class SongDecorator implements ShowDescription{
    protected  Composition composition;

    SongDecorator(Composition composition){
        this.composition=composition;
    }

    @Override
    public String getDescription() {
        return composition.getDescription();
    }

}

