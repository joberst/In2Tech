import java.util.Scanner;

public class BabyCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c;
		String op;
		boolean calc;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();
			c = 0;

				if ( a == 0 ) {
					System.out.println( "Bye now");
					calc = false;
					break;
				}
				else if ( op.equals("+") )
					c = a + b;
				else if ( op.equals("-") )
					c = a - b;
				else if ( op.equals("*") || op.equals("x"))
					c = a * b;
				else if ( op.equals("/") )
					c = a / b;
				else
				{
					System.out.println("Undefined operator: '" + op + "'.");
					c = 0;
				}
				System.out.println(c);

		} while ( true );
		
		
	}


}

// http://programmingbydoing.com/a/baby-calculator.html