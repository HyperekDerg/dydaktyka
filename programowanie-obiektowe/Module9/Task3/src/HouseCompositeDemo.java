import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Interfejs reprezentujący komponent domu
interface HouseComponent {
    double getArea();
}

// Klasy reprezentujące poszczególne komponenty domu
class LivingRoom implements HouseComponent {
    private double area;

    public LivingRoom(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Hallway implements HouseComponent {
    private double area;

    public Hallway(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Kitchen implements HouseComponent {
    private double area;

    public Kitchen(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Pantry implements HouseComponent {
    private double area;

    public Pantry(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Bathroom implements HouseComponent {
    private double area;

    public Bathroom(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Garage implements HouseComponent {
    private double area;

    public Garage(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }
}

// Klasa reprezentująca dom jako kompozyt komponentów
class House implements HouseComponent {
    private List<HouseComponent> components = new ArrayList<>();

    public void addComponent(HouseComponent component) {
        components.add(component);
    }

    @Override
    public double getArea() {
        double totalArea = 0;
        for (HouseComponent component : components) {
            totalArea += component.getArea();
        }
        return totalArea;
    }
}

// Klasa główna do testowania
public class HouseCompositeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house = new House();

        System.out.println("Enter the number of living rooms:");
        int livingRooms = scanner.nextInt();
        for (int i = 0; i < livingRooms; i++) {
            System.out.println("Enter the area of living room " + (i + 1) + ":");
            double area = scanner.nextDouble();
            house.addComponent(new LivingRoom(area));
        }

        System.out.println("Enter the number of hallways:");
        int hallways = scanner.nextInt();
        for (int i = 0; i < hallways; i++) {
            System.out.println("Enter the area of hallway " + (i + 1) + ":");
            double area = scanner.nextDouble();
            house.addComponent(new Hallway(area));
        }

        System.out.println("Enter the number of kitchens:");
        int kitchens = scanner.nextInt();
        for (int i = 0; i < kitchens; i++) {
            System.out.println("Enter the area of kitchen " + (i + 1) + ":");
            double area = scanner.nextDouble();
            house.addComponent(new Kitchen(area));
        }

        System.out.println("Enter the number of pantries:");
        int pantries = scanner.nextInt();
        for (int i = 0; i < pantries; i++) {
            System.out.println("Enter the area of pantry " + (i + 1) + ":");
            double area = scanner.nextDouble();
            house.addComponent(new Pantry(area));
        }

        System.out.println("Enter the number of bathrooms:");
        int bathrooms = scanner.nextInt();
        for (int i = 0; i < bathrooms; i++) {
            System.out.println("Enter the area of bathroom " + (i + 1) + ":");
            double area = scanner.nextDouble();
            house.addComponent(new Bathroom(area));
        }

        System.out.println("Enter the number of garages:");
        int garages = scanner.nextInt();
        for (int i = 0; i < garages; i++) {
            System.out.println("Enter the area of garage " + (i + 1) + ":");
            double area = scanner.nextDouble();
            house.addComponent(new Garage(area));
        }

        double totalArea = house.getArea();
        System.out.println("The total usable area of the house is: " + totalArea);
        scanner.close();
    }
}
