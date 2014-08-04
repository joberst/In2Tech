import java.util.Scanner;

public class SpaceBoxing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		double weight;
		double planet;
		
		System.out.print( "Please enter your current earth weight in lbs: " );
		weight = keyboard.nextDouble();
		System.out.println();
		
		System.out.println( "I have information for the following planets: " );
		System.out.print( "\t1. Venus\t2. Mars\t\t3. Jupiter\n\t4. Saturn\t5. Uranus\t6. Neptune\n" );
		System.out.println();
		
		System.out.print( "Which planet are you visiting? " );
		planet = keyboard.nextDouble();
		System.out.println();
		
		if ( planet  == 1 )
		{
			System.out.println( "Your weight would be " + (weight * 0.78) + " pounds on that planet. " );
		}
		else if ( planet  == 2 )
		{
			System.out.println( "Your weight would be " + (weight * 0.39) + " pounds on that planet. " );
		}
		else if ( planet  == 3 )
		{
			System.out.println( "Your weight would be " + (weight * 2.65) + " pounds on that planet. " );
		}
		else if ( planet  == 4 )
		{
			System.out.println( "Your weight would be " + (weight * 1.17) + " pounds on that planet. " );
		}
		else if ( planet  == 5 )
		{
			System.out.println( "Your weight would be " + (weight * 1.05) + " pounds on that planet. " );
		}
		else if ( planet  == 6 )
		{
			System.out.println( "Your weight would be " + (weight * 1.23) + " pounds on that planet. " );
		}
		else 
		{
			System.out.println( "That is not an option." );
		}
	}
}

// http://programmingbydoing.com/a/space-boxing.html

		
		 
		
		