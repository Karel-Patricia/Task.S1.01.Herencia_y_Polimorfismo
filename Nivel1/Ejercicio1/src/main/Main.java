package main;

import ejercicio1nivel1.Instrument;
import ejercicio1nivel1.PercussionInstrument;
import ejercicio1nivel1.StringInstrument;
import ejercicio1nivel1.WindInstrument;

public class Main {
    public static void main(String[] args) {
        Instrument wind = new WindInstrument("Flute", 200);
        Instrument string = new StringInstrument("Guitar", 500);
        Instrument percussion = new PercussionInstrument("drums", 1000);

        wind.play();
        string.play();
        percussion.play();

    }
}
