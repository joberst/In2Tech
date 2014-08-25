import java.util.Scanner;


public class OdometerLoops
{
	public static void main( String[] args ) throws Exception
	{

		Scanner keyboard = new Scanner(System.in);
		int base;

		System.out.print(" Which base (2-10): ");
		base = keyboard.nextInt();
		System.out.println();


		for ( int thous=0; thous<base; thous++ )
		
			for ( int hund=0; hund<base; hund++ )
			
				for ( int tens=0; tens<base; tens++ )
				
					for ( int ones=0; ones<base; ones++ )
					{
						System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
						Thread.sleep(500);
					}

		System.out.println();
	}
}


/* 

Delete all the open braces and close braces from all the outer for loops. 
(Leave the curly braces that belong to the innermost loop (the "ones" loop).
Does it still work? Answer in a comment.
	ANSWER: YES

Change all the loops so that they count from 0 to 7 instead of 0 to 9.
This will display numbers in "octal" (base 8) instead of "decimal" (base 10).
	ANSWER: Ok

Change the code so that the human gets to type in a number for the base, 
and your odometer counts up to that instead of 8. You might want to increase the delay 
(put a bigger number (like maybe 500) inside the Thread.sleep()).
	ANSWER: Done

*/