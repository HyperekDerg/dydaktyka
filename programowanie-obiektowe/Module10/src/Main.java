// Interfejs Visitor
interface Visitor {
    void visit(Square square);
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}

// Abstrakcyjna klasa Shape
abstract class Shape {
    abstract void accept(Visitor visitor);
}

// Klasa Square
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getSide() {
        return side;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// Klasa Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// Klasa Rectangle
class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// Implementacja Visitor
class AreaCalculator implements Visitor {
    double area;

    @Override
    public void visit(Square square) {
        area = square.getSide() * square.getSide();
        System.out.println("Area of Square: " + area);
    }

    @Override
    public void visit(Circle circle) {
        area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of Circle: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(2);
        Shape circle = new Circle(1);
        Shape rectangle = new Rectangle(8, 10);

        AreaCalculator calculator = new AreaCalculator();

        square.accept(calculator);
        circle.accept(calculator);
        rectangle.accept(calculator);
    }
}
