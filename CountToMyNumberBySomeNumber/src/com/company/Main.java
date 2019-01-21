package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Please enter your Max Count as a whole number.");
        int maxCount = in.nextInt();

        System.out.println("Please enter your Step value as a whole number.");
        int step = in.nextInt();

        int num = 0;

        while (num <= maxCount)
        {
            System.out.println("The current number is: " + num);
            num = num + step;
        }
    }
}
