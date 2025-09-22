public class Horse extends Animal implements Runnable {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("horse run");
    }

    @Override
    public void jump() {
        System.out.println("horse jump");
    }


    @Override
    public void swim() {
        System.out.println("horse swim");
    }

    @Override
    public void breaststrokeSwim() {
        Runnable.super.breaststrokeSwim();
        System.out.println("horse breaststroke swim");
    }
}