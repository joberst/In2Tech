import java.util.Scanner;
import java.util.Random;

public class KeepGuessingPBD
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rando = new Random();

		int guess, randomNum;

		randomNum = 1 + rando.nextInt(10);

		System.out.println();
		System.out.print("I have chosen a number between 1-10. Try to guess it.\n> ");
		guess = keyboard.nextInt();

		while ( guess != randomNum) {
			System.out.println("Sorry, that is incorrect. Guess again: ");
			guess = keyboard.nextInt();
		} // end while

		System.out.println(" That's right! You're a good guesser.");

	} // end main

} // end class

// 