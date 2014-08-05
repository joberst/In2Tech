import java.util.Scanner;

public class EnterPinPBD
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
	}
}

/*

1. How is a while loop similar to an if statement?
	Both loops exectute the code block if the condition is true.
2. How is a while loop different from an if statement?
	The "if" statement executes the code block once if the condition is true. The "while loop" 
	continues executing the code block until the condition becomes false.
3. Inside the while loop, why isn't there an int in front of the line entry = keyboard.nextInt()?
	"entry" was already initialized on line 12
4. Delete the line entry = keyboard.nextInt(); from inside the while loop. What happens? Why?
	Jerk. Just as I suspected. Removing that line creates an infinite loop. This happens
	because the pin will always be incorrect if the user does not have a way to enter another pin.
5. (Put the entry = keyboard.nextInt(); back before you turn in the assignment.)
	Dunzo Washington

*/

// http://programmingbydoing.com/a/enter-pin.html