// Interfejs reprezentujący funkcję
@FunctionalInterface
interface DoubleFunction<T> {
    T apply(double value);
}

// Klasa bazowa do numerycznego całkowania
abstract class NumericalIntegration {
    abstract double integrate(DoubleFunction<Double> function, double a, double b, int n);
}

// Klasa implementująca metodę prostokątów
class RectangleRule extends NumericalIntegration {
    private double alpha;

    public RectangleRule(double alpha) {
        this.alpha = alpha;
    }

    @Override
    double integrate(DoubleFunction<Double> function, double a, double b, int n) {
        double sum = 0.0;
        double h = (b - a) / n;
        for (int i = 0; i < n; i++) {
            sum += function.apply(a + (i + alpha) * h);
        }
        return h * sum;
    }
}

// Klasa implementująca metodę trapezów
class TrapezoidalRule extends NumericalIntegration {
    @Override
    double integrate(DoubleFunction<Double> function, double a, double b, int n) {
        double sum = 0.0;
        double h = (b - a) / n;
        for (int i = 1; i < n; i++) {
            sum += function.apply(a + i * h);
        }
        sum += (function.apply(a) + function.apply(b)) / 2.0;
        return h * sum;
    }
}

// Klasa główna do testowania metod
public class NumericalIntegrationDemo {
    public static void main(String[] args) {
        DoubleFunction<Double> function = (x) -> Math.sin(x);
        NumericalIntegration rectangleRule = new RectangleRule(0.5);
        NumericalIntegration trapezoidalRule = new TrapezoidalRule();

        double a = 0; // Początek przedziału
        double b = Math.PI; // Koniec przedziału
        int n = 1000; // Liczba podprzedziałów

        double resultRectangle = rectangleRule.integrate(function, a, b, n);
        double resultTrapezoid = trapezoidalRule.integrate(function, a, b, n);

        System.out.println("Wynik całkowania metodą prostokątów: " + resultRectangle);
        System.out.println("Wynik całkowania metodą trapezów: " + resultTrapezoid);
    }
}
