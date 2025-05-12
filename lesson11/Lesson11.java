package lesson11;

import java.util.ArrayList;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.FormatStyle;

public class Lesson11 {
    public static void main(String[] args) {

        //************ Working with Dates ************//

//        // Get current date
//        LocalDate myDate = LocalDate.now();
//        System.out.println("Today's date is " + myDate);
//
//        // Subtract 10 months from the current date
//        LocalDate newDate = myDate.minusMonths(10);
//        System.out.println("The new date is " + newDate);
//
//        // Convert to Japanese calendar date
//        JapaneseDate jDate = JapaneseDate.from(myDate);
//        System.out.println("Today's date in Japan is " + jDate);
//
//        // Get current date and time
//        LocalDateTime today = LocalDateTime.now();
//        System.out.println("Today's date (without formatting) is " + today);
//
//        // Format date in ISO format
//        String sdate = today.format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println("Today's date (in ISO_DATE_TIME format) is " + sdate);
//
//        // Format date in localized medium format
//        String fdate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
//        System.out.println("Today's date (in Medium Localized format) is " + fdate);

        //************ 2D Arrays ************//

//        int[][] yearlySales; // Declare 2D array
//        yearlySales = new int[5][4]; // Initialize with 5 rows and 4 columns (e.g. 5 years, 4 quarters)
//        yearlySales[0][0] = 1000;
//        yearlySales[0][1] = 1500;
//        yearlySales[0][2] = 1800;
//        yearlySales[1][0] = 1000;
//        yearlySales[3][3] = 2000;

        //************ While Loop ************//

//        System.out.println("/*");
//        int counter = 0;
//        while(counter < 3) { // Repeats 3 times
//            System.out.println(" *");
//            counter++;
//        }
//        System.out.println("/*");

        //************ For and While Loop ************//

//        System.out.println("**For Loop**");
//        for (int i = 0; i < 5; i++) {
//            System.out.print("i = " + i + ";"); // Iterates from 0 to 4
//        }

//        // Converted to while loop
//        System.out.println("\n**While Loop**");
//        int i = 0;
//        while(i < 5) {
//            System.out.print("i = " + i + ";");
//            i++;
//        }

        //************ Enhanced For Loop ************//

//        String[] names = {"Jada", "Maadimo", "Hazel", "Lesego"};
//        for (String n: names) { // Loops through each element in the array
//            System.out.println(n);
//       }

        //************ Do-While Loop and Factorial ************//

//        factorial(5); // Compute factorial of 5
//        factorial(10); // Compute factorial of 10

        //************ Continue in For Loop ************//

//        String[] names = {"Jada", "Maadimo", "Hazel", "Lesego"};
//        for (int idx = 0; idx < names.length; idx++) {
//            if (names[idx].equalsIgnoreCase("Unavailable")) {
//                continue; // Skip "Unavailable"
//            }
//            System.out.println(names[idx]);
//        }

        //************ Nested While Loop (Random Letter Guessing) ************//

//        String name = "Lenny";
//        String guess = "";
//        int attempts = 0;
//        while(!guess.equalsIgnoreCase(name)) { // Repeat until guessed name matches
//            guess = "";
//            while (guess.length() < name.length()) {
//                char asciiChar = (char) (Math.random() * 26 + 97); // Generate random lowercase letter
//                guess += asciiChar;
//            }
//            attempts++;
//        }
//        System.out.println(name + " found after " + attempts + " tries!");

        //************ Nested For Loop (Pattern Drawing) ************//

//        int h = 4, w = 10; // Height and width
//        for (int row = 0; row < h; row++) {
//            for (int col = 0; col < w; col++) {
//                System.out.print("@"); // Print @ in row
//            }
//            System.out.println(); // New line after each row
//        }

        //************ Initialize and Print 2D Array ************//

//        int sales[][] = new int[3][4]; // 3 years, 4 quarters
//        int[][] salesArray = intiArray(sales); // Initialize with values
//
//        System.out.println("Yearly sales by quarter beginning 2010:");
//        for (int i = 0; i < sales.length; i++) {
//            for (int j = 0; j < sales[i].length; j++) {
//                System.out.println("\tQ" + (j + 1) + " " + sales[i][j]);
//            }
//            System.out.println();
//        }

        //************ ArrayList Manipulation ************//

//        ArrayList<String> names;
//        names = new ArrayList();

//        names.add("Jamie");
//        names.add("Gustav");
//        names.add("Alisa");
//        names.add("Jose");
//        System.out.println(names);

//        names.add(2, "Prashant"); // Insert at index 2
//        System.out.println(names);

//        names.remove(0); // Remove first
//        System.out.println(names);

//        names.remove(names.size() - 1); // Remove last
//        System.out.println(names);

//        names.remove("Gustav"); // Remove by value
//        System.out.println(names);
//    }
//
//    //************ Initialize 2D Array with Incremental Values ************//
//    public static int[][] initArray(int[][] salesArray) {
//        int salesAmt = 100;
//        for (int outer = 0; outer < 3; outer++) {
//            for (int inner = 0; inner < 4; inner++) {
//                salesArray[outer][inner] = salesAmt++; // Assign and increment
//            }
//        }
//        return salesArray;
//    }

    //************ Calculate Factorial using Do-While Loop ************//
//    static void factorial(int target) {
//        int save = target;
//        int fact = 1;
//        do {
//            fact *= target--;
//        } while (target > 0);
//        System.out.println("Factorial for " + save + ": " + fact);
    }
}
