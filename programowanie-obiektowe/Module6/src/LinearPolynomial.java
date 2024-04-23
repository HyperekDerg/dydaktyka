public class LinearPolynomial extends Polynomial {

    public LinearPolynomial(double[] coefficients) {
        super(coefficients);
    }

    public double slope() {
        if (coefficients.length >= 2) {
            return coefficients[1];
        } else {
            return Double.NaN;
        }
    }

    public String linearDescription() {
        StringBuilder description = new StringBuilder("Wielomian liniowy: ");
        double a, b;
        if (coefficients.length >= 2) {
            a = coefficients[coefficients.length - 1];
            b = coefficients[coefficients.length - 2];
        } else {
            return "Niepoprawny wielomian liniowy: zbyt mało współczynników.";
        }

        description.append(a).append("x");

        if (b >= 0) {
            description.append(" + ").append(b);
        } else {
            description.append(" - ").append(-b);
        }

        return description.toString();
    }

}
