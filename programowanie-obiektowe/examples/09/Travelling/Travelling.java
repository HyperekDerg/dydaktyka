abstract class Traveller {
    public void travel(String starting_point,
                       String destination_point,
                       String things_to_take) {
        pack_the_luggage(things_to_take);
        leave(starting_point);
        cover_the_distance(starting_point, destination_point);
        enter(destination_point);
    }

    protected void pack_the_luggage(String things_to_take) {
        System.out.println("Pakuję: " + things_to_take);
    }

    protected void leave(String starting_point) {
        System.out.println("Opuszczam: " + starting_point);
    }

    abstract protected void cover_the_distance(String starting_point,
                                               String destination_point);

    protected void enter(String destination_point) {
        System.out.println("Przybywam do: " + destination_point);
    }
}

class Car_driver extends Traveller {
    @Override protected void cover_the_distance(String starting_point,
                                                String destination_point) {
        if (empty_tank()) {
            refuel();
        }
    }

    private Boolean empty_tank() {
        return new java.util.Random().nextBoolean();
    }

    private void refuel() {
        System.out.println("Tankowanie");
    }
}

class Cyclist extends Traveller {
    @Override protected void pack_the_luggage(String things_to_take) {
        System.out.println("Pakuję: " + things_to_take);
        System.out.println("Niestety, nie wszystko się zmieściło w bagażniku");
    }
    
    @Override protected void cover_the_distance(String starting_point,
                                                String destination_point) {
        if (is_raining()) {
            System.out.println("Pada deszcz");
            get_wet();
        }
        if (is_chased_by_a_dog()) {
            System.out.println("Goni mnie pies");
            escape();
        }
    }

    private Boolean is_raining() {
        return new java.util.Random().nextBoolean();
    }

    private void get_wet() {
        System.out.println("Moknę");
    }

    private Boolean is_chased_by_a_dog() {
        return new java.util.Random().nextBoolean();
    }

    private void escape() {
        System.out.println("Uciekam");
    }
}

public class Travelling {
    private static void travel(Traveller t) {
        t.travel("X", "Y", "plecak i zakupy");
    }
    
    public static void main(String[] args) {
        System.out.println("Podróż samochodem");
        travel(new Car_driver());
        System.out.println("Podróż rowerem");
        travel(new Cyclist());
    }
}
