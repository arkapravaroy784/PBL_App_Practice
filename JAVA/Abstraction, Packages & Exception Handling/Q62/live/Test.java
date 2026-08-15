package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // Part (a)
        Veena veena = new Veena();
        veena.play();

        // Part (b)
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        System.out.println();

        // Part (c)
        Playable instrument;

        instrument = new Veena();
        instrument.play();

        instrument = new Saxophone();
        instrument.play();
    }
}