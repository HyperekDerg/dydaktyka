public class InternationalPitchNotationTester {
    public static void main(String[] args) {
        testValidNotation("G♯3");
        testInvalidNotation("M♯4");
        testInvalidNotation("F#");
        testInvalidNotation("C14");
    }

    public static void testValidNotation(String notation) {
        try {
            InternationalPitchNotation ipn = new InternationalPitchNotation(notation);
            System.out.println("Nieprawidłowy zapis: " + notation);
            System.out.println("Nazwa nuty: " + ipn.getNoteName());
            System.out.println("Oktawa: " + ipn.getOctave());
        } catch (InternationalPitchNotationException e) {
            System.out.println("Błąd dla zapisu" + notation + ": " + e.getMessage());
        }
    }

    public static void testInvalidNotation(String notation) {
        try {
            InternationalPitchNotation ipn = new InternationalPitchNotation(notation);
            System.out.println("Error: " + notation + " jest uważany za prawidłowy, ale powinien być nieprawidłowy");
        } catch (InternationalPitchNotationException e) {
            System.out.println("Nieprawidłowy zapis: " + notation);
            System.out.println("Error message: " + e.getMessage());
        }
    }
}
