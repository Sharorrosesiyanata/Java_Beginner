package lesson09; // Declares the package name

// Defines a public class named Order
public class Order {
    // The main method is the entry point of the program
    public static void main(String args[]) {
        // Creates a new Customer object with ID 1
        Customer cust = new Customer(1);

        // Creates a new Item object
        Item item = new Item();

        // Displays the price of the item for the customer (no discount yet)
        item.setPrice(cust);

        // Sets the customer's loyalty status to true (eligible for discount)
        cust.setLoyaltyPoints(true);

        // Displays the price of the item again, now with the loyalty discount applied
        item.setPrice(cust);
    }
}
