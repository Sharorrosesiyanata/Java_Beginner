package lesson06;

public class lesson06 {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();

//      CHANGING FIELD VALUE
        cust1.age = 40;
        cust2.name = "Duke";

//      CALLING METHOD(S) ON OUR OBJECT
        cust1.displayCustomer();
        cust2.displayCustomer();

//      accessing another class's method
        cust1.cart.Cancel();

//        Item[] items = {new Item(), new Item(), new Item()};

    }
}

    class Customer {
    //  fields
        public String name = "Junior Duke";
        public Cart cart = new Cart();
        public int custID = 1205;
        public String address;
        public int orderNum;
        public int age;

    //   method(s)
    public void displayCustomer () {
        System.out.println("Customer: " + name);
    }
}

    class Cart {
    public Item[] items;
    public String date;
    public double total;

    public void Cancel() {
        System.out.println("Cancelling order...");
    }
    }

    class Item {

    }
