import java.util.Scanner;

public class Rot13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tekst: ");
        String input = scanner.nextLine();

        String encryptedText = encryptROT13(input);
        System.out.println("Wynik: " + encryptedText);

        scanner.close();
    }

    public static String encryptROT13(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) (((c - base + 13) % 26) + base));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
