public interface Swimmable {
    void swim();

    default void breaststrokeSwim() {
        System.out.println("breaststrokeSwim");
    };
}
