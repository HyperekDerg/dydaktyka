public class Polynomial {
    protected double[] coefficients;

    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public double eval(double x) {
        double result = 0.0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }

    public int deg() {
        return coefficients.length - 1;
    }

    public String description() {
        int degree = deg();
        StringBuilder description = new StringBuilder("Wielomian stopnia " + degree + ": ");
        boolean isFirstTerm = true;

        for (int i = degree; i >= 0; i--) {
            double coefficient = coefficients[i];

            if (coefficient != 0) {
                if (!isFirstTerm) {
                    description.append(coefficient > 0 ? " + " : " - ");
                } else {
                    isFirstTerm = false;
                }

                if (Math.abs(coefficient) != 1 || i == 0) {
                    description.append(Math.abs(coefficient));
                }

                if (i > 0) {
                    description.append("x");
                    if (i > 1) {
                        description.append("^").append(i);
                    }
                }
            }
        }
        return description.toString();
    }
}
