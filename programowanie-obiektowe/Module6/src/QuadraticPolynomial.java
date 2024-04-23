public class QuadraticPolynomial extends Polynomial {

    public QuadraticPolynomial(double[] coefficients) {
        super(coefficients);
    }

    public String extremum() {
        if (coefficients.length >= 3) {
            double a = coefficients[2];
            double b = coefficients[1];
            double c = coefficients[0];

            double extremumX = -b / (2 * a);
            double extremumY = a * extremumX * extremumX + b * extremumX + c;

            return "Ekstremum funkcji: (" + extremumX + ", " + extremumY + ")";
        } else {
            return "To nie jest wielomian kwadratowy.";
        }
    }

    public String quadraticDescription() {
        StringBuilder description = new StringBuilder("Wielomian kwadratowy: ");
        double a = coefficients[2];
        double b = coefficients[1];
        double c = coefficients[0];

        if (a != 1) {
            description.append(a).append("x^2");
        } else {
            description.append("x^2");
        }

        if (b >= 0) {
            description.append(" + ").append(b).append("x");
        } else {
            description.append(" - ").append(-b).append("x");
        }

        if (c >= 0) {
            description.append(" + ").append(c);
        } else {
            description.append(" - ").append(-c);
        }

        return description.toString();
    }
}
