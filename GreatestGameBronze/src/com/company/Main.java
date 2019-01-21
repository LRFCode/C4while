package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Random random = new java.util.Random();
        int randomNumber = random.nextInt(100) + 1;

        java.util.Scanner input = new java.util.Scanner(System.in);

        //Game setup
        System.out.println("Time to play a tribute to the greatest number guessing game in the world.");
        System.out.println("What is your name?");
        String playerName = input.next();

        System.out.println("Pick a number between 1 and 100");
        int guess = input.nextInt();
        int guessCount = 1;

        //Play the game
        while (guess != randomNumber)
        {
            if (guess < randomNumber)
            {
                System.out.println("Too low!");
            }
            else if (guess > randomNumber)
            {
                System.out.println("Too high!");
            }

            guess = input.nextInt();
            guessCount = guessCount + 1;
        }

        //Game is over print out the results
        System.out.println("Correct!");
        System.out.println("Congratulations " + playerName + ". You win!");

        String guessWord = "guess";
        if (guessCount > 1)
        {
            guessWord = guessWord + "es";
        }
        System.out.println("You made " + guessCount + " " + guessWord + ".");
    }
}
