import java.util.Scanner;

public class CoinFlip
{
	public static void main( String[] args )
	{

		Scanner keyboard = new Scanner(System.in);
		
		String coin, again;
		int flip, streak = 0;

	 //original code with do-while loop

		do 
		{ 
			flip = 1 + (int)(Math.random()*2);

			if (flip == 1)
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			if ( flip == 1 ){
				streak++;
				System.out.println( "\tThat's " + streak + " in a row....");
				System.out.print( "\tWould you like to flip again (y/n)? ");
				again = keyboard.next();
			} else {
				//streak = 0;
				again = "n";
			}		
		} while (again.equals("y") );
		System.out.println( "Final score: " + streak);
	
		/*
		
	// start of code with while loop

		flip = 1 + (int)(Math.random()*2);

			if (flip == 1) {
				coin = "HEADS";
				streak++;
			}
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );
			System.out.println( "\tThat's " + streak + " in a row....");
			System.out.print( "\tWould you like to flip again (y/n)? ");
			again = keyboard.next();
			
			while (again.equals("y")) {

				flip = 1 + (int)(Math.random()*2);

				if (flip == 1)
					coin = "HEADS";
				else
					coin = "TAILS";

				System.out.println( "You flip a coin and it is... " + coin );

				if ( flip == 1 ){
					streak++;
					System.out.println( "\tThat's " + streak + " in a row....");
					System.out.print( "\tWould you like to flip again (y/n)? ");
					again = keyboard.next();
				} else {
					//streak = 0;
					again = "n";
				} // end else		
			} // end while

			System.out.println( "Final score: " + streak);

*/

		
	} // end main

} // end CoinFlip


/* 
	Does anyone else find this exercise to be strange? I had to comment out line 33 
	so that the final score would calculate. Additionally, If the coin flip returns 
	tails, no tally is recoreded at all. Perhaps this coin flip game only awards points
	for HEADS? Anyway, I prefer the output from the while loop. 

*/

// Learning Java The Hard Way Exercise 30



