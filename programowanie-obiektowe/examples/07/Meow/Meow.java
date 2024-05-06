interface Meowable {
    // Interfejs może zawierać:
    // - stałe
    int no_of_legs = 4;
    
    // - sygnatury metod
    String meow();

    // - metody domyślne
    default String eat() {
        return "O mnom mnom!";
    }

    // - metody statyczne
    static String purr() {
        return "Purr!";
    }

    // - typy zagnieżdżone
    class Kitty {}
}

interface Huntable {
    // Najczęściej są jednak używane sygnatury metod.
    boolean successful_hunting();
}

class Cat implements Meowable {
    public String meow() {
        return "Meow!";
    }

    int legs() {
        return no_of_legs;
    }
};

class Wild_Cat extends Cat implements Meowable, Huntable {
    @Override public String meow() {
        return "Meeeooow!!!";
    }

    @Override public String eat() {
        return "O mnom mnom!!!";
    }

    public boolean successful_hunting() {
        return new java.util.Random().nextBoolean();
    }
};

public class Meow {
    public static void main(String[] args) {
        Cat c = new Cat();
        Wild_Cat w = new Wild_Cat();
        Meowable.Kitty k = new Meowable.Kitty();

        System.out.println(c.meow() + " " + c.eat());
        System.out.println(w.meow());
        if (w.successful_hunting()) {
            System.out.println(w.eat());
        }
        // Meowable.no_of_legs = 5; // Błąd!
        System.out.println(Meowable.purr());
    }
}
