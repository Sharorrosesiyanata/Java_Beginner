package lesson08;

public class Lesson08 {
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
    }
}
public class Shirt {
    //Fields
    public String description;
    public char colorCode;
    public double price;

    //Constructor
    public Shirt() {
        description = "--description required--";
        colorCode = 'U';
        price = 0.00;
    }

    //Methods
    public void display() {
        System.out.println("Shirt description:" + description);
        System.out.println("Shirt description:" + colorCode);
        System.out.println("Shirt description:" + price);
    }
}




