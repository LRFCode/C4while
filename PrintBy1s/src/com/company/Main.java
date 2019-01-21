package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int num = 1;

        while (num <= 10)
        {
            System.out.println("While Loop Counting Up Number is: " + num);
            num = num + 1;
        }

        System.out.println();

        num = 10;

        while (num > 0)
        {
            System.out.println("While Loop Counting Down Number is: " + num);
            num = num - 1;
        }
    }
}
