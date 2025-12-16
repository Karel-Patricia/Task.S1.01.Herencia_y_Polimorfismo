package main;

import ejercicio2nivel1.Car;

public class Main {
    static void main(String[] args) {

        Car.brake();

        Car car = new Car(150);
        car.accelerate();
    }
}
