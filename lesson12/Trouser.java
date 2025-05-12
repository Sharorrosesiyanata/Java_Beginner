package lesson12;

// The Trouser class is a subclass of Clothing and adds 'fit' and 'gender' attributes
public class Trouser extends Clothing {
    private char fit;    // Fit type of the trouser (e.g., 'S' = Slim, 'M' = Medium, etc.)
    private char gender; // Gender the trouser is intended for (e.g., 'M' = Male, 'F' = Female, 'U' = Unisex)

    // Constructor that initializes all fields, including inherited ones
    public Trouser(int itemID, String desc, char colourCode, double price, char fit, char gender) {
        super(itemID, desc, colourCode, price); // Call to the superclass constructor
        this.fit = fit;
        this.gender = gender;
    }

    // Getter method for fit
    public char getFit() {
        return fit;
    }

    // Setter method for fit
    public void setFit(char fit) {
        this.fit = fit;
    }

    // Getter method for gender
    public char getGender() {
        return gender;
    }

    // Setter method for gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    // Overridden display method to include fit and gender along with inherited fields
    @Override
    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
        System.out.println("Fit: " + getFit());
        System.out.println("Gender: " + getGender());
    }
}
