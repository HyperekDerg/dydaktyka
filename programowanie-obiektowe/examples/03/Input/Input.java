import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj wartość całkowitą: ");
        try {
          int a = s.nextInt();
          System.out.println("Podano wartość: " + a);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Podana wartość nie jest prawidłowa.");
        }
        s.close();
    }
}
