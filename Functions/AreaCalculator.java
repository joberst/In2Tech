import java.util.Scanner;

public class AreaCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int choice;
		double area = 0;

		System.out.println( "Shape Area Calculator version 0.1 (c) 2013 MItchell Sample Output, Inc." );

		do
		{
			System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
			System.out.println("1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("4) Square");
			System.out.println("4) Circle");
			System.out.println("5) Quit");
			System.out.print("> ");
			choice = keyboard.nextInt();

			if ( choice == 1 )
			{
				System.out.print("\nBase: ");
				int base = keyboard.nextInt();
				System.out.print("Height: ");
				int height = keyboard.nextInt();
				area = computeTriangleArea(base, height);
				System.out.println("The area is " + area );
			}
			else if (choice == 2 )
			{
				System.out.print("\nLength: ");
				int length = keyboard.nextInt();
				System.out.print("Width: ");
				int width = keyboard.nextInt();
				area = computeRectangleArea(length, width);
				System.out.println("The area is " + area );
			}
			else if (choice == 3 )
			{
				System.out.print("\nSide Length: ");
				int sideLength = keyboard.nextInt();
				area = computeSquareArea(sideLength);
				System.out.println("The area is " + area );
			}
			else if ( choice == 4 )
			{
				System.out.print("\nRaduis: ");
				int radius = keyboard.nextInt();
				area = computeCircleArea(radius);
				System.out.println("The area is " + area );
			}
			else if ( choice != 5 )
			{
				System.out.println("error.");
			}

		} while ( choice !=5 );

		System.out.println("Goodbye.");
	}

	
	public static double computeTriangleArea( int base, int height )
	{
		double area;
		area = 0.5 * base * height;
		return area;
	}

	public static double computeRectangleArea( int length, int width )
	{
		double area;
		area = length * width;
		return area;
	}

	public static double computeSquareArea( int sideLength )
	{
		double area;
		area = sideLength * sideLength;
		return area;
	}

	public static double computeCircleArea( int radius )
	{
		double area;
		area = Math.PI * radius * radius;
		return area;
	}

}





