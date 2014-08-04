import java.util.Scanner;

public class GenderGame
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String title, gender, first, last;
		int age;


		System.out.print( "What is your fender (m/f): " );
		gender = keyboard.next();
		
		System.out.print( "First name: " );
		first = keyboard.next();
		
		System.out.print( "Last name: " );
		last = keyboard.next();
		
		System.out.print( "Age: " );
		age = keyboard.nextInt();

		if (age < 20 )
		{
			title = first;
		}
		else
		{
			if (gender.equals("f") )
			{
				System.out.print( "Are you married, " + first + "? (y/n): " );
				String married = keyboard.next();
				if (married.equals("y)") )
				{
					title = "Mrs.";
				}
				else 
				{
					title = "Ms.";
				}
			}
			else
			{
				title = "Mr.";
			}
		}

		System.out.println( "\n" + title + " " + last );
	}
}

// http://programmingbydoing.com/a/gender-game.html