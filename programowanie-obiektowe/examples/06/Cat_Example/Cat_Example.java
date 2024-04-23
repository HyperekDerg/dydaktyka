class Cat {
    private final String fur;

    public Cat(String fur) {
        this.fur = fur;
    }

    public String get_fur() {
        return fur;
    }

    public String description() {
        return "Cat with " + fur + " fur";
    }
};

class Wild_Cat extends Cat {
    private int sharpness_of_claws; // [0%, 100%]

    public Wild_Cat(String fur, int sharpness_of_claws) {
        super(fur);
        this.sharpness_of_claws = sharpness_of_claws;
    }

    public int get_sharpness_of_claws() {
        return sharpness_of_claws;
    }

    @Override public String description() {
        return
            "Wild "
            + super.description()
            + " and claws with sharpness of " + sharpness_of_claws + "%";
    }
};

public class Cat_Example {
    private static void example_1() {
        System.out.println("Example 1");
        Wild_Cat c = new Wild_Cat("black", 100);
        System.out.println(c.description());
        System.out.println(c.get_fur());
        System.out.println(c.get_sharpness_of_claws());
    }

    private static void example_2() {
        System.out.println("Example 2");
        Cat c = new Wild_Cat("black", 100);
        System.out.println(c.description());
        System.out.println(c.get_fur());
        // System.out.println(c.get_sharpness_of_claws()); // Błędny kod
    }
    
    public static void main(String[] args) {
        example_1();
        example_2();
    }
}
