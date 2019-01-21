package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Random random = new java.util.Random();

        java.util.Scanner input = new java.util.Scanner(System.in);

        //Player setup
        System.out.println("Time to play a tribute to the greatest number guessing game in the world.");
        System.out.println("What is your name?");
        String playerName = input.next();

        boolean keepPlaying = true;

        int numberOfGames = 0;
        int guessCountAllGames = 0;

        while (keepPlaying)
        {
            int randomNumber = random.nextInt(100) + 1;
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

            //Multiple game statistics
            numberOfGames = numberOfGames + 1;
            guessCountAllGames = guessCountAllGames + guessCount;
            double averageGuessesPerGame = (double)guessCountAllGames / numberOfGames;

            String gameWord = "game";
            if (numberOfGames > 1)
            {
                gameWord = gameWord + "s";
            }

            System.out.println("You have played " + numberOfGames + " " + gameWord);
            System.out.println("You made an average of " + averageGuessesPerGame + " guesses per game.");

            //Ask if they want to play again
            System.out.println("Play again(Y/N)?");
            char selection = input.next().charAt(0);
            if (selection == 'N' || selection == 'n')
            {
                keepPlaying = false;
            }
        }
    }
}
