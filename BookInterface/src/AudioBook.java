import java.util.ArrayList;
import java.util.List;

public class AudioBook extends Book {
    private int durationInMinutes;
    private static List<AudioBook> lastThreeAudio = new ArrayList<>();

    public AudioBook(String title, String author, String genre, int duration) {
        super(title, author, genre, "AudioBook");
        this.durationInMinutes = duration;
        updateLastThree(this);
    }

    @Override
    public double getCost() {
        return durationInMinutes * 0.25;
    }

    private static void updateLastThree(AudioBook newBook) {
        if (lastThreeAudio.size() == 3) lastThreeAudio.remove(0);
        lastThreeAudio.add(newBook);
    }

    public static void displayLastThree() {
        System.out.println("\n--- Last 3 AudioBooks ---");
        for (AudioBook ab : lastThreeAudio) System.out.println(ab);
    }

    public int getDuration() { return durationInMinutes; }

    @Override
    public String toString() {
        return String.format("Type: Audio | Title: %s | Author: %s | Duration: %d min | Cost: $%.2f",
                title, author, durationInMinutes, getCost());
    }
}