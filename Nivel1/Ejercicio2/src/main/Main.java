package main;

import ejercicio2nivel1.Car;

public class Main {
    static void main(String[] args) {

        //Muestra valores iniciales
        System.out.println("brand : " + Car.brand);
        System.out.println("model : " + Car.model);

        //Dos coches con distinta potencia
        Car car1 = new Car(100);
        Car car2 = new Car(140);

        System.out.println("Potencia car1: " + car1.power);
        System.out.println("Potencia car2: " + car2.power);

        //Cambio de modelo
        Car.model = "Princes";

        System.out.println("Modelo después del cambio:");
        System.out.println("Modelo car1: " + Car.model);
        System.out.println("Modelo car2: " + Car.model);


        Car.brake();
        car1.accelerate();
        car2.accelerate();

    }
}
