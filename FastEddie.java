import java.util.Scanner;
import java.util.Random;

public class FastEddie
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random rando = new Random();


		int cup, guess;

		cup = 1 + rando.nextInt(3);


		System.out.println();
		System.out.print("You slide up to Fast Eddie's game table and slam down your bettin' cash. ");
		System.out.print("He holds up a small red ball between his thumb and forefinger, then " + 
						 "places it underneath one of three cups which are upside down on the table. ");
		System.out.println("He moves the cups around and around on the table while maintaining an uncomfortable " +
						 " and constant eye contact. He's trying to indimidate and confuse you, but you're " + 
						 "slick and you remember exactly which cup the ball is under. ");
		System.out.println();
		System.out.print("Show Fast Eddie who's boss. Which cup is the ball under?");
		System.out.println();

		System.out.println("\t ___ \t ___ \t ___ ");
		System.out.println("\t|   |\t|   |\t|   |");
		System.out.println("\t|___|\t|___|\t|___|");
		System.out.println("\t  1  \t  2  \t  3  ");

		System.out.print("> ");
		guess = keyboard.nextInt();
		System.out.println();

		if (cup == 1) 
		{

			if (guess == cup)
			{
				System.out.println("Nailed it! Fast Eddie isn't so fast now is he?");
				System.out.println("\t ___ \t ___ \t ___ ");
				System.out.println("\t|   |\t|   |\t|   |");
				System.out.println("\t|___|\t|___|\t|___|");
				System.out.println("\t  ☻  \t     \t     ");
			}	

			if (guess != cup)
			{
				System.out.println("Ooooh, that's too bad. Better luck next time."); 
				System.out.println("Or maybe you should just quit gambling altogether.\n" +  
								   "It's not for everyone...");
				System.out.println();
				System.out.println("The ball was under cup #1");
				System.out.println("\t ___ \t ___ \t ___ ");
				System.out.println("\t|   |\t|   |\t|   |");
				System.out.println("\t|___|\t|___|\t|___|");
				System.out.println("\t  ☻  \t     \t     ");
			}
		} // end if cup 1 

		if (cup == 2) 
		{

			if (guess == cup) 
			{
				System.out.println("Nailed it! Fast Eddie isn't so fast now is he?");
				System.out.println("Nailed it! Fast Eddie isn't so fast now is he?");
				System.out.println("\t ___ \t ___ \t ___ ");
				System.out.println("\t|   |\t|   |\t|   |");
				System.out.println("\t|___|\t|___|\t|___|");
				System.out.println("\t     \t  ☻  \t     ");
			}

			if (guess != cup) 
			{
				System.out.println("Ooooh, that's too bad. Better luck next time."); 
				System.out.println("Or maybe you should just quit gambling altogether.\n" +  
								   "It's not for everyone...");
				System.out.println();
				System.out.println("The ball was under cup #2");
				System.out.println("\t ___ \t ___ \t ___ ");
				System.out.println("\t|   |\t|   |\t|   |");
				System.out.println("\t|___|\t|___|\t|___|");
				System.out.println("\t     \t  ☻  \t     ");
			}
		} // end if cup 2
		
		if (cup == 3)
		{

			if (guess == cup) 
			{
				System.out.println("Nailed it! Fast Eddie isn't so fast now is he?");
				System.out.println("\t ___ \t ___ \t ___ ");
				System.out.println("\t|   |\t|   |\t|   |");
				System.out.println("\t|___|\t|___|\t|___|");
				System.out.println("\t     \t     \t  ☻  ");
			}

			if (guess != cup) 
			{
				System.out.println("Ooooh, that's too bad. Better luck next time."); 
				System.out.println("Or maybe you should just quit gambling altogether.\n" +  
								   "It's not for everyone...");
				System.out.println();
				System.out.println("The ball was under cup #3");
				System.out.println("\t ___ \t ___ \t ___ ");
				System.out.println("\t|   |\t|   |\t|   |");
				System.out.println("\t|___|\t|___|\t|___|");
				System.out.println("\t     \t     \t  ☻  ");
			}

		} // end if cup 3

	} // end main

} // end class

// http://programmingbydoing.com/a/three-card-monte.html


