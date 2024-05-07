abstract class Meow {
    private boolean hungry;

    Meow() {
        hungry = true;
    }

    public void set_hungry(boolean b) {
        hungry = b;
    }

    String meow() {
        return hungry? frustrated() : satisfied();
    }

    abstract String frustrated();
    abstract String satisfied();
}

class Cat extends Meow {
    @Override String frustrated() {
        return "Meowowowow!";
    }

    @Override String satisfied() {
        return "Meow!";
    }
}

public class Abstract_Meow {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c.meow());
        c.set_hungry(false);
        System.out.println(c.meow());
    }
}
