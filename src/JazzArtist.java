public class JazzArtist extends Musician {
    public JazzArtist(MusicalInstrument musicalInstrument){
        super(musicalInstrument);
    }
    @Override
    public void applyInstrument(){
        System.out.print("Джазовый музыкант, ");
        instrument.applyInstrument();
    }
}
