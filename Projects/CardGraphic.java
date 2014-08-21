public class CardGraphic 
{

	public static void displayCard( int card )
	{
		System.out.println("\t+---------+ ");

		if ( card == 2 )
		{
			int suit = 1 + (int) ( Math.random()*4 );
			
			if ( suit == 1 )
			{
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♥    | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♠    | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♣    | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♦    | ");
			}
		}
		else if ( card == 3)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♥    | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♠    | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♣    | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♦    | ");
			}
		}
		else if ( card == 4)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");			
			}
			else if ( suit == 2 )
			{
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			}
		}
		else if ( card == 5)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			}
		}
		else if ( card == 6)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			}
		}
		else if ( card == 7)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			}
		}
		else if ( card == 8)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t| ♦     ♦ | ");
			}
		}
		else if ( card == 9)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			}
		}
		else if ( card == 10)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t| ♥     ♥ | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t| ♠     ♠ | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t| ♣     ♣ | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t| ♦     ♦ | ");
			}
		}
		else if ( card == 11)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|   ♥♥♥   | ");
			System.out.println("\t|  ♥   ♥  | ");
			System.out.println("\t| ♥ ♥ ♥ ♥ | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|   ♠♠♠   | ");
			System.out.println("\t|  ♠   ♠  | ");
			System.out.println("\t| ♠ ♠ ♠ ♠ | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");	

			}
			else if ( suit == 3 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|   ♣♣♣   | ");
			System.out.println("\t|  ♣   ♣  | ");
			System.out.println("\t| ♣ ♣ ♣ ♣ | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");	
			}
			else if ( suit == 4 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|   ♦♦♦   | ");
			System.out.println("\t|  ♦   ♦  | ");
			System.out.println("\t| ♦ ♦ ♦ ♦ | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");	
			}
		}	
		else if ( card == 12)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|     ♥   | ");
			System.out.println("\t|     ♥   | ");
			System.out.println("\t|     ♥   | ");
			System.out.println("\t|  ♥  ♥   | ");
			System.out.println("\t|  ♥♥♥♥   | ");
			System.out.println("\t|         | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|     ♠   | ");
			System.out.println("\t|     ♠   | ");
			System.out.println("\t|     ♠   | ");
			System.out.println("\t|  ♠  ♠   | ");
			System.out.println("\t|  ♠♠♠♠   | ");
			System.out.println("\t|         | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|     ♣   | ");
			System.out.println("\t|     ♣   | ");
			System.out.println("\t|     ♣   | ");
			System.out.println("\t|  ♣  ♣   | ");
			System.out.println("\t|  ♣♣♣♣   | ");
			System.out.println("\t|         | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|     ♦   | ");
			System.out.println("\t|     ♦   | ");
			System.out.println("\t|     ♦   | ");
			System.out.println("\t|  ♦  ♦   | ");
			System.out.println("\t|  ♦♦♦♦   | ");
			System.out.println("\t|         | ");
			}
		}
		else if ( card == 13)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|   ♥♥♥   | ");
			System.out.println("\t|  ♥   ♥  | ");
			System.out.println("\t|  ♥   ♥  | ");
			System.out.println("\t|  ♥ ♥ ♥  | ");
			System.out.println("\t|   ♥♥♥♥  | ");
			System.out.println("\t|       ♥ | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|   ♠♠♠   | ");
			System.out.println("\t|  ♠   ♠  | ");
			System.out.println("\t|  ♠   ♠  | ");
			System.out.println("\t|  ♠ ♠ ♠  | ");
			System.out.println("\t|   ♠♠♠♠  | ");
			System.out.println("\t|       ♠ | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|   ♣♣♣   | ");
			System.out.println("\t|  ♣   ♣  | ");
			System.out.println("\t|  ♣   ♣  | ");
			System.out.println("\t|  ♣ ♣ ♣  | ");
			System.out.println("\t|   ♣♣♣♣  | ");
			System.out.println("\t|       ♣ | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|   ♦♦♦   | ");
			System.out.println("\t|  ♦   ♦  | ");
			System.out.println("\t|  ♦   ♦  | ");
			System.out.println("\t|  ♦ ♦ ♦  | ");
			System.out.println("\t|   ♦♦♦♦  | ");
			System.out.println("\t|       ♦ | ");
			}
		}
		else if ( card == 14)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|  ♥   ♥  | ");
			System.out.println("\t|  ♥  ♥   | ");
			System.out.println("\t|  ♥ ♥    | ");
			System.out.println("\t|  ♥  ♥   | ");
			System.out.println("\t|  ♥   ♥  | ");
			System.out.println("\t|         | ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|  ♠   ♠  | ");
			System.out.println("\t|  ♠  ♠   | ");
			System.out.println("\t|  ♠ ♠    | ");
			System.out.println("\t|  ♠  ♠   | ");
			System.out.println("\t|  ♠   ♠  | ");
			System.out.println("\t|         | ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|  ♣   ♣  | ");
			System.out.println("\t|  ♣  ♣   | ");
			System.out.println("\t|  ♣ ♣    | ");
			System.out.println("\t|  ♣  ♣   | ");
			System.out.println("\t|  ♣   ♣  | ");
			System.out.println("\t|         | ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t|         | ");
			System.out.println("\t|  ♦   ♦  | ");
			System.out.println("\t|  ♦  ♦   | ");
			System.out.println("\t|  ♦ ♦    | ");
			System.out.println("\t|  ♦  ♦   | ");
			System.out.println("\t|  ♦   ♦  | ");
			System.out.println("\t|         | ");
			}
		} 
		System.out.println("\t+---------+ ");
	}
}