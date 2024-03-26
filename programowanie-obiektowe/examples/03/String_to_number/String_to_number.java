public class String_to_number {
    public static void main(String[] args) {
        try {
            String str1 = "42";
            int number1 = Integer.parseInt(str1);
            System.out.println("Udało się!");
            
            String str2 = "#42";
            int number2 = Integer.parseInt(str2);
            System.out.println("A tu już nie…");
        } catch (NumberFormatException e) {
            System.out.println("Szczegóły wyjątku: " + e.getMessage());
        }
    }
}
