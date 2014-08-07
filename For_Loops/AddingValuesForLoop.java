import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int n, accumTotal = 0;

		System.out.println("I will add up all the numbers from 1 to the number you chose and return the total.");
		System.out.print("Number: ");
		n = keyboard.nextInt();

		for (int i = 1; i <= n; i++ )
		{
			System.out.print(i + " ");	
			accumTotal +=i;	
		}

		System.out.println("\nThe sum is " + accumTotal + ".");

	}

}

// http://programmingbydoing.com/a/adding-values-with-a-for-loop.html 