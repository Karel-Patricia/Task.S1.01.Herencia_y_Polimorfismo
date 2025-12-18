package main;

import ejercicio1nivel1.Instrument;
import ejercicio1nivel1.PercussionInstrument;
import ejercicio1nivel1.StringInstrument;
import ejercicio1nivel1.WindInstrument;

public class Main {

    public static void main(String[] args) {

        WindInstrument wind = new WindInstrument("Flute", 200);
        StringInstrument string = new StringInstrument("Guitar", 500);
        PercussionInstrument percussion = new PercussionInstrument("drums", 1000);

        wind.play();
        string.play();
        percussion.play();
        System.out.println();

        WindInstrument.save();
        StringInstrument.save();
        PercussionInstrument.save();

    }
}

