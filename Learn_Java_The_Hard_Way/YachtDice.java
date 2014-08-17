public class YachtDice
{
	public static void main( String[] args )
	{
		int roll1, roll2, roll3, roll4, roll5;
		boolean allTheSame;

		do
		{
			roll1 = 1 + (int) (Math.random()*6);
			roll2 = 1 + (int) (Math.random()*6);
			roll3 = 1 + (int) (Math.random()*6);
			roll4 = 1 + (int) (Math.random()*6);
			roll5 = 1 + (int) (Math.random()*6);
			System.out.println("\nYou rolled: " + roll1 + " " + roll2 + " " + roll3 + " " + roll4 + " " + roll5);
			showDice(roll1);
			showDice(roll2);
			showDice(roll3);
			showDice(roll4);
			showDice(roll5);
			allTheSame = (roll1 == roll2 && roll2 == roll3 && roll3 == roll4 && roll4 == roll5);

		} while ( ! allTheSame );
		System.out.println("The Yacht!!");
	}

	public static void showDice( int roll )
	{
		System.out.println("+-----+");
		if ( roll == 1 )
		{
			System.out.println("|     |");
			System.out.println("|  o  |");
			System.out.println("|     |");
		}
		else if ( roll == 2 )
		{
			System.out.println("|o    |");
			System.out.println("|     |");
			System.out.println("|    o|");
		}
		else if ( roll == 3 )
		{
			System.out.println("|o    |");
			System.out.println("|  o  |");
			System.out.println("|    o|");
		}
		else if ( roll == 4 )
		{
			System.out.println("|o   o|");
			System.out.println("|     |");
			System.out.println("|o   o|");
		}
		else if ( roll == 5 )
		{
			System.out.println("|o   o|");
			System.out.println("|  o  |");
			System.out.println("|o   o|");
		}
		else if ( roll == 6 )
		{
			System.out.println("|o   o|");
			System.out.println("|o   o|");
			System.out.println("|o   o|");
		}
		System.out.println("+-----+");
	}
}

// LJH: Exercise 36





