package com.lecture.twelve;

import java.util.Random;
import java.util.Scanner;

public class NumberGusingGame {
    public static void main(String[] args) {
        System.out.println("Please enter your number");
        Random rand = new Random();
        int number = rand.nextInt(101);
        System.out.println("system print out number" + number);

        System.out.println("Please enter your number");
        int number1 = rand.nextInt(101);
        System.out.println("number is " + number1);
        Scanner scanner = new Scanner(System.in);
        int attemptcount = 0;
        while (true) {
            System.out.println("print number ");
            int number2 = scanner.nextInt();
            if (number2 == number1) {
                System.out.println("your Number is correct");
                break;
            } else {
                System.out.println("Number is not correct");
                attemptcount++;
                System.out.println("This was your attempt "+ attemptcount);
                int diffrence = Math.abs((number1-number2));
                if (diffrence<5) {
                    System.out.println("ït is burning");

                }
                else if (diffrence < 10) {
                    System.out.println("it is very hard");
                }
                else {
                    System.out.println("it is cold");
                }

            }

        }



    }
}
