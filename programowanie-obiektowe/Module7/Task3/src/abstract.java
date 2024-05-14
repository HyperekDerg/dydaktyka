abstract class Flyable {
    abstract void fly();
}

class Bird extends Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Airplane extends Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying.");
    }
}
