import java.util.Scanner;

public class BMICategoriesPBD
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);


		double ft, in, lbs, m, kg, bmi;

		System.out.print( "Enter your height in feet: " );
		ft = keyboard.nextDouble();

		System.out.print( "Enter your height in inches: " );
		in = keyboard.nextDouble();

		System.out.print( "Enter your weight in lbs: " );
		lbs = keyboard.nextDouble();

		m = ((ft * 12 + in) / 39.370);
		kg = (lbs / 2.2046);

		bmi = kg / (m*m);


		System.out.println( "Your BMI is: " + bmi );
	

		System.out.print( "BMI category: " );
		if ( bmi < 15.0 )
		{
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0 )
		{
			System.out.println( "severely underweight" );
		}
		else if ( bmi <= 18.5 )
		{
			System.out.println( "underweight" );
		}
		else if ( bmi <= 25.0 )
		{
			System.out.println( "normal weight" );
		}
		else if ( bmi <= 30.0 )
		{
			System.out.println( "overweight" );
		}
		else if ( bmi <= 35.0 )
		{
			System.out.println( "moderately obese" );
		}
		else if ( bmi <= 40.0 )
		{
			System.out.println( "severely obese" );
		}
		else
		{
			System.out.println( "very severely/\"mornidly\" obese" );
		}
	}
}