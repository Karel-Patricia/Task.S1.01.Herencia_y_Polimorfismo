package ejercicio1nivel1;

public class PercussionInstrument extends Instrument {

    static {
        System.out.println("La classe PercussionInstrument s'ha carregat");
    }

    public PercussionInstrument(String name, int price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de percussió");
    }

    public static void save() {
        System.out.println("s'està guardant l'instrument");
    }

    @Override
    public String toString() {
        return "PercussionInstrument{}" + super.toString();
    }
}
