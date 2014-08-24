import java.util.Scanner;

public class ArrayLinearSearch
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int[] orderNumbers = { 12345, 54321, 78753, 101010, 8675309, 31415, 271828 };

		int toFind;
		boolean found;

		System.out.println( "There are " + orderNumbers.length + " orders in the database." );

		System.out.print( "Orders: " );
		for ( int num : orderNumbers )
		{
			System.out.print( num + " " );
		}

		System.out.println();

		System.out.print( "Which order to find? " );
		toFind = keyboard.nextInt();

		found = false;
		for ( int num : orderNumbers )
		{
			if ( num == toFind )
			{
				System.out.println( num + " found." );
				found = true;
			}
		}

		if ( found == false )
		{
			System.out.println( "Order number " + toFind + " not found ");
		}
	}
}

/*

Study Drills
1. We created an int called num inside both foreach loops. Could we have just declared the 
variable once up on line 10 and then removed the int from both loops? Try it and see.
	ANSWER: NO. The program doesn't compile when the second int is removed. 


2. Try to change the code so that if the order number is not found, it prints out a single message 
saying so. This is tricky. Even if you aren’t successful, give it a good effort before moving on to 
the next exercise.
	ANSWER: 
*/