import java.util.Scanner;

public class ForgetfulMachine
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Give me a word! " );
		keyboard.next();

		System.out.println( "Give me a second word! " );
		keyboard.next();

		System.out.println( "Great, now your favorite number. " );
		keyboard.next();

		System.out.println( "And your second-favorite number... " );
		keyboard.next();
		
		System.out.println( "Whew! Wasn't that fun? " );
		keyboard.next();
	}
}


 
// http://programmingbydoing.com/a/the-forgetful-machine.html
// PBD: Keyboard Input - Exercise 15