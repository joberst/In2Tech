import java.util.Random;

public class DiceDoubles
{
	public static void main(String[] args)
	{
		Random rando = new Random();

		System.out.println("HERE COME THE DICE!");
		System.out.println();

		int die1 = 1 + rando.nextInt(6);
		int die2 = 1 + rando.nextInt(6);

		while (die1 != die2) {
			System.out.println("Roll #1: " + die1);
			System.out.println("Roll #2: " + die2);
			System.out.println("The total is " + (die1 + die2) + "!");
			System.out.println();
			die1 = 1 + rando.nextInt(6);
			die2 = 1 + rando.nextInt(6);
		}


		System.out.println("Roll #1: " + die1);
		System.out.println("Roll #2: " + die2);
		System.out.println("The total is " + (die1 + die2) + "!");
		System.out.println();


	} // end main

} // end class