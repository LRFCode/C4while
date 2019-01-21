package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter your first whole number.");
        int firstNumber = in.nextInt();

        System.out.println("Please enter your second whole number.");
        int secondNumber = in.nextInt();

        int currentNumber = firstNumber;

        if (firstNumber < secondNumber)
        {
            while (currentNumber <= secondNumber)
            {
                System.out.println(currentNumber);
                currentNumber = currentNumber + 1;
            }
        }
        else if (firstNumber > secondNumber)
        {
            while (currentNumber >= secondNumber)
            {
                System.out.println(currentNumber);
                currentNumber = currentNumber - 1;
            }
        }
    }
}
