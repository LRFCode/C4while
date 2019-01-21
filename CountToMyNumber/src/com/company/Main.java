package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter a whole number");
        int maxCount = in.nextInt();

        int count = 0;

        while (count <= maxCount)
        {
            System.out.println("The current number is: " + count);
            count = count + 1;
        }
    }
}
