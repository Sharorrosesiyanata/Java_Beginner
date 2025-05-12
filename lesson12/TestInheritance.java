package lesson12;

public class TestInheritance {
    public static void main(String[] args) {
        // Demonstrates polymorphism: using a superclass reference to refer to a subclass object
        Clothing shirt01 = new Shirt(1, "hoodie", 'R', 99.90, 'L');  // Shirt object referenced as Clothing
        Shirt shirt02 = new Shirt(20.00, 'M');                       // Shirt object using overloaded constructor
        Clothing trouser01 = new Trouser(2, "slacks", 'T', 199.90, 'M', 'F'); // Trouser object as Clothing

        // Calls overridden display methods
        shirt01.display();  // Calls Shirt.display()
        shirt02.display();  // Calls Shirt.display()

        System.out.println(); // Print a blank line for readability

        // Calls getter and overridden display method on trouser01
        trouser01.getItemID();  // Retrieves item ID (not printed here)
        trouser01.display();    // Calls Trouser.display() method

        // Calls method to display details specific to Trouser, requires casting
        displayDetails(trouser01);
    }

    // Method to display details of a Clothing object,
    // and cast it to a Trouser if it's an instance of that subclass
    public static void displayDetails(Clothing c1) {
        // Casts the Clothing reference to Trouser (assumes c1 is a Trouser)
        // First line is redundant but harmless:
        ((Trouser)c1).getFit();

        // Checks if c1 is actually a Trouser before accessing subclass-specific methods
        if(c1 instanceof Trouser) {
            char fitcode = ((Trouser)c1).getFit(); // Safe cast
            System.out.println("Fit: " + fitcode); // Displays the fit value
        }
    }
}
