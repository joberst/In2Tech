import java.util.Scanner;

public class DumbCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		double firstNumber;
		double secondNumber;
		double thirdNumber;
		
		System.out.print("What is your first number? " );
		firstNumber = keyboard.nextDouble();
		
		System.out.print("What is your second number? " );
		secondNumber = keyboard.nextDouble();
		
		System.out.print("What is your third number? " );
		thirdNumber = keyboard.nextDouble();
		
		System.out.println( "(" + firstNumber + " + " + secondNumber + " + " + thirdNumber 
		+ ") / 2 is... " + ((firstNumber + secondNumber + thirdNumber) / 2 ));
	}
}

// http://programmingbydoing.com/a/a-dumb-calculator.html

