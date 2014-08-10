import java.util.Scanner;

public class DictionaryOrder
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String name;

		System.out.print( "Give me the name of a made-up programming language: " );

		name = keyboard.nextLine();

		if ( name.toLowerCase().compareTo("c++".toLowerCase()) < 0 )
			System.out.println( name + " comes BEFORE c++" );
		if ( name.toLowerCase().compareTo("c++".toLowerCase()) == 0 )
			System.out.println( "c++ isn't a made-up language!" );
		if ( name.toLowerCase().compareTo("c++".toLowerCase()) > 0 )
			System.out.println( name + " comes AFTER c++" );

		if ( name.toLowerCase().compareTo("go".toLowerCase()) < 0 )
			System.out.println( name + " comes BEFORE go" );
		if ( name.toLowerCase().compareTo("go".toLowerCase()) == 0 )
			System.out.println( "go isn't a made-up language!" );
		if ( name.toLowerCase().compareTo("go".toLowerCase()) > 0 )
			System.out.println( name + " comes AFTER go" );

		if ( name.toLowerCase().compareTo("java".toLowerCase()) < 0 )
			System.out.println( name + " comes BEFORE java" );
		if ( name.toLowerCase().compareTo("java".toLowerCase()) == 0 )
			System.out.println( "java isn't a made-up language!" );
		if ( name.toLowerCase().compareTo("java".toLowerCase()) > 0 )
			System.out.println( name + " comes AFTER java" );

		if ( name.toLowerCase().compareTo("lisp".toLowerCase()) < 0 )
			System.out.println( name + " comes BEFORE lisp" );
		if ( name.toLowerCase().compareTo("lisp".toLowerCase()) == 0 )
			System.out.println( "lisp isn't a made-up language!" );
		if ( name.toLowerCase().compareTo("lisp".toLowerCase()) > 0 )
			System.out.println( name + " comes AFTER lisp" );

		if ( name.toLowerCase().compareTo("python".toLowerCase()) < 0 )
			System.out.println( name + " comes BEFORE python" );
		if ( name.toLowerCase().compareTo("python".toLowerCase()) == 0 )
			System.out.println( "python isn't a made-up language!" );
		if ( name.toLowerCase().compareTo("python".toLowerCase()) > 0 )
			System.out.println( name + " comes AFTER python" );

		if ( name.toLowerCase().compareTo("ruby".toLowerCase()) < 0 )
			System.out.println( name + " comes BEFORE ruby" );
		if ( name.toLowerCase().compareTo("ruby".toLowerCase()) == 0 )
			System.out.println( "ruby isn't a made-up language!" );
		if ( name.toLowerCase().compareTo("ruby".toLowerCase()) > 0 )
			System.out.println( name + " comes AFTER ruby" );

		if ( name.toLowerCase().compareTo("visualbasic".toLowerCase()) < 0 )
			System.out.println( name + " comes BEFORE visualbasic" );
		if ( name.toLowerCase().compareTo("visualbasic".toLowerCase()) == 0 )
			System.out.println( "visualbasic isn't a made-up language!" );
		if ( name.toLowerCase().compareTo("visualbasic".toLowerCase()) > 0 )
			System.out.println( name + " comes AFTER visualbasic" );
	}
}

// Learning Java The Hard Way Exercise 23




