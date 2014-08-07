import java.util.Scanner;

public class Adventure2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String choice = " ";
		int nextroom = 1;

		System.out.println();
		System.out.println(" WELCOME TO A SCARY, TINY ADVENTURE!");
		System.out.println(" There's only one way out of this house. Will you make the right choice?");
		System.out.println();
		

		


		while (nextroom != 0) 
		{


			// Room 1 Inside the house
			if (nextroom == 1 ) 
			{
				System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"basement\"?");
				System.out.print("> ");
				choice = keyboard.next();
				System.out.println();
				if ( choice.equals("upstairs") )
					nextroom = 2;
				else if ( choice.equals("basement") )
					nextroom = 3;
				else
					System.out.println( "ERROR." );
			}



				// Room 2 Upstairs
				if (nextroom == 2 )
				{
					System.out.println("You're at the top of the upstairs and there is a long, dark hallway to your left, and an open door with stairs" + 
									   " leading up to what must be the attic. Do you want to go down the dark \"hallway\" or" + 
									   " up the stairs to the \"attic\"? Or you can go \"back\" downstairs");
					System.out.print("> ");
					choice = keyboard.next();
					System.out.println();
					if ( choice.equals("hallway") )
						nextroom = 4;
					else if ( choice.equals("attic") )
						nextroom = 5;
					else if ( choice.equals("back") )
						nextroom = 1;
					else
						System.out.println( "ERROR." );
				}



					// Room 4 The Hallway
					if (nextroom == 4 ) 
					{
						// Page level: Three / hallway
						System.out.println("As you walk down the dark hallway, you get an eerie feeling that someone, or something, is at the " +
									      "end of the hall. Do you want to continue to walk down the hallway into the \"darkness\" or do you want to turn \"back\" ?");
						System.out.print("> ");
						choice = keyboard.next();
						System.out.println();
						if ( choice.equals("darkness") )
							nextroom = 6;
						else if ( choice.equals("back") )
							nextroom = 2;
						else
							System.out.println( "ERROR." );
					}
 


					// Room 5 Stairs to the Attic
					if (nextroom == 5 )
					{
						System.out.println("Slowly ascending up te attic stairs, you notice it's pitch dark up there and you get a sickly " +
									      "feeling in your stomach that you are not alone. You're seriously second guessing your choice " +
									      "to go up to the attic in such a creepy house. Do you want to go \"back\" to the hallway or " + 
									      "keep going up into the \"darkness\"?");
						choice = keyboard.next();
						System.out.println();
						if ( choice.equals("darkness") )
							nextroom = 7;
						else if ( choice.equals("back") )
							nextroom = 8;
						else
							System.out.println( "ERROR." );
					}



						// Room 7 The Attic
						if (nextroom == 7) 
						{
							System.out.println("As you continue up the stairs and into the attic, you notice that there is a small " + 
											   "box at the far end of the room. As you walk towards the box, you hear a voice saying " + 
											   "\" You will never leave! And you never do.");
							System.out.println("THE END ");
							nextroom = 0;	
						} // end choice3 darkness if



						// Room 6 The Darkness (hallway)
						if (nextroom == 6) 
						{
							System.out.println("You take off running as fast as you can down the pitch dark hallway, towards a dark sinister " +
										   	   "figure. You realize you made a terrible mistake. You check all the doorknobs to try and hide, but they're all are locked! " + 
										   	   " You must turn \"back\".");
							choice = keyboard.next();
							System.out.println();
							if ( choice.equals("back") )
								nextroom = 2;
							else
								System.out.println( "ERROR." );
						}



						// Room 8 back from the attic
						if (nextroom == 8) 
						{
							// Page level: Four / hallway
							System.out.println("You're just too frightened to continue up the stairs to the attic. As you head back " + 
											   " towards the attic door, you hear a sinister voice saying \"You will never leave!\"" + 
											   " Suddenly, the door to the attic slams shut and you hear footsteps coming towards you in the darkness");
							System.out.println("THE END ");
							nextroom = 0;		
						}


					

				// Room 3 Down to Basement
				if (nextroom == 3 )
				{
	
					System.out.println("You make your way to the basement and discover that the light switch doesn't work." + 
									   " As you slowly decend down the creaky staircase, the basement door slams shut behind you! " +
									   " Do you keep decending into the \"darkness\"? Or do you run \"back\" upstairs? " );
					System.out.print("> ");
					choice = keyboard.next();
					System.out.println();
					if ( choice.equals("darkness") )
						nextroom = 10;
					else if ( choice.equals("back") )
						nextroom = 9;
					else
						System.out.println( "ERROR." );
				}



				// Room 9 The end
				if (nextroom == 9) 
				{
	
					System.out.println("You race back up the basement stairs towards the door. When you get there, the handle is cold as ice as " + 
									   "you impatiently shake it back and forth. It's locked! Looks like this is the end. " );
					System.out.println("THE END ");
					System.out.print("> ");
					choice = keyboard.next();
					System.out.println();
					if ( choice.equals("darkness") )
						nextroom = 10;
					else if ( choice.equals("back") )
						nextroom = 9;
					else
						System.out.println( "ERROR." );
					nextroom = 0;	
				}



					// Room 10 Basement
					if (nextroom == 10) 
					{
						
						System.out.println("Step by creaky, wooden step you can hear your heart beating as you make your way to the basement floor. " +
										   "There's a tiny window on the far side of the room, letting in just enought light to cast a dozen frightening " + 
										   "shadows across the items in the basement. You hear a scratching sound in the darkest corner of the room. " + 
										   "Despite your better judgement, you head towards the sound. As you approach the noise, it becomes louder and louder." + 
										   " Suddenly, you realize it isn't scratching at all. " +
										   " You reach your hand slowly... into the dark corner... and afraid of what you might find." +
										   "It's your lost cell phone! It was just vibrating from several messages alerts. It has just enough battery to make a call" +
										   " so you dial your nearest Pizza Hut and give special instructions to come inside and deliver the pizza to the " + 
										   " basement. This way you get rescued and a pizza." );
						System.out.println("THE END HAPPILY EVER AFTER ");
						nextroom = 0;	
					}

		} // end while


	} // end main

} // end class







