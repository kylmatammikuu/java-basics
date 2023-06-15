package org.example;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // for; foreach do while while;
//massives
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
// search one element
        String[] fruits = {"apple", "lemon", "kiwi", "orange", "banana"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals("kiwi")) {
                System.out.println("I found kiwi");
                break;
            }
            //enhaced for
            for (String fruit : fruits) {
                System.out.println("fruit = " + fruit);
            }
            // print numbers from 20 to 40 practice

            for (int i1 = 20; i1 <= 40; i1++) {
                System.out.println(i1);
            }
// count all even numbers from 1 to 100;

            int sum = 0;

            for (int i1 = 1; i1 <= 100; i1++) {
                if (i1 % 2 == 0) {
                    sum = sum + i1;
                }
            }
            System.out.println("sum of even numbers;" + sum);

            // print the multiplications table of a given number 6;

            int numbr = 6;
            for (int i1 = 0; i1 <= 10; i1++) {
                System.out.print(i1 * numbr + " ");
            }

            //todo; multiplication table 10; homework

            // for (int i1 = 1; i1 <= 10; i++) {
            //   for (int i2 = 1; i2 <= 10; i++);
            //}

            //while loop

            int i3 = 10;
            while (i3 > 0) {
                System.out.println("Hello World");
                i3--;
            }

            int j = 0;
            while (j < 10) {
                System.out.println("Hello World");
                j++;
            }

            int k = 0;
            do {
                System.out.println("Hello World");
                k++;
            } while (k < 10);

            //       Scanner myScanner = new Scanner(System.in);
            //       Random randomizer = new Random();
//            int randomNumber = randomizer.nextInt(5);
//
            //          boolean isGuessed = false;
            //        while (!isGuessed) {
            //          System.out.println("Please enter number I guessed:");
            //        int inputNumber = myScanner.nextInt();
            //      if (randomNumber == inputNumber) {
            //        System.out.println("You guessed the number");
            //      isGuessed = true;
            //} else {
            //  System.out.println("Try again");
            //}

//todo: limit guess with 3 times;

            String name = "Käe";
            String reversed = "";
            for (int l = name.length(); l > 0; l--) {
                reversed = reversed + name.charAt(l);
            }
            System.out.println(reversed);

        }
    }
}