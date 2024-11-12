import java.util.Scanner;

// Book class represents the book being purchased
class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Purchase class represents a purchase transaction
class Purchase {
    private Book book;
    private String customerEmail;
    private int quantity;

    // Constructor
    public Purchase(Book book, String customerEmail, int quantity) {
        this.book = book;
        this.customerEmail = customerEmail;
        this.quantity = quantity;
    }

    // Getters and Setters
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate total price
    public double getTotalPrice() {
        return book.getPrice() * quantity;
    }
}

// PurchaseService class handles the logic of processing a purchase
class PurchaseService {

    // Method to process the purchase
    public String processPurchase(Purchase purchase) {
        // Simulate purchase processing (e.g., updating database, sending confirmation email)
        System.out.println("Processing purchase for: " + purchase.getCustomerEmail());
        System.out.println("Book: " + purchase.getBook().getTitle());
        System.out.println("Quantity: " + purchase.getQuantity());
        System.out.println("Total Price: " + purchase.getTotalPrice());

        // Return a confirmation message
        return "Purchase successful!";
    }
}

// Main application for simulating the purchase process
public class PurchaseApplication {

    public static void main(String[] args) {
        // Create the Book object
        Book book = new Book("Java Programming", "John Doe", 29.99);

        // Create the PurchaseService object
        PurchaseService purchaseService = new PurchaseService();

        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Get user email
        System.out.println("Enter your email address:");
        String email = scanner.nextLine();

        // Get quantity from the user
        System.out.println("Enter the quantity of the book you want to purchase:");
        int quantity = scanner.nextInt();

        // Create the Purchase object
        Purchase purchase = new Purchase(book, email, quantity);

        // Process the purchase
        String message = purchaseService.processPurchase(purchase);

        // Display the confirmation message
        System.out.println(message);

        // Close the scanner
        scanner.close();
    }
}