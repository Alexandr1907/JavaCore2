package lesson1;

public class Boat extends Mechanism implements Swimmable {
    public Boat(String name) {
        super(name);
    }
    public void slide() {
        System.out.println("Скользит по воде на холостом ходу");
    }

    @Override
    public void swim() {
        System.out.println("Лодка плывет");
    }
}
