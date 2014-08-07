import java.util.Scanner;
import java.util.Random;

public class NumGuessWithCount
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rando = new Random();

		int guess, randomNum;
		int timesGuessed = 0;

		randomNum = 1 + rando.nextInt(10);

		System.out.println();
		System.out.print("I have chosen a number between 1-10. Try to guess it.\n> ");
		System.out.print("Your guess: ");
		guess = keyboard.nextInt();
		timesGuessed++;


		while ( guess != randomNum)
		{
			timesGuessed++;
			System.out.println("Sorry, that's incorrect.");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();	
		}
		

			System.out.println("That's right! You're a good guesser.");
			System.out.println("It only took " + timesGuessed + " tries.");
	}
}

// http://programmingbydoing.com/a/number-guessing-with-a-counter.html