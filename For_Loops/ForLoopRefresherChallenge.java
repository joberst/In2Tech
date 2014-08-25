import java.util.Scanner;

public class ForLoopRefresherChallenge
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String name;

		System.out.print( "Your name: ");
		name = keyboard.nextLine();
		System.out.println();



		for ( int i = 0; i < 10; i++)
		{
			if ( name.equals("Mitchell") )
			{
				System.out.println(name);
				System.out.println(name);
				System.out.println(name);
				System.out.println(name);
				System.out.println(name);
				break;
			}

			System.out.println(name);
		} // end for
	
	} // end main

} // end class

// Surely there is a better way to do this. 
// http://programmingbydoing.com/a/refresher2.html