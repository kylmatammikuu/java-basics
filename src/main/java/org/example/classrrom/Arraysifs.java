package org.example.classrrom;

import java.util.Arrays;

public class Arraysifs {
    public static void main(String[] args) {
        // Array
        int[] numbers = {1, 5, 9, 10, 25, 30};
        System.out.println(numbers[5]); //  print 30
        //numbers[5];
        // System.out.println(numbers[7]);

        int[] ages = new int[10];
        ages[0] = 18;
        ages[3] = 24;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages);

        //String Array
        // String[] names = {"John", "Andrew", "Mary", "Angelica"};
        // System.out.println(Arrays.toString(names));
        //System.out.println(names[3]); //print Angelica

        //Logical Statements /if (condition) /condition = boolean (true or false)

        if (5 < 10) {
            System.out.println("Yes, it's correct");
        }

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Yes, it  is Summer");
        }
        //
        int x = 5;
        if (x > 0) {
            System.out.println("it s a positive number");
        }
        if (x < 0) {
            System.out.println("it s a negative number");
        }

        if (x % 2 == 0) {
            System.out.println("this number can't be divided:" + x);
        }

        /*

        if(true) {
        do smth if true
        } else {
        do smth another if false
        }
         */
        if (x > 0) {
            System.out.println("number is positive:" + x);
        } else {
            System.out.println("number is negative:" + x);
        }
        if (x % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        x = 18;
        //<= (less or equals)
        //>= (more or equals)
        //= (compare)

        if (x < 18) {
            System.out.println("person is nt eligible for voting");
        } else {
            System.out.println("person can go vote");
        }

        isSummer = true;
        boolean isWinter = false;
        boolean isAutumn = false;

        if (isSummer) {
            System.out.println("right, it s Summer");
        } else if (isWinter) {
            System.out.println("right it s Winter");
        } else if (isAutumn) {
            System.out.println("right it s Autumn");
        } else {
            System.out.println("not sure, but it can be spring");
        }
// determine the grade based on a student's score//

        int grade = 5;
        if (grade == 1) {
            System.out.println("unsatisfactory");
        } else if (grade == 4) {
            System.out.println("almost satisfactory");
        } else if (grade == 5) {
            System.out.println("satisfactory");
        } else if (grade == 6) {
            System.out.println("almost good");
        } else if (grade == 7) {
            System.out.println("good");
        } else if (grade == 8) {
            System.out.println("very good");
        } else if (grade == 9) {
            System.out.println("excellent");
        } else if (grade == 10) {
            System.out.println("with distinction");
        } else {
            System.out.println("not accepted");
        }

//classify a given angle as acute, right, obtuse or straight.

        int angle = 200;

        if (angle > 0 && angle < 90) {
            System.out.println("acute ang.");
        } else if (angle == 90) {
            System.out.println("right ang.");
        } else if (angle > 90 && angle < 180) {
            System.out.println("obtuse ang.");
        } else if (angle == 180) {
            System.out.println("straight");
        } else {
            System.out.println("provided angle not supported");
        }
// determine largest of 3 numbers/        


        int[] numberArray = {5, 7, 10};
        numberArray[0] = 5;
        numberArray[1] = 7;
        numberArray[2] = 10;
        int max = 0;

        for (int i = 0; i < numberArray.length; i++) {
        }
        if (numberArray[i] > max) {
            max = numberArray[i];
        }
        System.out.println("maximum is: + max");
    }
 

}
