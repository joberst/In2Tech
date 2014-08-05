import java.util.Random;

public class Dice
{
	public static void main(String[] args)
	{
		Random rando = new Random();

		int die1 = 1 + rando.nextInt(6);
		int die2 = 1 + rando.nextInt(6);

		
		System.out.println("HERE COMES THE DICE!");
		System.out.println();

		System.out.println("Roll #1: " + die1);
		System.out.println("Roll #2: " + die2);
		System.out.println("The total is " + (die1 + die2) + "!");


	}
}

// http://programmingbydoing.com/a/dice.html
