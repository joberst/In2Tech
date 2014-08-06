import java.util.Scanner;

public class CountingMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int number;

		System.out.println("Choose a number and I will count from 0 to that number.");
		System.out.print("Count to: ");
		number = keyboard.nextInt();

		for (int i = 0; i <= number; i++)
		{
			System.out.print( i + " ");
		}

		System.out.println();
	}
}

// http://programmingbydoing.com/a/counting-machine.html
// Exercise 66