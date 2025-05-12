package lesson11; // Declares that this class is part of the "lesson11" package

public class ArgumentTest {
    public static void main(String[] args) {
        // The 'main' method is the entry point of the Java application
        // 'args' is an array of Strings that stores command-line arguments passed when the program is run

        // Print the first command-line argument (args[0])
        System.out.println("args[0] is " + args[0]);

        // Print the second command-line argument (args[1])
        System.out.println("args[1] is " + args[1]);

        // Convert the first argument from String to integer
        int arg1 = Integer.parseInt(args[5]);

        // Convert the second argument from String to integer
        int arg2 = Integer.parseInt(args[7]);

        // Print the sum of the two integers
        System.out.println("Total is " + (arg1 + arg2));
    }
}

