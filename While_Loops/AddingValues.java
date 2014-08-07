import java.util.Scanner;

public class AddingValues
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Double guess;
		int accumTotal = 0;

		System.out.println("I will add up the numbers you give me.");
		System.out.println("Press \"0\" to stop.");
		System.out.print("Number: ");
		guess = keyboard.nextDouble();


		while ( guess != 0) {
			accumTotal += guess;
			System.out.println("The total so far is " + accumTotal);
			System.out.print("Number: ");
			guess = keyboard.nextDouble();


		}
		System.out.println();
		System.out.println("The total is " + accumTotal);
	}
}

// http://programmingbydoing.com/a/adding-values-in-a-loop.html