import java.util.Scanner;

class Quadratic_equation {
    private double a, b, c;

    public Quadratic_equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return b * b - 4 * a * c;
    }

    public double calculateRoot1() throws ArithmeticException {
        double delta = delta();
        if (delta < 0) {
            throw new ArithmeticException("Brak pierwiastków rzeczywistych.");
        } else {
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
    }

    public double calculateRoot2() throws ArithmeticException {
        double delta = delta();
        if (delta < 0) {
            throw new ArithmeticException("Brak pierwiastków rzeczywistych.");
        } else {
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
    }
}

public class Kwadratowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartości a, b, c dla równania ax^2 + bx + c = 0:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        try {
            Quadratic_equation equation = new Quadratic_equation(a, b, c);
            double delta = equation.delta();
            System.out.println("Delta = " + delta);

            if (delta > 0) {
                double root1 = equation.calculateRoot1();
                double root2 = equation.calculateRoot2();
                System.out.println("Pierwszy pierwiastek rzeczywisty x1 = " + root1);
                System.out.println("Drugi pierwiastek rzeczywisty x2 = " + root2);
            } else if (delta == 0) {
                double root = equation.calculateRoot1();
                System.out.println("Pierwiastek rzeczywisty x0 = " + root);
            } else {
                System.out.println("Brak pierwiastków rzeczywistych.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
