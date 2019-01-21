package com.company;

public class Main
{
    public static void main(String[] args)
    {
        final int MAGIC_TOTAL = 1000;

        java.util.Scanner in = new java.util.Scanner(System.in);

        int userNumber;

        System.out.println("Please enter a whole number.");
        userNumber = in.nextInt();

        int numbersEntered = 1;
        int total = userNumber;

        while (total <= MAGIC_TOTAL)
        {
            System.out.println("Total not yet reached");
            System.out.println("Please enter another whole number.");

            userNumber = in.nextInt();
            numbersEntered = numbersEntered + 1;
            total = total + userNumber;
        }

        System.out.println("You reached a total of " + total + " to finally obtain of total greater than " + MAGIC_TOTAL + ".");

        System.out.print("You entered " + numbersEntered + " ");

        if (numbersEntered == 1)
        {
            System.out.println("number.");
        }
        else
        {
            System.out.println("numbers.");

        }
    }
}
