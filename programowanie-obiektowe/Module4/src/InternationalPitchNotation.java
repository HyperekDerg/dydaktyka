class InternationalPitchNotationException extends Exception {
    public InternationalPitchNotationException(String message) {
        super(message);
    }
}

public class InternationalPitchNotation {
    private String[] noteNames = { "C", "C♯", "D", "D♯", "E", "F", "F♯", "G", "G♯", "A", "A♯", "B" };
    private String noteName;
    private int octave;

    public InternationalPitchNotation(String notation) throws InternationalPitchNotationException {
        parseNotation(notation);
    }

    private void parseNotation(String notation) throws InternationalPitchNotationException {
        if (notation.length() < 2) {
            throw new InternationalPitchNotationException("Nieprawidłowy format zapisu");
        }

        String noteName = notation.substring(0, notation.length() - 1);
        String octaveStr = notation.substring(notation.length() - 1);

        if (!isValidNoteName(noteName)) {
            throw new InternationalPitchNotationException("Nieprawidłowa nazwa nuty");
        }

        try {
            this.octave = Integer.parseInt(octaveStr);
        } catch (NumberFormatException e) {
            throw new InternationalPitchNotationException("Nieprawidłowa oktawa");
        }

        this.noteName = noteName;
    }

    private boolean isValidNoteName(String noteName) {
        for (String name : noteNames) {
            if (name.equals(noteName)) {
                return true;
            }
        }
        return false;
    }

    public String getNoteName() {
        return noteName;
    }

    public int getOctave() {
        return octave;
    }

    public void setNoteName(String noteName) throws InternationalPitchNotationException {
        if (!isValidNoteName(noteName)) {
            throw new InternationalPitchNotationException("Błędna nazwa nuty");
        }
        this.noteName = noteName;
    }

    public void setOctave(int octave) {
        this.octave = octave;
    }

    @Override
    public String toString() {
        return noteName + octave;
    }

    public static void main(String[] args) {
        try {
            InternationalPitchNotation ipn = new InternationalPitchNotation("G♯3");
            System.out.println("Nazwa nuty: " + ipn.getNoteName());
            System.out.println("Oktawa: " + ipn.getOctave());
            ipn.setNoteName("F♯");
            ipn.setOctave(4);
            System.out.println("Zmodyfikowany IPN: " + ipn);
        } catch (InternationalPitchNotationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
