package lesson09; // Declares the package this class belongs to

// Defines a public class to test the Shirt class functionality
public class ShirtTest {
    // The main method is the entry point of the program
    public static void main(String[] args) {
        // Creates a Shirt object using the no-argument constructor
        Shirt shirt01 = new Shirt();

        // Declare a variable to hold the colour code
        char colourCode;

        // Get the default colour code from shirt01 and print it
        colourCode = shirt01.getColourCode();
        System.out.println("Get Colour: " + colourCode);

        // Try setting an invalid colour code 'T'
        shirt01.setColourCode('T');

        // Get and print the colour code again (should remain unchanged if 'T' is invalid)
        colourCode = shirt01.getColourCode();
        System.out.println("Set Colour: " + colourCode);

        // Set a valid colour code 'B' (Blue)
        shirt01.setColourCode('B');

        // Get and print the updated colour code
        colourCode = shirt01.getColourCode();
        System.out.println("Set Colour: " + colourCode);

        // Create another Shirt object with description, valid colour code, and price
        Shirt shirt02 = new Shirt("Outdoors Shirt", 'R', 39.99);

        // Print the description and price of the new shirt
        System.out.println("This " + shirt02.getDescr() + " costs R" + shirt02.getPrice());
    }
}
