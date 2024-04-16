import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uniq {
    private String inputFilePath;
    private String outputFilePath;
    private Scanner scanner;

    public Uniq() {
        this.scanner = new Scanner(System.in);
    }

    public void setInputFileName() {
        System.out.print("Podaj ścieżkę pliku który chcesz odczytać: ");
        this.inputFilePath = scanner.nextLine();
    }

    public void setOutputFileName() {
        System.out.print("Podaj ścieżkę pliku który chcesz zapisać: ");
        this.outputFilePath = scanner.nextLine();
    }

    public void closeScanner() {
        scanner.close();
    }

    public void processFile() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(inputFilePath));

        List<String> filteredLines = new ArrayList<>();
        String prevLine = null;
        for (String line : lines) {
            if (!line.equals(prevLine)) {
                filteredLines.add(line);
            }
            prevLine = line;
        }

        Files.write(Paths.get(outputFilePath), filteredLines);
    }

    public static void main(String[] args) {
        Uniq uniq = new Uniq();
        try {
            uniq.setInputFileName();
            Path inputFile = Paths.get(uniq.inputFilePath);
            if (!Files.exists(inputFile) || !Files.isRegularFile(inputFile)) {
                System.out.println("Plik o podanej nazwie nie istnieje.");
                return;
            }
            uniq.setOutputFileName();
            uniq.processFile();
            System.out.println("Plik zapisany prawidłowo");
        } catch (IOException e) {
            System.out.println("Pojawił się błąd podczas wykonywania operacji na pliku: " + e.getMessage());
        } finally {
            uniq.closeScanner();
        }
    }
}
