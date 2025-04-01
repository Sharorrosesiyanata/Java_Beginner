package lesson07;

public class Lesson07 {
    public static void main(String[] args) {
       String hisName = "Fred Smith";
       String herName = new String("Anne Smith");

       //STRING CONCATENATION
        String myString = "Hello";
        System.out.println(myString);
        myString = myString .concat( " World!");
        System.out.println(myString);
        myString = myString  + "!";
        System.out.println(myString);

        //STRING METHODS
        System.out.println("\nString Methods");
        String hello = "Hello World!";
        int strLength = hello.length();
        System.out.println(strLength);

        String greet = "HOW ".trim();
        String lc = (greet + "DY").toLowerCase();
        System.out.println(lc);

        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf("-");
        System.out.println("Index of first dash: " + idx1);

        int idx2 = phoneNum.indexOf("-", idx1 + 1) ;
        System.out.println("second dash idx: "+idx2);

       // STRING BUILDER
       System.out.println("\n---StringBuilder Class---");
        StringBuilder mySB = new StringBuilder("Hello");
        mySB.append(" World");

        System.out.println(mySB);

        //  PRIMITIVE DATA TYPES
        System.out.println("\n---Primitive Data Types---");
        int count = 15;
        int a, b, c, d;
        //postincrement
        a = count++;
        b = count;
        //preincrement
        c = ++count;
        d = count;
        System.out.println(a + ", " + b + ", " + c + ", " + d);
       // short a, b, c;
        a = 1;
        b = 2;
        c = (short) (a + b);
        System.out.println(a + ", " + b + ", " + c );

        int num1 = 55555;
        int num2 = 66666;
        long num3;
        num3 = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + num3);

        int n1 = 7;
        double n2 = 2;
        double n3 = n1 / n2;
        System.out.println(n1 + " x " + n2 + " = " + n3);

        int myInt;
        long myLong = 78L;
        myInt = (int) myLong;
        System.out.println(myInt);

        double myPercent = 51.9;
        int myInt2 = (int) myPercent;
        System.out.println(myInt2);

        int number1 = 53;
        int number2 = 47;
        byte number3 = (byte)(number1 + number2);
        System.out.println(number1 + " + " + number2 + " = " + number3);
    }
}
