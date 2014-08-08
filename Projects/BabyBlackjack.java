import java.util.Random;

public class BabyBlackjack
{
	public static void main(String[] args)
	{

		Random r = new Random();
		//Random rDealer = new Random();

		int playerCard1 = 1 + r.nextInt(10);
		int playerCard2 = 1 + r.nextInt(10);
		int dealerCard1 = 1 + r.nextInt(10);
		int dealerCard2 = 1 + r.nextInt(10);
		int playerSum = playerCard1 + playerCard2;
		int dealerSum = dealerCard1 + dealerCard2;

		System.out.println( "Baby Blackjack!" );
		System.out.println();

		System.out.println( "You draw " + playerCard1 + " and " + playerCard2 + "." );
		System.out.println( "Your total is " + playerSum + ".");
		System.out.println();
		System.out.println( "The dealer has " + dealerCard1 + " and " + dealerCard2 + ".");
		System.out.println( "Dealer's total is " + dealerSum + ".");
		System.out.println();
		
		

		if (playerSum > dealerSum) {

			System.out.println( "YOU WIN!" );

		} else if (dealerSum > playerSum) {
			System.out.println( "Dealer wins." );
		} else
			System.out.println("Push");
		

	}
}

	// http://programmingbydoing.com/a/baby-blackjack.html