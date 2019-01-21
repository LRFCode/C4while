package com.company;

public class Main
{
    public static void main(String[] args)
    {
        final int MAGIC_NUMBER = 0;
        java.util.Scanner in = new java.util.Scanner(System.in);

        int numberOfGuesses = 0;

        System.out.println("Please enter the magic whole number.");
        int userNumber = in.nextInt();

        while (userNumber != MAGIC_NUMBER)
        {
            numberOfGuesses = numberOfGuesses + 1;
            System.out.println("FAIL!");
            System.out.println("Try again.");
            userNumber = in.nextInt();
        }

        System.out.println("You entered a number other than zero " + numberOfGuesses + " times.");
    }
}
