import java.util.List;

public interface BookInterface {
    // Default method to display all details [cite: 49]
    default void displayAllDetails(List<Book> books) {
        for (Book b : books) {
            System.out.println(b.toString());
        }
    }

    // Must match the signatures in Book.java exactly
    int numberBooksPerGenre(String genre, List<Book> books);
    double getTotalCost(List<Book> books);
}