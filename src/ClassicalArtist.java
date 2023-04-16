public class ClassicalArtist extends Musician{
    public ClassicalArtist(MusicalInstrument musicalInstrument){
        super(musicalInstrument);
    }
    @Override
    public void applyInstrument(){
        System.out.print("Классический музыкант, ");
        instrument.applyInstrument();
    }
}
