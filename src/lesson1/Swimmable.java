package lesson1;

public interface Swimmable {
    String name = "Оно плывет";
    int i = Math.min(1,2);
    default void swim() {
        System.out.println(name);
    }
}
