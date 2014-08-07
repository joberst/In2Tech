import java.util.Scanner;

public class CollatzSequence
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number;
		

		System.out.println("COLLATZ SEQUENCE");
		System.out.print("Choose a starting number: ");
		number = keyboard.nextInt();


		while ( number != 1) 
		{
			System.out.print( number + "\t" );
			

			if (number % 2 == 0) 
			{
				number = number / 2;
			}
			else if (number % 2 != 0) 
			{
				number = number * 3 + 1;
			}
			else
			{
				System.out.print( number + "\t" );
			}
		}

		System.out.print( number );
		System.out.println();
	}
		
}

// http://programmingbydoing.com/a/collatz-sequence.html