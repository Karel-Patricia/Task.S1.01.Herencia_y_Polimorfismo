package ejercicio1nivel1;

public abstract class Instrument {
    private String name;//
    private int price;

    public Instrument(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract void play();

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
