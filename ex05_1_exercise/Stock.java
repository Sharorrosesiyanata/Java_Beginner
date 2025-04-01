package ex05_1_exercise;

public class Stock {
    public static void main(String[] args) {
        int quantity = 1;
        boolean outOfStock;

        if (quantity > 1) {
            outOfStock = true;
            System.out.println("Item is unavailable!");

        }else {
          outOfStock = false;
          System.out.println("The total cost is R50");
        }
    }
}
