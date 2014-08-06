import java.util.Scanner;

public class SafeSquareRootPBD
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number;
		double sqrt;
		

		System.out.println("SQUARE ROOT.");
		System.out.print("Enter a number: ");
		number = keyboard.nextInt();


		while ( number < 0) 
		{
			
			System.out.println("You can't take the square root of a negative number, silly goose.");
			System.out.print("Try again: ");
			number = keyboard.nextInt();
		}

		sqrt = Math.sqrt(number);
		System.out.println("The square root of " + number + " is " + sqrt);
	}
}

// http://programmingbydoing.com/a/safe-square-root.html