import java.util.Scanner;

public class CountingMachineDeux
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int number1;
		int number2;
		int number3;

		System.out.println("Choose some numbers and I will count from the first one" + 
						   " to the second one in increments of the third one!");

		System.out.print("Count from: ");
		number1 = keyboard.nextInt();

		System.out.print("Count to: ");
		number2 = keyboard.nextInt();

		System.out.print("Count by: ");
		number3 = keyboard.nextInt();


		for (int i = number1; i <= number2; i+=number3)
		{
			System.out.print( i + " ");
		}

		System.out.println();
	}
}

// http://programmingbydoing.com/a/counting-machine-revisited.html