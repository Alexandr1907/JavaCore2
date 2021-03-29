package lesson1;

public class Tank extends Mechanism implements Swimmable, Runnable{

    public Tank(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Шумит и прет");
    }

    @Override
    public void swim() {
        System.out.println("Срочное погружение");
    }
}
