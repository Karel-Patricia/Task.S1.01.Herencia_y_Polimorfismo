package ejercicio2nivel1;

public class Car {

    private static final String BRAND = "Toyota";
    private static String model = "Corolla";
    private final int power;

    public Car(int power) {
        this.power = power;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static void brake() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerate() {
        System.out.println("El vehicle està accelerant");
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                '}';
    }
}
