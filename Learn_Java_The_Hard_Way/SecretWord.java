import java.util.Scanner;

public class SecretWord
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String secret = "please", guess;

		System.out.print( "what is the secret word? " );
		guess = keyboard.next();

		if ( guess == secret ){
			System.out.println( "Impossible. (This will nnever be printed.)" );
		}

		if ( guess.equals(secret) ){
			System.out.println( "That's correct!" );
		} else {
			System.out.println( "Nope, the secret word if not \"" + guess + "\"." );
		}
	}
}

// Learning Java The Hard Way Exercise 18