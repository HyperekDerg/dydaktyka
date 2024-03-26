public class Division_by_zero {
    public static void main(String[] args) {
        try {
            int a = 42;                // Uwaga: Dla typu double nie nastąpi
            int b = 0;                 // rzucanie wyjątku! (Obliczenia
            System.out.println(a / b); // zmiennoprzecinkowe obsługują specjalną
                                       // wartość "nieskończoność".)
        } catch (ArithmeticException e) {
            System.out.println("Szczegóły wyjątku: " + e.getMessage());
        }
    }
}
