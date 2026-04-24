import java.util.ArrayList;
import java.util.List;

public class PrintedBook extends Book {
    private int pages; // Requirement 3: Field for pages [cite: 58]
    private static List<PrintedBook> lastThreePrinted = new ArrayList<>();

    public PrintedBook(String title, String author, String genre, int pages) {
        super(title, author, genre, "PrintedBook");
        this.pages = pages;
        updateLastThree(this);
    }

    // Requirement 3: Compute cost at $0.50 per page [cite: 60]
    @Override
    public double getCost() {
        return pages * 0.50;
    }

    private static void updateLastThree(PrintedBook newBook) {
        if (lastThreePrinted.size() == 3) lastThreePrinted.remove(0);
        lastThreePrinted.add(newBook);
    }

    // Requirement 3: Display last three printed books [cite: 61]
    public static void displayLastThree() {
        System.out.println("\n--- Last 3 Printed Books ---");
        for (PrintedBook pb : lastThreePrinted) System.out.println(pb);
    }

    public int getPages() { return pages; }

    @Override
    public String toString() {
        return String.format("Type: Printed | Title: %s | Author: %s | Pages: %d | Cost: $%.2f",
                title, author, pages, getCost());
    }
}