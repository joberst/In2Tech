import java.util.Scanner;

public class AgeInFive
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		System.out.println();
		
		System.out.print( "Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();
		System.out.println();

		System.out.print( "Did you know that in five years you will be " + (age + 5) 
		+ " years old?" );
		System.out.println();
		
		System.out.println( "And five years ago you were " + (age - 5) + "! Imagine that!" );
		
	}
	
}

// http://programmingbydoing.com/a/age-in-five-years.html