package main;

import ejercicio1nivel2.Smartphone;

public class Main {
    static void main(String[] args) {

        Smartphone smartphone = new Smartphone("Apple", "iPhone X");

        smartphone.call("987654321");
        smartphone.takePhoto();
        smartphone.ringAlarm();
    }
}
