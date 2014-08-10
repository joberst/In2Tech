import java.util.Scanner;

public class Sequencing
{
	public static void main( String[] args )
	{
		// BROKEN

		Scanner keyboard = new Scanner(System.in);
		double price = 0, salesTax, total;

		System.out.print( "How much is ther purchase price? " );
		price = keyboard.nextDouble();

		salesTax = price * 0.0825;
		total = price + salesTax;

		System.out.println( "Item price:\t" + price );
		System.out.println( "Sales tax:\t" + salesTax );
		System.out.println( "Total cost:\t" + total );
	}
}



/* Study Drills
	
1. Remove the “ = 0“ on line 10, so that price no longer gets defined on line 10, only declared. 
	What happens when you try to compile the code? 
		I get an error stating that "price" has not been initialized.
	Does the error message make sense? 
		Yes. You can't use a variable that has not been initialized.
	(Now put the “ = 0“ back so that the program compiles again.)
		K.

2. Move the two lines of code that give values to salesTax and total so they occur after price has 
been given a proper value. Confirm that the program now works as expected.
		K.

3. Now that these lines occur after the variable price has been properly given a real value, try 
removing the “ = 0“ on line 10 again. Does the program still give an error? 
		No, it woerks correctly now.
	Are you surprised?
		No, correct logic is imperative.
*/

// Learning Java The Hard Way Exercise 10