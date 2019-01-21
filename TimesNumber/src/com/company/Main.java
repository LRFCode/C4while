package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Please enter a whole number:");

        int number = input.nextInt();
        int count = 1;

        while (count <= 10)
        {
            int answer = number * count;
            System.out.printf(number + " X %2d = %2d%n", count, answer);
            count = count + 1;
        }
    }
}
