import java.util.Scanner;

public class DisplayingMultiples
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int num; 

		System.out.print( "Choose a number: ");
		num = keyboard.nextInt();
		System.out.println();

		for ( int i = 1; i <= 12; i++ )
		{
			System.out.println( num + "x" + i + " = " + (num*i) );
		} 

	} // end main
	
} // end class

// http://programmingbydoing.com/a/displaying-some-multiples.html