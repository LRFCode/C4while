package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int num = 1;

        while (num <= 200)
        {
            if (num % 11 == 0)
            {
                System.out.println("The number " + num + " is evenly divisible by 11.");
            }
            num = num + 1;
        }
    }
}
