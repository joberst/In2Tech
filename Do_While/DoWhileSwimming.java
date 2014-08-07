import java.util.Scanner;

public class DoWhileSwimming
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);

		String swimmer1 = "GALLANT";
		String swimmer2 = "GOOFUS ";

		double minimumTemperature = 79.0; // degrees Fahrenheit
		double currentTemperature;
		double savedTemperature;
		int swimTime;

		System.out.print("What is the current water temperature? ");
		currentTemperature = keyboard.nextDouble();
		savedTemperature = currentTemperature; // saves a copy of this value so we can get it back later.

		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer1 + " approaches the lake...." );

		swimTime = 0;
		while ( currentTemperature >= minimumTemperature )
		{
			System.out.print( "\t" + swimmer1 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600); // pauses for 600 milliseconds
			currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
		}

		System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );

		currentTemperature = savedTemperature; // restores original water temperature

		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer2 + " approaches the lake...." );

		swimTime = 0;
		do
		{
			System.out.print( "\t" + swimmer2 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600);
			currentTemperature -= 0.5;
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );

		} while ( currentTemperature >= minimumTemperature );

		System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
	}
}

/*
1. Run the program, and type in 80.5 for the current water temperature. 
Do Goofus and Gallant swim for the same amount of time? Put your answer in a comment.
	Answer: Yes they both swim for the same amount of time.
*/

/*
2. Run the program again, but this time enter 78 for the starting temperature. What changes?
	Answer: Swimmer 1 does not swim. Swimmer 2 swims then gets out.
*/

/*
3. Does Gallant check the water temperature first, or does he just dive right in?
	Answer: Gallant checks the water first.
*/	

/* 
4. What about Goofus? Does he check the water temperature first or just dive in?
	Answer: Goofus just dives in. That's why he's Goofus.
*/

/*
5. What is the difference between a while loop and a "do-while" loop?
	Answer: while loop executes code as long as the condition is true.
	Do-while executes the code once, then checks if the condition is true. After that, 
	it acts just like a while loop.
*/

/*
6. One of these loops is sometimes called a "pre-test loop",and the other is called a 
"post-test loop". Which one is which?
	Answer: The while loop should be the pre-test loop because it test the condition
	prior to executing the code. The Do-while should be the post-test loop because it
	executes the code THEN checks the condition.
*/

// Programming By Doing .com Exercise 56











