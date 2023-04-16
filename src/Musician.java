public abstract class Musician {
    protected MusicalInstrument instrument;

    public Musician(MusicalInstrument mi){
        this.instrument=mi;
    }
    abstract public void applyInstrument();
}
