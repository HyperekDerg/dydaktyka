import java.util.Random;

public class Pendulum {
    private double dlugosc_nici;

    public Pendulum(double dlugosc_nici) {
        this.dlugosc_nici = dlugosc_nici;
    }

    public double getLength() {
        return dlugosc_nici;
    }

    public void setLength(double x) {
        dlugosc_nici = x;
    }

    public double getPeriod() {
        return 2 * Math.PI * Math.sqrt(dlugosc_nici / 9.806665);
    }

    public static void main(String[] args) {
        Random random = new Random();
        double randomLength = 1 + (10 - 1) * random.nextDouble();

        Pendulum pendulum = new Pendulum(randomLength);
        double period = pendulum.getPeriod();

        System.out.println("Długość nici: " + pendulum.getLength());
        System.out.println("Długość okresu: " + period);
        System.out.println("\n#Śledzenie okresu z zmienną długości#");

        for (int i = 0; i < 5; i++) {
            pendulum.setLength(pendulum.getLength() + pendulum.getLength() / 2);
            System.out.println("Długość nici: " + pendulum.getLength());
            System.out.println("Długość okresu: " + pendulum.getPeriod());
        }
    }
}
