package ex04_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        double price = 50;
        double tax = 20;
        int num1 = 5;
        double total = price * num1 / tax;
        String message = "The amount of tax taken from the products i bought was" + " " + total + " " + "dollars!";
        System.out.println(message);
    }
}
