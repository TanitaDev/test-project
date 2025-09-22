import java.lang.Runnable;

public class App {
    public static void main(String[] args) {
        Horse horse = new Horse("name", 7);
        horse.run();
        horse.jump();
        horse.swim();
        String name = Horse.NAME;
        System.out.println(name);
        horse.breaststrokeSwim();
    }
}
