import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int secretNum = 1 + r.nextInt(10), guess;

		
		System.out.println();
		System.out.print("I'm thinking of a number from 1-10.\nYour guess: ");
		guess = keyboard.nextInt();

		if ( guess != secretNum)
			System.out.println("You almost got it, but no, the number was " + secretNum + ".");
		else
			System.out.println("You totally got it, it was " + secretNum + ".");
		
	}
}


// http://programmingbydoing.com/a/a-number-guessing-game.html