// Declare that this class is part of the 'lesson10' package
package lesson10;

// Define a public class named 'Employees'
public class Employees {

    // Declare and initialize two public string variables to hold employee names
    public String name1 = "Fred Smith";  // First employee's name
    public String name2 = "Sam Smith";   // Second employee's name

    // Declare and initialize a private (default access) integer variable for age
    int age = 50;  // Employee's age

    // The main method - this is where the program starts executing
    public static void main(String[] args) {
        // Create an instance of the Employees class to access non-static variables and methods
        Employees cw = new Employees();

        // Call the method that compares the two names and prints the result
        cw.areNamesEqual();

        // Evaluate a condition: is age less than 12 OR does name1 start with "F"?
        if (cw.age < 12 || cw.name1.startsWith("F")) {
            // If either condition is true, print "Found Him!"
            System.out.println("Found Him!");
        } else {
            // If neither condition is true, print "Not Found!"
            System.out.println("Not Found!");
        }
    }

    // Define a method to check if name1 and name2 are equal
    public void areNamesEqual() {
        // Use the equals() method to compare the two string values
        if (name1.equals(name2)) {
            // If the names are exactly the same, print "same name."
            System.out.println("same name.");
        } else {
            // If the names are different, print "Different name"
            System.out.println("Different name");
        }
    }
}
