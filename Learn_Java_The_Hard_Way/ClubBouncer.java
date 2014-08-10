import java.util.Scanner;

public class ClubBouncer
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age = 22;
		boolean onGuestList = false;
		double attractiveness = 7.5;
		String gender = "F";

		if ( onGuestList || age >= 21 || ( gender.equals("F") && attractiveness >= 8 ) )
		{
			System.out.println( "You are allowed to enter the club." );
		}
			System.out.println("C-C-C-COMBO BREAKER");
		else
		{
			System.out.println( "You are not allowed to enter the club." );
		}
	}
}


/* 

Study Drills
	1. Between line 17 and 18, add a println() statement to print something on the screen (it 
	doesn’t matter what, but I put "C­C­C­COMBO BREAKER" because I’m weird.) Try to 
	compile the program. Does it compile? Why not?
		It does not compile because the "else" needs to be right after the "if".
*/


//Learning Java The Hard Way Exercise 17
