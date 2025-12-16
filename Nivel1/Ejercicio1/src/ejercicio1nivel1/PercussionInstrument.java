package ejercicio1nivel1;

public class PercussionInstrument extends Instrument {

    public PercussionInstrument(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }

    @Override
    public String toString() {
        return "PercussionInstrument{}" + super.toString();
    }
}
