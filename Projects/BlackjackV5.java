import java.util.Scanner;
import java.util.Random;

public class BlackjackV5
{
	public static void main(String[] args)
	{
		
		String game = "y";
		while ( game.equals("y") )
		{

			Scanner keyboard = new Scanner(System.in);
			Random r = new Random();
			CardGraphic card = new CardGraphic();

			int playerCard1 = 2 + r.nextInt(13);
			int playerCard2 = 2 + r.nextInt(13);
			int dealerCard1 = 2 + r.nextInt(13);
			int dealerCard2 = 2 + r.nextInt(13);
			int playerSum = cardValue(cardName(playerCard1)) + cardValue(cardName(playerCard2));
			int dealerSum = cardValue(cardName(dealerCard1)) + cardValue(cardName(dealerCard2));
			int aceChoice, aceTracker = 0, dealerAceTracker = 0;
			String choice; // hit or stay


			// Game begins
			System.out.println();
			System.out.println( "It's Blackjack Baby!" );
			System.out.println( "(And remember, it's only a gambling problem if you lose.)");
			System.out.println();
			System.out.println( "Let's play!");
			System.out.println();

			System.out.println( "You draw " + cardName(playerCard1) + " and " + cardName(playerCard2) + "." );
			card.displayCard(playerCard1);
			card.displayCard(playerCard2);

			cardValue(cardName(playerCard1));
			cardValue(cardName(playerCard2));

			if ( cardName(playerCard1) == "Ace" && cardName(playerCard2) == "Ace" )
			{
			System.out.println( "Aces!");
			}
			else
			{
			System.out.println( "Your total is " + playerSum + ".");
			}
			spaces();


			if ( playerSum == 21 ) // game over blackjack
			{
				System.out.println( "Blackjack!");
				spaces();
			}
			else if ( playerSum > 21 && ( cardName(playerCard1) != "Ace" &&  cardName(playerCard2) != "Ace" ) ) // game over bust
			{
				System.out.println( "Bust!");
				spaces();
			}
			
			else // game goes on
			{

				if ( cardName(playerCard1) == "Ace" && cardName(playerCard2) == "Ace" )
				{
					aceTracker+=2;
					System.out.print( "Do you want your total to equal 2 or 12? \n> " );
					aceChoice = keyboard.nextInt();
						if ( aceChoice == 2 )
						{
							playerSum = 2;
						}
						else if ( aceChoice == 12 )
						{
							playerSum = 12;
						}
						else  
						{
							System.out.println( "Please choose either 2 or 12.");
						}
					
					System.out.println( "Your total is " + playerSum + ".");
				}
				else if ( cardName(playerCard1) == "Ace" || cardName(playerCard2) == "Ace")
				{
					aceTracker++;
				}


				System.out.println( "The dealer has drawn her cards and flipped over the first one." ); 
				System.out.println( "Dealer shows " + cardName(dealerCard1) + "."); 
				card.displayCard(dealerCard1);
				spaces();


				System.out.print( "Would you like to \"hit\" or \"stay\"? \n> ");
				choice = keyboard.next();

				
				// player hit/stay scenarios
				while ( playerSum < 21 && ! choice.toLowerCase().equals("stay") )
				{	

					if ( playerSum <= 21 && choice.toLowerCase().equals("hit") ) 
					{
						int playerCard3 = 2 + r.nextInt(13);
						System.out.println( "You have drawn a " + cardName(playerCard3) + "." );
						card.displayCard(playerCard3);

						if ( cardName(playerCard3) == "Ace" ) 
						{
							aceTracker = 1;
						}

						if ( (cardValue(cardName(playerCard3)) + playerSum) > 21 && aceTracker >=1 )
						{
							playerSum = cardValue(cardName(playerCard3)) + playerSum - 10;
							System.out.println( "Your card total is " + playerSum + "." );
							if ( playerSum == 21 )
							{
								System.out.println( "Blackjack!");
							}
							else
							{
							System.out.print( "Would you like to \"hit\" or \"stay\"? \n> ");
							choice = keyboard.next();
							System.out.println();
							aceTracker = 0;
							}
						}
						else
						{
							if ( playerSum > 11 && cardName(playerCard3) == "Ace")
							{
								playerSum += cardValue(cardName(playerCard3)) - 10;
								aceTracker++;
							}
							else
							{
								playerSum += cardValue(cardName(playerCard3));
							}
							
							
							if ( playerSum > 21 && cardName(playerCard3) != "Ace")
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
							else if ( playerSum > 21 && cardName(playerCard3) == "Ace")
							{
								playerSum = playerSum - 10;
								System.out.println( "Your card total is " + playerSum + "." );
							}
							else 
							{
								System.out.println( "Your total is " + playerSum + "." );
								System.out.print( "Would you like to \"hit\" or \"stay\"? \n> ");
								choice = keyboard.next();
								System.out.println();
							}
						}
					}	
					else if ( ! choice.toLowerCase().equals("stay") || ! choice.toLowerCase().equals("hit") )
					{
						System.out.print( "Please choose \"hit or \"stay\".\n> " );
						choice = keyboard.next();
						System.out.println();
					} 
				} 

				// determines if player busts and game over or if dealer gets to play
				if ( playerSum < 21)
				{
					System.out.println( "You have chosen to stay with a card total of " + playerSum + "." );
					spaces();
				
					// Dealer's play
					System.out.println( "Dealer has flipped over her second card. It is a " + cardName(dealerCard2) + ".");
					card.displayCard(dealerCard2);
					
					// catch for dealer double Aces in first two drawn
					if ( cardName(dealerCard2) == "Ace" && dealerSum > 21 )
					{
						dealerSum += cardValue(cardName(dealerCard2)) - 10;
						System.out.println( "Dealer's total is " + dealerSum + ".");
					}
					if ( cardName(dealerCard2) == "Ace" )
					{
						dealerAceTracker++;
						System.out.println( "Dealer's total is " + dealerSum + ".");
					}
					else 
					{
					System.out.println( "Dealer's total is " + dealerSum + ".");
					}
				

					// dealer hit/stay scenarios
					while ( dealerSum <= 16 && !(playerSum > 21) && dealerSum < playerSum || dealerSum < playerSum && playerSum <= 21 )
					{
						int dealerCard3 = 2 + r.nextInt(13);

						System.out.println( "Dealer chooses to hit and draws a " + cardName(dealerCard3) + ".");
						card.displayCard(dealerCard3);
						
						// check if card is Ace/if 11 would bust
						if ( dealerSum > 10 && cardName(dealerCard3) == "Ace")
						{
							dealerSum += cardValue(cardName(dealerCard3)) - 10;
							dealerAceTracker++;
							System.out.println( "Dealer's total IS " + ( dealerSum) + ".");
						}
						else
						{
							dealerSum += cardValue(cardName(dealerCard3));
							System.out.println( "Dealer's total is " + dealerSum + ".");
						}


						if ( dealerSum == 21 )
						{
							System.out.println( "Dealer has " + dealerSum + ".");
						}
						else if ( dealerSum > 21 && cardName(dealerCard3) != "Ace")
						{
							System.out.println( "Dealer busts!" );
						}
						else if ( dealerSum > 21 && cardName(dealerCard3) == "Ace")
						{
							dealerSum = dealerSum - 10 ;
							//System.out.println( "Dealer has " + dealerSum + ".");
						}
						else if (dealerSum < 21 && playerSum < dealerSum)
						{
							System.out.println( "Dealer chooses to stay.");
						}			
					}

					// recap
					if ( dealerSum <= 21 && !(playerSum > 21) ) // score recap
					{
						spaces();
						System.out.println( "Dealer has " + dealerSum + "." );
						System.out.println( "You have " + playerSum + "." );
						System.out.println();
					}

				} // end if player busts
				else if (playerSum > 21)
				{
					System.out.println( "Bummer" );
					System.out.println();
				}

			} // end play goes on


			// Game-over scenarios
			if ( playerSum <= 21 && playerSum > dealerSum || dealerSum > 21)
			{
				System.out.println();
				System.out.println( "You win!" );
				System.out.println( "You get all the money!" );
				game = gamePlay();

			}
			else if ( dealerSum <= 21 && dealerSum > playerSum)
			{
				System.out.println();
				System.out.println( "Dealer wins" );
				System.out.println( "You lose. Please take a \"When the Fun Stops\" pamphlet." );
				game = gamePlay();
			}
			else if ( playerSum > 21 && dealerSum <= 21)
			{
				System.out.println();
				System.out.println( "Dealer wins, you busted!" );
				System.out.println( "You lose. Please take a \"When the Fun Stops\" pamphlet." );
				game = gamePlay();
			} 
			else if ( playerSum == dealerSum)
			{
				System.out.println();
				System.out.println( "Push" );
				System.out.println( "Dealer wins." );
				game = gamePlay();
			}		
			else if ( playerSum > 21 && dealerSum > 21)
			{
				System.out.println();
				System.out.println( "Double bust" );
				System.out.println( "Everyone loses!" );
				game = gamePlay();
			}

		} // end game while

		System.out.println();
		System.out.println( "Thanks for playing!");

	} // end main method

	// option to play again
	public static String gamePlay()
	{
		Scanner keyboard = new Scanner(System.in);
		String game = "";
		System.out.println();
		System.out.print( "Would you like to try your luck again? (y/n)\n> ");
		game = keyboard.next();
		return game;
	} 


	// prints three new lines :)
	public static void spaces()
	{
		System.out.println();
		System.out.println();
		System.out.println();
	} 


	// Displays face card name instead of value
	public static String cardName( int card )
	{
		String a = " ";
		
		if (card == 11) 
		{
			a = "Ace";
		} 
		else if (card == 12) 
		{
			a = "Jack";
		} 
		else if (card == 13) 
		{
			a = "Queen";
		} 
		else if (card == 14) 
		{
			a = "King";
		} 
		else 
		{
			a = String.valueOf(card);
		}

		return a;
	} 

	
	// Assign correct values to face cards
	public static int cardValue( String card )
	{
		int a = 0;


		if (card.equals("Jack") || card.equals("Queen") || card.equals("King")) 
		{
			a = 10;
		} 
		else if (card.equals("Ace")) 
		{
			a = 11;
		} 
		else 
		{
			a = Integer.parseInt(card);
		}

		return a;
	} 


} // end public class


