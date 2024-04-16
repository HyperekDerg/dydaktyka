import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Classic {
    private static String read(String filename) throws IOException {
        FileReader r = new FileReader(filename);
        String res = "";
        int c;
        while ((c = r.read()) != -1) {
            res += (char) c;
        }
        r.close();
        return res;
    }

    private static void write(String filename, String str) throws IOException {
        FileWriter w = new FileWriter(filename);
        w.write(str);
        w.close();
    }
    
    public static void main(String[] args) {
        final String filename = "file.txt";
        final String text = "Hello, kitty!";
        try {
            write(filename, text);
            String str = read(filename);
            if (str.equals(text)) {
                System.out.println("Zapis i odczyt prawidłowy.");
            }
        } catch (IOException e) {
            // Uwaga: Zastosowano poniżej strumień błędów System.err.
            System.err.println(e.getMessage());
        }
    }
}
