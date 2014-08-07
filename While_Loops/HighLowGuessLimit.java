import java.util.Scanner;
import java.util.Random;

public class HighLowGuessLimit
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rando = new Random();

		int guess, randomNum;
		int timesGuessed = 0;

		randomNum = 1 + rando.nextInt(100);

		System.out.println();
		System.out.print("I'm thinking of a number between 1-100. You have 7 guesses.\nFirst Guess: ");
		guess = keyboard.nextInt();
		timesGuessed++;

		while ( guess != randomNum && timesGuessed < 7 ) 
		{

			if (guess < randomNum ) {
				System.out.println("Sorry, you are too low.");
				timesGuessed++;
				System.out.print("Guess # " + timesGuessed + ": " );
				guess = keyboard.nextInt();	
			}

			if ( guess > randomNum ) {
				System.out.println("Sorry, you are too high.");
				timesGuessed++;
				System.out.print("Guess # " + timesGuessed + ": ");
				guess = keyboard.nextInt();	
			}

		}

		if ( timesGuessed >= 7) {
			System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");		
		}
		else
		System.out.println("You totally got it, it was " + randomNum + ".");
	}
}

// http://programmingbydoing.com/a/hi-lo-with-limited-tries.html