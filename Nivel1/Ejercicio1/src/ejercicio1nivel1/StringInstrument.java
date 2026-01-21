package ejercicio1nivel1;

public class StringInstrument extends Instrument {

    static {
        System.out.println("La classe StringInstrument s'ha carregat");
    }

    public StringInstrument(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }

    public static void save() {
        System.out.println("s'està guardant l'instrument");
    }

    @Override
    public String toString() {
        return "StringInstrument{}" + super.toString();
    }
}
