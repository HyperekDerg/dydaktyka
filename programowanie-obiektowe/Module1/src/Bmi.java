public class Bmi {
    private double masa;
    private double wzrost;

    public Bmi(double masa, double wzrost) {
        this.masa = masa;
        this.wzrost = wzrost;
    }

    public double bmi() {
        return masa / (Math.pow(wzrost, 2));
    }

    public double get_masa() {
        return masa;
    }

    public double get_wzrost() {
        return wzrost;
    }

    public String resultString(double bmi) {
        String wynik;
        if (bmi < 16) {
            wynik = "wygłodzenie";
        } else if (bmi >= 16 && bmi < 17) {
            wynik = "wychudzenie";
        } else if (bmi >= 17 && bmi < 18.5) {
            wynik = "niedowaga";
        } else if (bmi >= 18.5 && bmi < 25) {
            wynik = "optimum";
        } else if (bmi >= 25 && bmi < 30) {
            wynik = "nadwaga";
        } else if (bmi >= 30 && bmi < 35) {
            wynik = "otyłość I stopnia";
        } else if (bmi >= 35 && bmi < 40) {
            wynik = "otyłość II stopnia";
        } else {
            wynik = "otyłość III stopnia";
        }
        return wynik;
    }

    public static void main(String[] args) {
        Bmi b = new Bmi(64, 1.8);
        double calculatedBMI = b.bmi();
        System.out.println("Masa: " + b.get_masa());
        System.out.println("Wzrost: " + b.get_wzrost());
        System.out.println("Obliczone BMI: " + calculatedBMI);
        System.out.println("Wynik: " + b.resultString(calculatedBMI));
    }
}
8.5) {
    wynik = "niedowaga";
} else if (bmi >= 18.5 && bmi < 25) {
    wynik = "optimum";
} else if (bmi >= 25 && bmi < 30) {
    wynik = "nadwaga";
} else if (bmi >= 30 && bmi < 35) {
    wynik = "otyłość I stopnia";
} else if (bmi >= 35 && bmi < 40) {
    wynik = "otyłość II stopnia";
} else {
    wynik = "otyłość III stopnia";
}
return wynik;
}

public static void main(String[] args) {
Bmi b = new Bmi(64, 1.8);
double calculatedBMI = b.bmi();
System.out.println("Masa: " + b.get_masa());
System.out.println("Wzrost: " + b.get_wzrost());
System.out.println("Obliczone BMI: " + calculatedBMI);
System.out.println("Wynik: " + b.resultString(calculatedBMI));
}
}
