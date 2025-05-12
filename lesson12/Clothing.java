package lesson12;

// The Clothing class represents an item of clothing with properties like ID, description, colour, and price.
public class Clothing {
    // Fields to store clothing item information
    private int itemID = 0;                          // Unique identifier for the clothing item
    private String desc = "-description required-";  // Description of the item
    private char colourCode = 'U';                   // Colour code ('U' stands for Unknown by default)
    private double price = 0.0;                      // Price of the item

    // Constructor that initializes all fields
    public Clothing(int itemID, String desc, char colourCode, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colourCode = colourCode;
        this.price = price;
    }

    // Constructor that only sets the price (other fields remain with default values)
    public Clothing(double price) {
        this.price = price;
    }

    // Getter for itemID
    public int getItemID() {
        return itemID;
    }

    // Setter for itemID
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    // Getter for description
    public String getDesc() {
        return desc;
    }

    // Setter for description
    public void setDesc(String desc) {
        this.desc = desc;
    }

    // Getter for colour code
    public char getColourCode() {
        return colourCode;
    }

    // Setter for colour code
    public void setColourCode(char colourCode) {
        this.colourCode = colourCode;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display the details of the clothing item
    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
    }
}
