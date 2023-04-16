import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Musician jazz = new JazzArtist(new Guitar());
        jazz.applyInstrument();

        Musician cls = new ClassicalArtist(new Piano());
        cls.applyInstrument();
    }
}
