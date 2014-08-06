import java.util.Random;
import java.util.Scanner;

public class FlipAgain
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String again;

		do
		{
			int flip = rng.nextInt(2);
			String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? " );
			again = keyboard.next();

		} while ( again.equals("y") );
	}
}

/* 

1. The code as given does not compile. Notice that the while loop tests if again.equals("y"), 
but the variable again doesn't have a value at first. Give it a value so that the code will 
compile and the loop will run at least once.
	Answer: Initialized "again" to "y".
2. Now that program is working, change the loop from a while loop to a do-while loop. 
Make sure it still works.
	Answer: Still works.
3. What happens if you delete what you added in step 1? Change the line back to just String again; 
Does the program still work? Why or why not? (Answer in a comment.)
	Answer: The program still works. Hooray
*/

// http://programmingbydoing.com/a/flip-again.html
// Exercise 57