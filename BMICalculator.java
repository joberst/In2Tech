import java.util.Scanner;

public class BMICalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		double heightInFeet;
		double heightInInches;
		double weightInPounds;
			
		System.out.print("Your height in feet: ");
		heightInFeet = keyboard.nextDouble();
		
		System.out.print("Your height in inches: ");
		heightInInches = keyboard.nextDouble();
		
		System.out.print("Your weight in lbs: ");
		weightInPounds = keyboard.nextDouble();
		
		
		//BMI = weight in kilos divided by the square of height in meters
		System.out.println
		("Your BMI is " + 
		
		// Convert weight to kilos
			(
				( weightInPounds / 2.2046) / 
		
				// Convert inches to meters
					(
						(((heightInFeet * 12) + heightInInches) / 39.370 ) * 
		
					//multiply by itself to get square
						(((heightInFeet * 12) + heightInInches) / 39.370 )
					) // end convert inches to meters
			)
		);
		
	} // end main
} // end class





// http://programmingbydoing.com/a/bmi-calculator.html
		