package lesson09; // Declares the package name where this class is located

// Defines a public class named Item
public class Item {
    // Private field to store the price of the item, initialized to 15.50
    private double price = 15.50;

    // Method to adjust the price based on the customer's loyalty discount status
    public void setPrice(Customer cust) {
        // Checks if the customer has a loyalty discount
        if (cust.hasLoyaltyDiscount()) {
            // Applies a 15% discount to the price
            price = price * 0.85;

            // Prints the discounted price with a label
            System.out.println("Price with Discount: R" + price);
        }
        else {
            // If no discount applies, print the original price
            System.out.println("Price is: R" + price);
        }
    }
}
