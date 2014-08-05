import java.util.Scanner;
import java.util.Random;

public class HighLowGuess
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rando = new Random();

		int guess, randomNum;

		randomNum = 1 + rando.nextInt(100);

		System.out.println();
		System.out.print("I'm thinking of a number between 1-100. Try to guess it.\n> ");
		guess = keyboard.nextInt();

		if ( guess < randomNum)
			System.out.println("Sorry, you are too low. I was thinkin of " + randomNum + ".");
		else if ( guess > randomNum)
			System.out.println("Sorry, you are too high. I was thinkin of " + randomNum + ".");
		else 
			System.out.println("You totally got it, it was " + randomNum + ".");
		
	}
}

// http://programmingbydoing.com/a/one-shot-hi-lo.html