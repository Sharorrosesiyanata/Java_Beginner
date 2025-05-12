package lesson05;


public class lesson05 {
    public static void main(String[] args) {
//        int attendees = 4;
//        boolean largeVenue;
//
//        if (attendees >= 5) {
//            largeVenue = true;
//            System.out.println("We are going to need a large venue");
//        }else {
//            largeVenue = false;
//            System.out.println("No need for a large venue");
//        }

//        WORKING WITH ARRAYS
//        String itemDesc1 = "Shirt";
//        String itemDesc2 = "Trousers";
//        String itemDesc3 = "Scarf";
//
//        //USING AN ARRAY
//        String[] items = {"Shirt", "Trousers", "Scarf"};
//
//      int[] numbers = {27, 12, 82, 70, 54, 1, 30, 34};
//
//        String[] names = {"Mary", "Bob", "Carlos"};
//
//       // String[] names = {};
//        names[0] = "Mary";
//        names[1] = "Bob";
//        names[2] = "Carlos";
//
//        int[] ages = {25, 27, 48};
//
//        int[] ages2 = new int[3];
//        ages2[0] = 25;
//        ages2[1] = 27;
//        ages2[2] = 48;
//        System.out.println(names[0] + " is " + ages[0] + " years old ");

//        PROCESSING ARRAY ELEMENTS
        String[] names = {"George", "Jill", "Xinyi", "Ravi"};

        for (String n : names) {
            System.out.println("Name is " + n);
        }
        System.out.println();

//        USING LOOPS TO PROCESS AN ARRAY
        int passmark = 12;
        boolean passed = false;
        int[] scores = {4,6,2,8,12,35,9};

        for(int sea : scores) {
            if (sea >= 12) {
                passed = true;
                break;
            }
        }
          System.out.println("At least one learner passed? " + passed);

        int[] grades = { 80, 70, 90, 100, 75};
        for(int grade : grades);
        System.out.println(grades);
        }
    }

