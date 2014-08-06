import java.util.Scanner;

public class RightTriangleCheck
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int side1, side2, side3;
		

		System.out.println("Enter three integers: ");
		System.out.print("Side 1: ");
		side1 = keyboard.nextInt();
		System.out.print("Side 2: ");
		side2 = keyboard.nextInt();
		
		while ( side2 < side1 ) 
		{

			System.out.println( side2 + " is smaller than " + side1 + ". Try again.");
			System.out.print("Side 2: ");
			side2 = keyboard.nextInt();
				
		}

		System.out.print("Side 3: ");
		side3 = keyboard.nextInt();

		if (side3 < side2) 
				{
					System.out.println(side3 + " is smaller than " + side2 + ". Try again.");
					System.out.print("Side 3: ");
					side3 = keyboard.nextInt();
				}
			
		boolean pyth = side1 * side1 + side2 * side2 == side3 * side3;


		System.out.println("Your three sides are " + side1 + " " + side2 + " " + side3);


		if ( pyth == true ) 
			System.out.println("These sides DO make a right triangle. Yippy Skippy.");
		else
			System.out.println("NO! These sides do not make a right triangle. Boo.");

	}
}

// http://programmingbydoing.com/a/right-triangle-checker.html