package ejercicio1nivel1;

public class StringInstrument extends Instrument {

    public StringInstrument(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }

    @Override
    public String toString() {
        return "StringInstrument{}" + super.toString();
    }
}
