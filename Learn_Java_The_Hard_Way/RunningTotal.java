import java.util.Scanner;

public class RunningTotal
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int current, newtotal, total = 0;

		System.out.print("Type in a bunch of values and I'll add them up. ");
		System.out.println("I'll stop when the total equals twenty.");

		do
		{
			System.out.print("Value: ");
			current = keyboard.nextInt();

			if ( current == 20 )
			{
				total = current;
				System.out.println("The total so far is: " + total);
			}

				if (current != 20 )
				{
					if ( current > 20) 
					{
						System.out.println( "Please type in a number under 20. ");
					}
					else if ( total == 20)
					{
						System.out.println("The final total is: " + total);
					}
					else 
					{
						newtotal = current + total;
						total = newtotal;
							if (newtotal > 20) 
							{
								newtotal = total - current;
								total = newtotal;
								System.out.println("Please enter a smaller number ");
							}
						System.out.println("The total so far is: " + total);	
					}	
				}
				

		} while (total != 20 );

		System.out.println("The final total is: " + total);
	}
		
}


// Learning Java The Hard Way Exercise 31