package lesson08;

// This class represents a Shirt with a description, color code, and price.
public class Shirt {

    // === Fields ===
    // Description of the shirt (e.g., "Casual long-sleeve shirt")
    public String description;

    // Color code representing the shirt's color (e.g., 'R' for red, 'B' for blue)
    public char colorCode;

    // Price of the shirt
    public double price;

    // === Constructor ===
    // Default constructor initializes the Shirt with placeholder/default values
    public Shirt() {
        description = "--description required--"; // Placeholder until set
        colorCode = 'U'; // 'U' stands for undefined
        price = 1.20;    // Default price is zero
    }

    // === Methods ===
    // Displays the shirt's details in the console
    public void display() {
        System.out.println("Shirt description: " + description);
        System.out.println("Shirt color code: " + colorCode);
        System.out.println("Shirt price: $" + price);
    }
}
