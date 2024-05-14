interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying.");
    }
}

public class FlyableExample {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        bird.fly();  // Bird is flying.

        Flyable airplane = new Airplane();
        airplane.fly();  // Airplane is flying.
    }
}
