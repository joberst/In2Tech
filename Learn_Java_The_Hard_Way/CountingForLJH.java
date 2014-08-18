import java.util.Scanner;

public class CountingForLJH
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int n;
		String message;

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		message = keyboard.nextLine();

		for ( n = 1 ; n <= 5 ; n++ )
		{
			System.out.println( n + ". " + message );
		}

		System.out.println( "\nNow I'll display it ten times and count by 5's." );

		for ( n = 5 ; n <= 50 ; n+=5 )
		{
			System.out.println( n + ". " + message );
		}

		System.out.println( "\nFinally, three times counting beackward." );
		for (  ; n > 0; n -=1 ) // removed n = 3
		{
			System.out.println( n + ". " + message );
		}
	}	
}

// LJH: Exercise 44

/* Study Drills
1. Delete the first part (the “initialization expression”) from the third loop. If you remove it 
correctly, it will still compile. What happens when you run it?

ANSWER: it counted down from 55 which was 5 more than the previous loop ended on. 

*/

