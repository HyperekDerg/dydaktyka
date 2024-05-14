import java.io.*;
import java.util.*;

class NaturalHistoryEvent implements Comparable<NaturalHistoryEvent> {
    private String description;
    private double yearsAgo;

    public NaturalHistoryEvent(String description, double yearsAgo) {
        this.description = description;
        this.yearsAgo = yearsAgo;
    }

    public String getDescription() {
        return description;
    }

    public double getYearsAgo() {
        return yearsAgo;
    }

    @Override
    public int compareTo(NaturalHistoryEvent other) {
        // Sortowanie malejąco względem czasu (od najstarszego do najnowszego)
        return Double.compare(other.yearsAgo, this.yearsAgo);
    }
}

public class NaturalHistorySorter {
    public static void main(String[] args) {
        // Lista na przechowywanie wydarzeń
        List<NaturalHistoryEvent> events = new ArrayList<>();

        // Wczytywanie danych z pliku
        try (Scanner scanner = new Scanner(new File("dane.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\s+");
                if (parts.length >= 2) {
                    String description = String.join(" ", Arrays.copyOfRange(parts, 0, parts.length - 1));
                    double yearsAgo = Double.parseDouble(parts[parts.length - 1]);
                    events.add(new NaturalHistoryEvent(description, yearsAgo));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Nie można odnaleźć pliku dane.txt");
            return;
        } catch (NumberFormatException e) {
            System.err.println("Nieprawidłowy format liczby w pliku");
            return;
        }

        // Sortowanie z użyciem Collections.sort()
        Collections.sort(events);

        // Wyświetlenie posortowanych wydarzeń
        System.out.println("Posortowane wydarzenia w historii naturalnej:");
        for (NaturalHistoryEvent event : events) {
            System.out.println(event.getDescription() + " - " + event.getYearsAgo() + " lat temu");
        }
    }
}
