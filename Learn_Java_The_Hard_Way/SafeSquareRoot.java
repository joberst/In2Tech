import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double x, y;

		System.out.print( "Give me a number, and I shall find the square root of it. ");
		System.out.print("(No negatives, please.) ");
		x = keyboard.nextDouble();

		
		if (x < 0) {
			y = Math.abs(x);
			System.out.println("The square root of " + x + " is " + Math.sqrt(y) + "i");
		} else {
/*
		while (x < 0 )
		{
			System.out.print("Sorry, I won't take the square root of a negative.\nNew Number: ");
			x = keyboard.nextDouble();
		}
*/
		y = Math.sqrt(x);

		System.out.println("The square root of " + x + " is " + y);
		}
	}
}


/* 

Study Drills
1. Instead of an input protection loop use an if statement and Math.abs() to handle taking the 
square root of negative numbers, too. Detect when the number is negative, take the square root of
the positive version, and print a little "i" next to the answer.

*/

// Learning Java The Hard Way Exercise 29