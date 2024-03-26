public class Exceptions_showcase {
    private static void throw_exception() throws Exception {
        throw new Exception();
    }

    private static void try_catch_finally() {
        System.out.println("### Przykład 1 ###");
        try {
            System.out.println("Zaraz zostanie rzucony wyjątek.");
            throw_exception();
            System.out.println("Ten komunikat się nie wypisze.");
        } catch (Exception e) {
            System.out.println("Przechwycono wyjątek.");
        } finally {
            System.out.println(
                "Ten komunikat wypisze się w ostatniej kolejności.");
        }
        System.out.println("### Koniec przykładu 1 ###");
    }

    private static void try_finally() throws Exception {
        System.out.println("### Przykład 2 ###");
        try {
            System.out.println("Zaraz zostanie rzucony wyjątek.");
            throw_exception();
            System.out.println("Ten komunikat się nie wypisze.");
        } finally {
            System.out.println(
                "Ten komunikat *nie* wypisze się w ostatniej kolejności.");
        }
        System.out.println("Ten komunikat się nie wypisze.");
    }

    private static void try_catch3() {
        System.out.println("### Przykład 3 ###");
        try {
            final int a = 0;
            if (a != 42) {
                throw new ArithmeticException();
            }
            throw new java.io.IOException();
        } catch (java.io.IOException e) {
            System.out.println("Ten komunikat się nie wypisze.");
        } catch (ArithmeticException e) {
            System.out.println("Przechwycono wyjątek.");
        } catch (Exception e) {
            System.out.println("Ten komunikat się nie wypisze.");
        }
        System.out.println("### Koniec przykładu 3 ###");
    }
    
    public static void main(String[] args) {
        try_catch_finally();
        
        try {
            try_finally();
        } catch (Exception e) {
            System.out.println("Przechwycono wyjątek.");            
        } finally {
            System.out.println("### Koniec przykładu 2 ###");
        }

        try_catch3();
    }
}
