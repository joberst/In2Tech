public class ThereAndBackAgain
{
	public static void main(String[] args)
	{
		System.out.println( "Here." );
		erebor();
		System.out.println( "Back first time." );
		System.out.println( "Back second time." );
	}

	public static void erebor()
	{
		System.out.println( "There." );
	}
}

/*

Study Drills
1. Remove the parentheses at the end of the first function call on line 6 so that it looks like so:
erebor; 
What happens when you compile? (Then put the parentheses back.)
	ANSWER: Did not compile. Error "not a statement)"

1. Remove the second function call (the one on line 8). You can either just delete the line entirely 
or put slashes in front of it so the compiler thinks it’s a comment like so:
// erebor();
Compile it, but before you run it, how do you think the output will be different? Run it and see if you 
were right.
	ANSWER: I removed the function on line 8. I think the program will run and the second "There" 
	will just not be there... I was right.

*/

// LJH Exercise 34