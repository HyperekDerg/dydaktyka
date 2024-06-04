// Interfejsy abstrakcyjnych produktów na przykładzie posiłków:
// - zupa
interface Soup {
    Boolean is_hot();
}

// - danie główne
interface Main_course {
    Boolean contains_meat();
}

// - deser
interface Dessert {
    String main_ingredient();
}

// Interfejs fabryki abatrakcyjnej na przykładzie kuchni regionalnych.
interface Regional_cuisine {
    Soup prepare_soup();
    Main_course prepare_main_course();
    Dessert prepare_dessert();
}

// Klasy implementujące powyższe interfejsy znajdują się poniżej.

// Kuchnia polska: żurek, kotlet schabowy i sernik.

class Zurek implements Soup {
    public Boolean is_hot() { return true; }
}

class Kotlet_schabowy implements Main_course {
    public Boolean contains_meat() { return true; }
}

class Sernik implements Dessert {
    public String main_ingredient() { return "twaróg"; }
}

class Polish_cuisine implements Regional_cuisine {
    public Soup prepare_soup() { return new Zurek(); }
    public Main_course prepare_main_course() { return new Kotlet_schabowy(); }
    public Dessert prepare_dessert() { return new Sernik(); }
}

// Kuchnia włoska: stracciatella, lasagne al forno, panna cotta.

class Stracciatella implements Soup {
    public Boolean is_hot() { return true; }
}

class Lasagne_al_forno implements Main_course {
    public Boolean contains_meat() { return true; }
}

class Panna_cotta implements Dessert {
    public String main_ingredient() { return "śmietanka"; }
}

class Italian_cuisine implements Regional_cuisine {
    public Soup prepare_soup() { return new Stracciatella(); }
    public Main_course prepare_main_course() { return new Lasagne_al_forno(); }
    public Dessert prepare_dessert() { return new Panna_cotta(); }
}

// Wykorzystanie fabryki abstrakcyjnej do stworzenia kompletnych zestawów
// posiłków danej kuchni znajduje się poniżej.

public class Cuisine {
    private static void prepare_meal(Regional_cuisine factory) {
        System.out.println(factory.getClass().getName());
        System.out.println(factory.prepare_soup().getClass().getName());
        System.out.println(factory.prepare_main_course().getClass().getName());
        System.out.println(factory.prepare_dessert().getClass().getName());
    }
    
    public static void main(String[] args) {
        prepare_meal(new Polish_cuisine());
        prepare_meal(new Italian_cuisine());
    }
}
