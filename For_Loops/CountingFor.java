import java.util.Scanner;

public class CountingFor
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Type in a message, and I'l display it five times.");
		System.out.print("Message: ");
		String message = keyboard.nextLine();

		for ( int n = 2; n <= 10; n = n+2 )
		{
			System.out.println( n + ". " + message );
		}
	}
}

/*

1. What does n = n+1 do? Remove it and see what happens. (Then put it back.)
	Answer: it increments n by 1 each time 'round. 
	When I remove it, it causes an infinite loop because n never gets > 5.

2. What does int n = 1 do? Remove it and see what happens. (Then put it back.)
	Answer: It sets n to 1. This is the starting point of the count.
	When I remove it it causes a compiling error. The "for" condition is not
	a complete statement without it and "n" has not been initialized.

3. Change the code so that the loop repeats ten times instead of five.
	Answer: K. I changed "n <= 5" to "n <= 10"

4. See if you can change the for loop so that the message starts at 2 and counts by twos, 
like so:

Type in a message, and I'll display it ten times.
Message: qwerty
2. qwerty
4. qwerty
6. qwerty
8. qwerty
10. qwerty

	Answer: DONE 
*/


// http://programmingbydoing.com/a/counting-for.html