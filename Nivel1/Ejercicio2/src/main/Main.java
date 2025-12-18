package main;

import ejercicio2nivel1.Car;

public class Main {

     public static void main(String[] args) {

        Car car1 = new Car(100);
        Car car2 = new Car(140);

        System.out.println();
        System.out.println(car1.toString());

        car1.accelerate();

        Car.brake();

        Car.setModel("Princes");
        System.out.println();

        System.out.println(car1.toString());
        System.out.println(car2.toString());

    }
}
