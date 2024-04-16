import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Modern {
    public static void main(String[] args) {
        final Path filepath = Paths.get("file.txt");
        final String poetry =
            "hello, kitty\n"
            + "my old friend\n"
            + "we are drinking\n"
            + "milk again\n";
        try {
            Files.write(filepath, poetry.getBytes());
            List<String> verses = Files.readAllLines(filepath);
            for (String line : verses) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
