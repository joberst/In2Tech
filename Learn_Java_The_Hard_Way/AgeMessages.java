import java.util.Scanner;

public class AgeMessages
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;

		System.out.print( "How old are you " );
		age = keyboard.nextInt();

		if ( age < 13 ){
			System.out.println( "You are too young to create a Facebook account." );
		}
		if ( age > 13 ){
			System.out.println( "You are old enough to create a Facebook account." );
		}
		if (age < 16 ){
			System.out.println( "You are too young to get a driver's license." );
		}
		if (age > 16 ){
			System.out.println( "You are old enough to get a driver's license." );
		}
		if (age < 18 ){
			System.out.println( "You are too young to get a tattoo." );
		}
		if (age > 18 ){
			System.out.println( "You are old enough to get a tattoo." );
		}
		if ( age < 21 ){
			System.out.println( "You are too young to drink alcohol" );
		}
		if ( age > 21 ){
			System.out.println( "You are old enough to drink alcohol" );
		}
		if ( age < 35 ){
			System.out.println( "You are too young to run for President of the United States." );
			System.out.println( "How sad!" );
		}
		if ( age > 35 ){
			System.out.println( "You are old enough to run for President of the United States." );
			System.out.println( "How exciting!" );
		}
		if ( age < 65 ){
			System.out.println( "You are too young to retire!" );
		}
		if ( age > 65 ){
			System.out.println( "You are old enough to retire!" );
		}
			
	}
		
}

/*

Study Drills

1. If you type in an age greater than 35 what gets printed? Why?
	Nothing printed and the program ended because there was nothing telling it
	to print anything if the number entered is 35 or over. 

2. Add one more if statement comparing their age to 65. If their age is greater than or equal to 65, 
say “You are old enough to retire!”.


3. For each if statement, add another if statement that says the opposite. For example, if their age is 
greater than or equal to 13, say “You are old enough to create a Facebook account.” When you 
are done, your program should show six messages every time no matter what age you enter.


*/