import java.util.Random;

public class Randomness
{
	public static void main( String[] args )
	{


		Random r = new Random();

		int x = 1 + r.nextInt(10);

		System.out.println( "My random number is " + x );

		System.out.print( "Here are some random numbers from 1 to 5! ");
		System.out.println();
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.print( 3 + r.nextInt(5) + " " );
		System.out.println();

		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.println();

		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		if ( num1 == num2 )
		{
			System.out.println( "The random numbers were the same! Weird." );
		}
		if ( num1 != num2 )
		{
			System.out.println( "The random numbers were different! Not too surprising." );
		}
	}
}


/*


1. Delete the 1 + in front of all six lines that pick numbers 1-5, so that they look like this: 
   System.out.print( r.nextInt(5) + " " ); Run the program a few times, and see if you can 
   figure out what range the new random numbers are in.
		The new range is 0-4
2. Change the 1 + in front of all six lines that pick numbers 1-5, so that they look like this: 
   System.out.print( 3 + r.nextInt(5) + " " ); Run the program a few times. Is it picking random 
   numbers from 3 to 5? If not, what range are they?
		No, it's picking numbers in the range of 3-7.

3. Change the line where you create the random number generator so that it looks like this:  
   Random r = new Random(12353); This number is called a seed. Run the program a few times. 
   What do you notice? What happened to the random numbers?
		I didn't notice any change at all.

4. Change to random seed to something else and observe the behavior. What happens to the random numbers?
   (Delete the random seed before turning in the assignment.)
		Still no change noticed when I changed the seed to 24242. Hmmm. Changing it back to 10.

*/

// http://programmingbydoing.com/a/randomness.html