public class Oczekiwania {
    public static void main(String[] args) {
        try {
            int result = 12 / 0;
            System.out.println("Wynik: " + result);
        } catch (ArithmeticException e) {
            try {
                throw new Exception("Hello");
            } catch (Exception nestedException) {
                throw new RuntimeException(nestedException.getMessage() + ", kitty!");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
