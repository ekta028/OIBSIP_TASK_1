// Number Guessing Game //

import java.util.Scanner;

public class Game
{
	// Function that implements the number guessing game

	public static void guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);

        //Generate random Number between 1 to 100
		int number = 1 + (int)(100 * Math.random());

		// Limits of Attempts is 5
		int K = 5;
		int i, guess;

		System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");

		// Iterate over 5 Trials
		for (i = 0; i < K; i++) 
        {
			System.out.println("Guess the number:");

			// Take input for guessing number
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) 
            {
				System.out.println("Congratulations!" + " You guessed the number.");
				break;
			}
			else if (number > guess && i != K - 1) 
            {
				System.out.println("The number is " + "greater than " + guess);
			}
			else if (number < guess && i != K - 1) 
            {
				System.out.println("The number is" + " less than " + guess);
			}
		}
		if (i == K) 
        {
			System.out.println("You have exhausted" + " 5 trials.");
			System.out.println("The number was " + number);
		}
	}
	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}
