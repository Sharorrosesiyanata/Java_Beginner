package lesson10;

//Define a public class named Employees
public class Employees {
    // Declare and initialize two public string variables with names
    public String name1 = "Fred Smith";
    public String name2 = "Sam Smith";

    // Declare and initialize an integer variable for age
    int age = 50;

    // The main method - entry point of the program
    public static void main ( String[] args ) {
        // Create an instance of the Employees class
        Employees cw = new Employees();

        // Call the method to compare the two names
        cw.areNamesEqual();

        // Check if age is less than 12 OR name1 starts with "F"
        if(cw.age < 12 || cw.name1.startsWith("F")) {
            // If either condition is true, print "Found Him!"
            System.out.println("Found Him!");
        } else {
            // If neither condition is true, print "Not Found!"
            System.out.println("Not Found!");
        }

    }

    // A method to check if name1 and name2 are the same
    public void areNamesEqual() {
        if (name1.equals(name2)) {
            // If both names are equal, print "same name."
            System.out.println("same name.");
        }
        else {
            // If names are different, print "Different name"
            System.out.println("Different name");
        }
    }
}
