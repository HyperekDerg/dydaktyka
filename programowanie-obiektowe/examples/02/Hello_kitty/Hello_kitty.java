public class Hello_kitty {
    public static void main(String[] args) {
        String s1 = "Hello, kitty!";
        System.out.println("Zawartość s1: " + s1);

        String s2 = "Hello, kitty!";
        System.out.println("Zawartość s2: " + s2);

        if (s1.equals(s2)) {
            System.out.println("Obydwa napisy mają identyczną zawartość.");
        }

        for (int i = 0; i < s1.length(); ++i) {
            System.out.print(s1.charAt(i));
        }
        System.out.println();

        for (char c : s2.toCharArray()) {
            System.out.print(c);
        }
        System.out.println();
    }
}
