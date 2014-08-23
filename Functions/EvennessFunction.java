public class EvennessFunction
{
		

	public static boolean isEven( int n )
	{
		return n % 2 ==0;
	}

	public static boolean isDivisibleBy3( int n )
	{
		return n % 3 == 0;
	}


	public static void main( String[] args )
	{
			for (int i = 1; i <=20; i++)
		{
			if ( isEven(i) && isDivisibleBy3(i) )
			{
				System.out.println( i  + " <=");
			}
			else if ( isDivisibleBy3(i) )
			{
				System.out.println( i + " =");
			}
			else if ( isEven(i) )
			{
				System.out.println( i + " <");
			}
			else 
			{
			 System.out.println( i);
			}
		}
	}


}




