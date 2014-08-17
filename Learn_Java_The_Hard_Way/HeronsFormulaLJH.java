public class HeronsFormulaLJH
{
	public static void main(String[] args)
	{
		double a;

		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3, 3, 3 has an area of " + a);

		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3, 4, 5 has an area of " + a);

		a = triangleArea(7, 8, 9);
		System.out.println("A triangle with sides 7, 8, 9 has an area of " + a);

		System.out.println("A triangle with sides 5, 12, 13 has an area of " + triangleArea(5, 12, 13) );
		System.out.println("A triangle with sides 10, 9, 11 has an area of " + triangleArea(10, 9, 11) );
		System.out.println("A triangle with sides 8, 15, 17 has an area of " + triangleArea(8, 15, 17) );
		System.out.println("A triangle with sides 9, 9, 9 has an area of " + triangleArea(9, 9, 9) );

	}

	public static double triangleArea( int a, int b, int c )
	{
		// the code in this function computes the area of a triangle whose sides have lengths a, b, and c

		double s, A;

		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );

		return A;
		// ^ after computing the area, "return" it
	}
}

/* 

1. Which one is longer, the one with the function or the one without?
	ANSWER: The one without the functions is longer.

2. There is a bug in the formula for both files. When (a+b+c) is an odd number, dividing by 2
throws away the .5. Fix it so that instead of (a+b+c)/2 you have (a+b+c)/2.0. How much
harder would it have been to fix the version that didn’t use a function?
	ANSWER: Six times harder.

3. Add one more test: find the area of a triangle with sides 9, 9, and 9. Was it difficult to add? How 
much harder would it have been to add the test to the version that didn’t use a function?
	ANSWER: Six times harder.

	*/