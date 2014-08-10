import java.util.Scanner;

public class StupidGame
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int secretNum = 4, guess;

		System.out.println("This is the stupidest game you will ever play.");
		System.out.println();

		System.out.print("I'm thinking of a number from 1-10. Try to guess what it is. ");
		guess = keyboard.nextInt();

		if ( guess != secretNum)
			System.out.println("You almost got it, but no, the number was " + secretNum + ".");
		else
			System.out.println("You totally got it, it was " + secretNum + ".");
		
	}
}

// http://programmingbydoing.com/a/the-worst-number-guessing-game-ever.html