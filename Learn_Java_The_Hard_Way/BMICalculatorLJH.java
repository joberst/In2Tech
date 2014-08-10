import java.util.Scanner;

public class BMICalculatorLJH
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double ft, in, lbs, m, kg, bmi;

		System.out.print( "Your height in feet: " );
		ft = keyboard.nextDouble();

		System.out.print( "Your height in inches: " );
		in = keyboard.nextDouble();

		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();

		m = ((ft * 12 + in) / 39.370);
		kg = (lbs / 2.2046);

		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );
	}
}

// Learning Java The Hard Way Exercise 9