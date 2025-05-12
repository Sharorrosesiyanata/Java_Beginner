package lesson09; // Declares the package name where this class belongs

// Defines a public class named Customer
public class Customer {
    // Private field to store the customer's ID number
    private int ID;

    // Private field to indicate whether the customer has a loyalty discount
    private boolean loyaltyDiscount;

    // Constructor that initializes the Customer object with an ID
    public Customer(int ID) {
        this.ID = ID; // Sets the instance variable ID to the provided ID value
    }

    // Method to set whether the customer is eligible for a loyalty discount
    public void setLoyaltyPoints(boolean loyaltyPoints){
        this.loyaltyDiscount = loyaltyPoints; // Sets the loyaltyDiscount field to the given boolean value
    }

    // Method to check if the customer has a loyalty discount
    public boolean hasLoyaltyDiscount() {
        return loyaltyDiscount; // Returns the value of loyaltyDiscount (true or false)
    }
}
