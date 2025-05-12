package lesson09; // Declares the package this class belongs to

// Defines a public class named Shirt
public class Shirt {
    // Private fields with default values
    private int shirtID = 0;                         // ID of the shirt (not used in constructors)
    private String descr = "-description required-"; // Description of the shirt
    private char colourCode = 'U';                   // Colour code: default is 'U' for unknown
    private double price = 0.0;                      // Price of the shirt

    // Constructor with no arguments — sets colour code to 'U' (unknown)
    public Shirt() {
        setColourCode('U');
    }

    // Constructor with one argument — sets the colour code
    public Shirt(char colourCode) {
        setColourCode(colourCode);
    }

    // Constructor with two arguments — sets colour code and price
    public Shirt(char colourCode, double price) {
        this(colourCode);     // Calls the one-argument constructor to set colour code
        setPrice(price);      // Sets the price
    }

    // Constructor with three arguments — sets description, colour code, and price
    public Shirt(String descr, char colourCode, double price) {
        setDescr(descr);          // Sets the description
        setColourCode(colourCode); // Sets the colour code
        setPrice(price);           // Sets the price
    }

    // Getter method for colour code
    public char getColourCode() {
        return colourCode;
    }

    // Setter method for colour code with validation
    public void setColourCode(char newCode) {
        // Valid colour codes are R (Red), G (Green), B (Blue)
        if(newCode == 'R') {
            colourCode = newCode;
            return;
        }
        if(newCode == 'G') {
            colourCode = newCode;
            return;
        }
        if(newCode == 'B') {
            colourCode = newCode;
            return;
        }
        // If invalid code, print warning message
        System.out.println("Invalid colourCode. Use R, G or B");
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    // Setter method for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter method for description
    public String getDescr() {
        return descr;
    }

    // Setter method for description
    public void setDescr(String descr) {
        this.descr = descr;
    }
}
