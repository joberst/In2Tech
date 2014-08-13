// 2 - Ace . Face cards show as name of face. Ace = 11 all the time. 

import java.util.Scanner;
import java.util.Random;

public class BlackjackSuitNames
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();

		int playerCard1 = 2 + r.nextInt(13);
		int playerCard2 = 2 + r.nextInt(13);
		int dealerCard1 = 2 + r.nextInt(13);
		int dealerCard2 = 2 + r.nextInt(13);
		int playerSum = cardValue(cardName(playerCard1)) + cardValue(cardName(playerCard2));
		int dealerSum = cardValue(cardName(dealerCard1)) + cardValue(cardName(dealerCard2));
		String choice; // hit or stay


		// Game begins
		System.out.println();
		System.out.println( "It's Blackjack Baby!" );
		System.out.println( "(And remember, it's only a gambling problem if you lose.)");
		System.out.println();
		System.out.println( "Let's play!");
		System.out.println();

		System.out.println( "You draw " + cardName(playerCard1) + " and " + cardName(playerCard2) + "." );
		displayCard(playerCard1);
		displayCard(playerCard2);
		System.out.println();
		cardValue(cardName(playerCard1));
		cardValue(cardName(playerCard2));
		System.out.println( "Your total is " + playerSum + ".");
		System.out.println();
		System.out.println();
		
		System.out.println( "The dealer has drawn her cards and flipped over the first one." ); 
		System.out.println( "Dealer shows " + cardName(dealerCard1) + "."); 
		displayCard(dealerCard1);
		System.out.println();
		System.out.println();


		System.out.print( "Would you like to \"hit\" or \"stay\"? \n> ");
		choice = keyboard.next();

		
		// Player hit/stay scenarios
		while ( playerSum < 21  && ! choice.toLowerCase().equals("stay") )
		{	

			if ( playerSum <= 21 && choice.toLowerCase().equals("hit") ) 
			{
				int playerCard3 = 2 + r.nextInt(13);
				System.out.println( "You have drawn a " + cardName(playerCard3) + "." );
				displayCard(playerCard3);
				playerSum += cardValue(cardName(playerCard3));
					if ( playerSum > 21 )
					{
						System.out.println( "Your card total is " + playerSum + "." );
						System.out.println( "You bust!" );
						System.out.println();
					}
					else if (playerSum == 21 )
					{
						System.out.println( "Your card total is " + playerSum + "." );
						System.out.println( "Blackjack!" );
						System.out.println();
					}
					else 
					{
						System.out.println( "Your total is " + playerSum + "." );
						System.out.print( "Would you like to \"hit\" or \"stay\"? \n> ");
						choice = keyboard.next();
					}
			}	
			
			else if ( ! choice.toLowerCase().equals("stay") || ! choice.toLowerCase().equals("hit") )
			{
				System.out.println( "Please choose \"hit or \"stay\".\n> " );
				choice = keyboard.next();
			} 
		} 

		if ( playerSum <= 21)
		{
			System.out.println( "You have chosen to stay with a card total of " + playerSum + "." );
			System.out.println();
			System.out.println();
		}
		
	
		// Dealer's play
		System.out.println( "Dealer has flipped over her second card. It is a " + cardName(dealerCard2) + ".");
		displayCard(dealerCard2);
		System.out.println( "Dealer's total is " + dealerSum + ".");
	
		// Dealer hit/stay scenarios
		while ( dealerSum <= 16 && !(playerSum > 21) || dealerSum < playerSum && playerSum <= 21 )
		{
			int dealerCard3 = 2 + r.nextInt(13);

				System.out.println( "Dealer chooses to hit and draws a " + cardName(dealerCard3) + ".");
				displayCard(dealerCard3);
				dealerSum += cardValue(cardName(dealerCard3));
				System.out.println( "Dealer's total is " + dealerSum + ".");
					if ( dealerSum == 21 )
					{
						System.out.println( "Dealer has " + dealerSum + ".");
					}
					else if ( dealerSum > 21 )
					{
						System.out.println( "Dealer busts!" );
					}
					else if (dealerSum < 21 && playerSum < dealerSum)
					{
						System.out.println( "Dealer chooses to stay.");
					}			
		}

		if ( dealerSum <= 21 && !(playerSum > 21) ) 
		{
			System.out.println();
			System.out.println( "Dealer chose to stay with a total of " + dealerSum + "." );
			System.out.println( "Your total is " + playerSum + "." );
			System.out.println();
		}


		// Game-over scenarios
		if ( playerSum <= 21 && playerSum > dealerSum || dealerSum > 21)
		{
			System.out.println();
			System.out.println( "You win!" );
			System.out.println( "You get all the money!" );
		}
		else if ( dealerSum <= 21 && dealerSum > playerSum)
		{
			System.out.println();
			System.out.println( "Dealer wins" );
			System.out.println( "You lose. Please take a \"When the Fun Stops\" pamphlet on your way out." );
		}
		else if ( playerSum > 21 && dealerSum <= 21)
		{
			System.out.println();
			System.out.println( "Dealer wins because you busted!" );
			System.out.println( "You lose. Please take a \"When the Fun Stops\" pamphlet on your way out." );
		} 
		else if ( playerSum == dealerSum)
		{
			System.out.println();
			System.out.println( "Push" );
			System.out.println( "Dealer wins" );
		}		
		else if ( playerSum > 21 && dealerSum > 21)
		{
			System.out.println();
			System.out.println( "Double bust" );
			System.out.println( "Everyone loses!" );
		}

	} // end main method


	// Displays face card name instead of value
	public static String cardName( int card )
	{
		String a = " ";

		if ( card == 2 )
			a = "2";
		if ( card == 3 )
			a = "3";
		if ( card == 4 )
			a = "4";
		if ( card == 5 )
			a = "5";
		if ( card == 6 )
			a = "6";
		if ( card == 7 )
			a = "7";
		if ( card == 8 )
			a = "8";
		if ( card == 9 )
			a = "9";
		if ( card == 10 )
			a = "10";	
		if ( card == 11 )
			a = "Ace";
		if ( card == 12 )
			a = "Jack";
		if ( card == 13 )
			a = "Queen";
		if ( card == 14 )
			a = "King";

		return a;
	} // end cardName


	// Assign correct values to face cards
	public static int cardValue( String card )
	{
		int a = 0;

		if ( card.equals("2"))
			a = 2;
		if ( card.equals("3"))
			a = 3;
		if ( card.equals("4"))
			a = 4;
		if ( card.equals("5"))
			a = 5;
		if ( card.equals("6"))
			a = 6;
		if ( card.equals("7"))
			a = 7;
		if ( card.equals("8"))
			a = 8;
		if ( card.equals("9"))
			a = 9;
		if ( card.equals("10"))
			a = 10;
		if ( card.equals("Ace"))
			a = 11;
		if ( card.equals("Jack"))
			a = 10;
		if ( card.equals("Queen"))
			a = 10;
		if ( card.equals("King"))
			a = 10;
		return a;
	} // end cardName method

		
	// Display card on screen
	public static void displayCard( int card )
	{
		
		if ( card == 2 )
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t+---------+ ");
			}
		}
		else if ( card == 3)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t+---------+ ");
			}
		}
		else if ( card == 4)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t+---------+ ");
			}
		}
		else if ( card == 5)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t+---------+ ");	
			}
		}
		else if ( card == 6)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t+---------+ ");
			}
		}
		else if ( card == 7)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t+---------+ ");
			}
		}
		else if ( card == 8)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t+---------+ ");
			}
		}
		else if ( card == 9)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t+---------+ ");
			}
		}
		else if ( card == 10)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t| ♥     ♥ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t| ♠     ♠ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t| ♣     ♣ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|         | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t| ♦     ♦ | ");
			System.out.println("\t+---------+ ");
			}
		}
		else if ( card == 11)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♥    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♠    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♣    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|    ♦    | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
		}	
		else if ( card == 12)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|     ♥   | ");
			System.out.println("\t|     ♥   | ");
			System.out.println("\t|     ♥   | ");
			System.out.println("\t|  ♥  ♥   | ");
			System.out.println("\t|  ♥♥♥♥   | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|     ♠   | ");
			System.out.println("\t|     ♠   | ");
			System.out.println("\t|     ♠   | ");
			System.out.println("\t|  ♠  ♠   | ");
			System.out.println("\t|  ♠♠♠♠   | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|     ♣   | ");
			System.out.println("\t|     ♣   | ");
			System.out.println("\t|     ♣   | ");
			System.out.println("\t|  ♣  ♣   | ");
			System.out.println("\t|  ♣♣♣♣   | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|     ♦   | ");
			System.out.println("\t|     ♦   | ");
			System.out.println("\t|     ♦   | ");
			System.out.println("\t|  ♦  ♦   | ");
			System.out.println("\t|  ♦♦♦♦   | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
		}
		else if ( card == 13)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|   ♥♥♥   | ");
			System.out.println("\t|  ♥   ♥  | ");
			System.out.println("\t|  ♥   ♥  | ");
			System.out.println("\t|  ♥ ♥ ♥  | ");
			System.out.println("\t|   ♥♥♥♥  | ");
			System.out.println("\t|       ♥ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|   ♠♠♠   | ");
			System.out.println("\t|  ♠   ♠  | ");
			System.out.println("\t|  ♠   ♠  | ");
			System.out.println("\t|  ♠ ♠ ♠  | ");
			System.out.println("\t|   ♠♠♠♠  | ");
			System.out.println("\t|       ♠ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|   ♣♣♣   | ");
			System.out.println("\t|  ♣   ♣  | ");
			System.out.println("\t|  ♣   ♣  | ");
			System.out.println("\t|  ♣ ♣ ♣  | ");
			System.out.println("\t|   ♣♣♣♣  | ");
			System.out.println("\t|       ♣ | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|   ♦♦♦   | ");
			System.out.println("\t|  ♦   ♦  | ");
			System.out.println("\t|  ♦   ♦  | ");
			System.out.println("\t|  ♦ ♦ ♦  | ");
			System.out.println("\t|   ♦♦♦♦  | ");
			System.out.println("\t|       ♦ | ");
			System.out.println("\t+---------+ ");
			}
		}
		else if ( card == 14)
		{
			int suit = 1 + (int) ( Math.random()*4 );

			if ( suit == 1 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|  ♥   ♥  | ");
			System.out.println("\t|  ♥  ♥   | ");
			System.out.println("\t|  ♥ ♥    | ");
			System.out.println("\t|  ♥  ♥   | ");
			System.out.println("\t|  ♥   ♥  | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 2 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|  ♠   ♠  | ");
			System.out.println("\t|  ♠  ♠   | ");
			System.out.println("\t|  ♠ ♠    | ");
			System.out.println("\t|  ♠  ♠   | ");
			System.out.println("\t|  ♠   ♠  | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 3 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|  ♣   ♣  | ");
			System.out.println("\t|  ♣  ♣   | ");
			System.out.println("\t|  ♣ ♣    | ");
			System.out.println("\t|  ♣  ♣   | ");
			System.out.println("\t|  ♣   ♣  | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
			else if ( suit == 4 )
			{
			System.out.println("\t+---------+ ");
			System.out.println("\t|         | ");
			System.out.println("\t|  ♦   ♦  | ");
			System.out.println("\t|  ♦  ♦   | ");
			System.out.println("\t|  ♦ ♦    | ");
			System.out.println("\t|  ♦  ♦   | ");
			System.out.println("\t|  ♦   ♦  | ");
			System.out.println("\t|         | ");
			System.out.println("\t+---------+ ");
			}
		} 

	} // end displayCard method

} // end public class












