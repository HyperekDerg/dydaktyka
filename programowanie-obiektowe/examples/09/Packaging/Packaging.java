// Klasa komponentu o nazwie `Item`.
class Item {
    private double value;
    public Item(double value) { this.value = value; }
    public double value() { return value; } // Metoda operacji wzorca kompozyt.
}

// Klasy liści o nazwach `Phone`, `Charger` i `Headphones`.

class Phone extends Item {
    public Phone(double value) { super(value); }
    public void make_call() {}
    // …
}

class Charger extends Item {
    public Charger(double value) { super(value); }
    public void charge() {}
    // …
}

class Headphones extends Item {
    public Headphones(double value) { super(value); }
    public void play() {}
    // …
}

// Klasa kompozytu o nazwie `Package`.
class Package extends Item {
    private java.util.Stack<Item> items = new java.util.Stack<Item>();

    public Package() { super(0.); }
    
    public void add(Item child) {
        items.push(child);
    }

    public Item get() {
        return items.pop();
    }

    // Metoda operacji wzorca kompozyt musi być tutaj nadpisana, aby prawidłowo
    // obsłużyć kompozycję.
    @Override public double value() {
        double res = 0.;
        for (Item i : items) {
            res += i.value();
        }
        return res;
    }
}

public class Packaging {
    // W paczce przychodzi telefon z ładowarką.
    private static Package phone_factory() {
        Package res = new Package();
        res.add(new Phone(479.));
        res.add(new Charger(20.));
        return res;
    }

    // W paczce przychodzą słuchawki.
    private static Package audio_factory() {
        Package res = new Package();
        res.add(new Headphones(59.));
        return res;
    }

    // W paczce przychodzą dwie mniejsze paczki.
    public static void main(String[] args) {
        Package delivery_package = new Package();
        delivery_package.add(phone_factory());
        delivery_package.add(audio_factory());
        System.out.println("Cena przesyłki: " + delivery_package.value());
    }
}
