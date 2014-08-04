public class WhatIf
{
	public static void main(String[] args )
	{
		int people = 20;
		int cats = 20;
		int dogs = 15;
		
		if ( people < cats )
		{
			System.out.println( "Too many cats! The world is doomed!" );
		}
		
		if ( people > cats )
		{
			System.out.println( "Not many cats! The world is saved!" );
		}
		
		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}
		
		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}
		
		dogs += 5;
		
		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}
		
		if ( people <= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}
		
		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}

/*
	http://programmingbydoing.com/a/what-if.html
	
	1. I think the "if" allows the statement to be evaluated for a "true" or "false" result.
	2. The purpose of the curly braces if to contain the code that runs when the condition is true.
	3. Changed value of the variable "cats" from 30 to 20 so none of the cats messages are printed.




*/