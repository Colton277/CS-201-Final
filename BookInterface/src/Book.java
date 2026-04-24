import java.util.List;

public abstract class Book implements BookInterface {
    protected String title;
    protected String author;
    protected String genre;
    protected String type;

    public Book(String title, String author, String genre, String type) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.type = type;
    }

    public abstract double getCost();

    @Override
    public int numberBooksPerGenre(String genre, List<Book> books) {
        int count = 0;
        for (Book b : books) {
            if (b.genre.equalsIgnoreCase(genre)) count++;
        }
        return count;
    }

    @Override
    public double getTotalCost(List<Book> books) {
        double total = 0;
        for (Book b : books) {
            total += b.getCost(); // Polymorphism
        }
        return total;
    }

    // Standard Getters [cite: 68-71]
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public String getType() { return type; }
}