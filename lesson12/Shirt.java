package lesson12;

// The Shirt class extends Clothing and adds an additional 'fit' attribute specific to shirts
public class Shirt extends Clothing {
    private char fit = 'U'; // Fit of the shirt ('U' = Unknown by default, could be 'S', 'R', 'L' for Slim, Regular, Loose, etc.)

    // Constructor that initializes all fields, including those from the superclass
    public Shirt(int itemID, String desc, char colourCode, double price, char fit) {
        // Calls the constructor of the Clothing superclass (must be the first statement)
        super(itemID, desc, colourCode, price);
        this.fit = fit; // Sets the fit for this Shirt instance
    }

    // Overloaded constructor that sets only fit and uses a default price
    public Shirt(char fit) {
        this(15.00, fit); // Calls another constructor in this class with default price
    }

    // Overloaded constructor that sets both price and fit
    public Shirt(double price, char fit) {
        super(price);     // Calls the superclass constructor that sets only price
        this.fit = fit;   // Sets the fit value
    }

    // Getter method for fit
    public char getFit() {
        return fit;
    }

    // Setter method for fit
    public void setFit(char fit) {
        this.fit = fit;
    }

    // Overridden display method to include 'fit' information in addition to superclass fields
    @Override
    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
        System.out.println("Fit: " + fit);
    }

    // Optional override of setColourCode, simply calls the superclass version (could be extended in the future)
    @Override
    public void setColourCode(char colourCode) {
        super.setColourCode(colourCode);
    }
}

