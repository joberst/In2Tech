import java.util.Scanner;

public class RollCall
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;

		System.out.print( "This is roll call. We'll let you know how long you have to wait. " );
		System.out.println();
		System.out.print( "Please enter your last name: ) " );
		name = keyboard.next();
		
		
		System.out.println();
		
		if ( name.toLowerCase().compareTo("Carswell".toLowerCase()) <= 0 )
			System.out.println( "You don't have to wait long, " + name );

		else if ( name.toLowerCase().compareTo("Jones".toLowerCase()) <= 0 )
			System.out.println( "That's not bad, " + name );

		else if ( name.toLowerCase().compareTo("Smith".toLowerCase()) <= 0 )
			System.out.println( "Looks like a bit of a wait, " + name );

		else if ( name.toLowerCase().compareTo("Young".toLowerCase()) <= 0 )
			System.out.println( "It's gonna be a while, " + name );

		else if ( name.toLowerCase().compareTo("Young".toLowerCase()) > 0 )
			System.out.println( "Not going anywhere for a while? " );

	}
}

// http://programmingbydoing.com/a/alphabetical-order.html