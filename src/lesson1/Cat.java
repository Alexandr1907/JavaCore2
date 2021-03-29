package lesson1;

public class Cat implements Swimmable, Runnable{
    @Override
    public void run() {
        System.out.println("Носился так что разнес всю хату");
    }

    @Override
    public void swim() {
        System.out.println("Бедняга плывет");
    }
}
