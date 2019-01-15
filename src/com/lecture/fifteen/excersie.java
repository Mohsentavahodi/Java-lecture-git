package com.lecture.fifteen;


import java.util.Random;
import java.util.Scanner;

public class excersie {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int Useraction, Systemaction;

        System.out.println("Enter role(0=rock;1=paper;2=scissors);");
        Useraction = scanner.nextInt();

        //** checking if user is 0 1 2
        if (Useraction < 0 || Useraction > 2) ;
        System.out.println("Not acceptable , please try again");
        System.exit(0);

        Systemaction = random.nextInt(5);
        if (Useraction == Systemaction) ;
        {
            System.out.println("Tie, again go for it ");
            System.exit(0);

        }
    }
}
