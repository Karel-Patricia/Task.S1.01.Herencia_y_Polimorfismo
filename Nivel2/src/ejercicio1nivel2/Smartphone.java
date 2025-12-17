package ejercicio1nivel2;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("Se está haciendo una foto");
    }

    @Override
    public void ringAlarm() {
        System.out.println("Está sonando una alarma");
    }
}
