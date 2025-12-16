package ejercicio2nivel1;

public class Car {

    public static final String brand = "Toyota";
    public static String model = "Corolla";
    public final int power;

    public Car(int power) {
        this.power = power;
    }

    public static void brake() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerate() {
        System.out.println("El vehicle està accelerant");
    }


}
