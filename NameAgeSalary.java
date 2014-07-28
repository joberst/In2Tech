import java.util.Scanner;

public class NameAgeSalary
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		String name;
		int age;
		double income; 
		
		
		System.out.println( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.println( "Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not old at all.");
		
		System.out.println( "How much do you make? " );
		income = keyboard.nextDouble();
		
		System.out.println( income + "! I hope that's per hour and not per year! LOL!" );
	}
}
