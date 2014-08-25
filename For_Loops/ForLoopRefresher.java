import java.util.Scanner;

public class ForLoopRefresher
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String name;

		System.out.print( "What is your name: ");
		name = keyboard.nextLine();
		System.out.println();


		if ( name.equals("Mitchell") )
		{
			for ( int i = 0; i < 5; i++)
			{
				System.out.println(name);
			}
		}
		else 
		{
			for ( int j = 0; j < 10; j++)
			{
				System.out.println(name);
			}
		}

	} // end main

} // end class

// http://programmingbydoing.com/a/a-refresher.html
