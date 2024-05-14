import java.util.*;

class Disc {
    private String title;
    private int durationSeconds;

    public Disc(String title, int durationSeconds) {
        this.title = title;
        this.durationSeconds = durationSeconds;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Duration: " + durationSeconds + " seconds";
    }
}

class CD extends Disc {
    private String artist;

    public CD(String title, int durationSeconds, String artist) {
        super(title, durationSeconds);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist;
    }
}

class DVD extends Disc {
    private String regionCode;

    public DVD(String title, int durationSeconds, String regionCode) {
        super(title, durationSeconds);
        this.regionCode = regionCode;
    }

    public String getRegionCode() {
        return regionCode;
    }

    @Override
    public String toString() {
        return super.toString() + ", Region Code: " + regionCode;
    }
}

public class DiscCollection {
    public static void main(String[] args) {
        List<Disc> collection = new ArrayList<>();

        collection.add(new CD("Abbey Road", 3200, "The Beatles"));
        collection.add(new DVD("The Shawshank Redemption", 9120, "Region 2"));
        collection.add(new CD("Back in Black", 2600, "AC/DC"));
        collection.add(new DVD("The Godfather", 10500, "Region 1"));

        System.out.println("Collection:");
        for (Disc disc : collection) {
            System.out.println(disc);
        }
    }
}
