package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int num = 5;
        int answer = 1;

        while (num > 1)
        {
            answer = answer * num;
            num = num - 1;
        }

        System.out.println(answer);
    }
}
