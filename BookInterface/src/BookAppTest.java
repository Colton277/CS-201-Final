import java.util.ArrayList;
import java.util.List;

public class BookAppTest {
    public static void main(String[] args) {
        List<Book> myLibrary = new ArrayList<>();

        // Testing Test Cases: Large Values & Edge Cases [cite: 108-116]
        myLibrary.add(new PrintedBook("Giant Novel", "Writer A", "Fiction", 1000)); // $500.00
        myLibrary.add(new AudioBook("Long Listen", "Writer B", "Fiction", 2000));  // $500.00
        myLibrary.add(new PrintedBook("Empty Book", "Writer C", "Mystery", 0));    // $0.00

        // Adding more to test "Last N Logic" [cite: 103-107]
        myLibrary.add(new AudioBook("Morning News", "Journalist", "News", 30));
        myLibrary.add(new PrintedBook("History 101", "Historian", "History", 300));
        myLibrary.add(new AudioBook("Podcase X", "Host", "Crime", 45));
        myLibrary.add(new PrintedBook("Java Basics", "Coder", "Tech", 150));
        myLibrary.add(new AudioBook("Final Audio", "Author Z", "Fiction", 60));

        // Demonstration
        System.out.println("--- All Stored Books ---");
        myLibrary.get(0).displayAllDetails(myLibrary);

        System.out.println("\nTotal System Cost: $" + myLibrary.get(0).getTotalCost(myLibrary));
        System.out.println("Fiction Books Count: " + myLibrary.get(0).numberBooksPerGenre("Fiction", myLibrary));

        // Display Last N Requirements [cite: 106-107]
        PrintedBook.displayLastThree();
        AudioBook.displayLastThree();

        // Demonstration of Search [cite: 67-71]
        System.out.println("\n--- Search Results: Author 'Writer A' ---");
        for (Book b : myLibrary) {
            if (b.getAuthor().equalsIgnoreCase("Writer A")) System.out.println(b);
        }
    }
}