public class Main {
    public static void main(String[] args) {
        try {
            throw new Custom_exception_1("Własny wyjątek");
        } catch (Custom_exception_1 e) {
            System.out.println("Złapano własny wyjątek.");
        } catch (Exception e) {
            System.out.println("Złapano wyjątek Exception.");
        }
    }
}
