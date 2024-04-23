import java.util.Scanner;

public class MainPolymonial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Liczba współczynników: ");
        int n = scanner.nextInt();
        double[] coefficients = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Współczynnik dla x^" + (i) + ": ");
            coefficients[i] = scanner.nextDouble();
        }

        Polynomial polynomial = new Polynomial(coefficients);

        System.out.println("Opis wielomianu:");
        System.out.println(polynomial.description());

        if (polynomial.deg() == 1) {
            LinearPolynomial linearPolynomial = new LinearPolynomial(coefficients);
            System.out.println(linearPolynomial.linearDescription());
            System.out.println("Nachylenie prostej: " + linearPolynomial.slope());
        } else if (polynomial.deg() == 2) {
            QuadraticPolynomial quadraticPolynomial = new QuadraticPolynomial(coefficients);
            System.out.println(quadraticPolynomial.quadraticDescription());
            System.out.println(quadraticPolynomial.extremum());
        } else {
            System.out.println("To nie jest ani wielomian liniowy, ani kwadratowy.");
        }

        scanner.close();
    }
}
