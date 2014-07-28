public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
		
		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		if (cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}
		
		
		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}
		
		
		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{	
			System.out.println( "Fine, let's stay home then." );
		}
	}
}

/*

	1. The 'else if' and 'else' provide a code block options to execute when a 
		condition that evaluates as "false".

	2. *removed the else from line 13* It doesn't do anything because the if does
		not evaluate as true.
		
	http://programmingbydoing.com/a/else-and-if.html
	PBD: If Statements - Exercise 23
	
*/