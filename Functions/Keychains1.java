import java.util.Scanner;

public class Keychains1
{
	public static void main(String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int choice = 0;

		System.out.println( "Ye Olde Keychain Shoppe");
		System.out.println();

		do
		{
			
			if ( choice == 1 )
			{
				add_keychains();
			}
			if ( choice == 2 )
			{
				remove_keychains();
			}
			if ( choice == 3 )
			{
				view_order();
			}
			

			System.out.println( " 1.\tAdd Keychains to Order" );
			System.out.println( " 2.\tRemove Keychains frim Order" );
			System.out.println( " 3.\tView Current Order" );
			System.out.println( " 4.\tCheckout" );
			System.out.println();

			System.out.print( "Please enter your choice: ");
			choice = keyboard.nextInt();
			System.out.println();

		} while ( choice != 4);

		checkout();

	} // end method main

	public static void add_keychains()
	{
		System.out.println( "ADD KEYCHAINS");
		System.out.println();
	}

	public static void remove_keychains()
	{
		System.out.println( "REMOVE KEYCHAINS");
		System.out.println();
	}

	public static void view_order()
	{
		System.out.println( "VIEW ORDER");
		System.out.println();
	}

	public static void checkout()
	{
		System.out.println( "CHECKOUT");
		System.out.println();
	}


} // end class Keychains1


// http://programmingbydoing.com/a/keychains1.html




