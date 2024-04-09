public class Main {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception("42");
            } catch (Exception e) {
                if (e.getMessage().equals("42")) {
                    throw new Custom_exception_2("Własny wyjątek", e);
                }
            }
        } catch (Custom_exception_2 e) {
            System.out.println("Złapano: " + e.getMessage());
            System.out.println("Szczegóły: " + e.getCause());
        } catch (Exception e) {
            System.out.println("Złapano wyjątek Exception.");
        }
    }
}
