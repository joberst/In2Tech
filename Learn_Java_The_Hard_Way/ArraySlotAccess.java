public class ArraySlotAccess
{
	public static void main( String[] args )
	{
		int[] arr = new int[1000];
		int i;

		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;

		System.out.println("Array contains: " + arr[0] + " " + arr[1] + " " + arr[2] );

		// Fill each slot of this array with a random number 1-100
		arr[0] = 1 + (int) (Math.random() * 100 );
		arr[1] = 1 + (int) (Math.random() * 100 );
		arr[2] = 1 + (int) (Math.random() * 100 );

		// Display them again.
		System.out.println("Array contains: " + arr[0] + " " + arr[1] + " " + arr[2] );

		// This is a bit silly, biut try to understand it.
		i = 0;
		arr[i] = 1 + (int) (Math.random() * 100 );
		i = 1;
		arr[i] = 1 + (int) (Math.random() * 100 );
		i = 2;
		arr[i] = 1 + (int) (Math.random() * 100 );

		// Display them again.
		System.out.print("Array contains: ");
		i = 0;
		System.out.print(arr[i] + " ");
		i = 1;
		System.out.print(arr[i] + " ");
		i = 2;
		System.out.println(arr[i] + " ");

		// This is even more silly but it worls. Can yoiu guess where this is headed?
		i = 0;
		arr[i] = 1 + (int) (Math.random() * 100 );
		i++;
		arr[i] = 1 + (int) (Math.random() * 100 );
		i++;
		arr[i] = 1 + (int) (Math.random() * 100 );

		// Display them again
		System.out.print("Array contains: ");
		i = 0;
		System.out.print(arr[i] + " ");
		i++;
		System.out.print(arr[i] + " ");
		i++;
		System.out.println(arr[i] + " ");


		// Ah! Let's just use a rgular 'for' loop!
		for ( i = 0; i < arr.length; i++ )
		{
			arr[i] = 1 + (int) (Math.random() * 100 );
		}

		// Display them again.
		System.out.print("Array contains: ");
		for ( i = 0; i < arr.length; i++ )
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}

/*

Study Drills
1. At the top of the code, change it so the array has a capacity of 1000 instead of 3. Don’t change 
any other code and recompile and run it again. Guess what? Those for loops at the bottom 
might have been a little more work to write and to understand, but once written they work just as 
well for 1000 values as for 3. And that’s pretty cool.
	ANSWER: It printed 1000 random numbers only with the for loop. 

*/





