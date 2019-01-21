package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int num = 100;

        while (num >= -100 && num <= 100)
        {
            System.out.println("While Loop Number is: " + num);
            num -= 8;
        }
    }
}
