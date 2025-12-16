package ejercicio1nivel1;

public class WindInstrument extends Instrument {

    public WindInstrument(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }

    @Override
    public String toString() {
        return "WindInstrument{}" + super.toString();
    }
}

