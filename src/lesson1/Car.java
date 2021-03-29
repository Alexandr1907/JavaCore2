package lesson1;

public class Car extends Mechanism implements Runnable {

    public Car(String name) {
        super(name);
    }

    public void start(){
        System.out.println("Двигатель заведен");
    }

    @Override
    public void run() {
        System.out.println("Машина едет");
    }
}
