import java.util.Scanner;

public class TinyAdventure
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String choice1, choice2, choice3, choice4, choice5, choice6, choice7, choice8;

		System.out.println();
		System.out.println(" WELCOME TO A SCARY, TINY ADVENTURE!");
		System.out.println(" There's only one way out of this house. Will you make the right choice?");
		System.out.println();
		

		// Page level: one
		System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"basement\"?");
		choice1 = keyboard.next();
		System.out.println();

			if (choice1.equals("upstairs")) 
			{
			
				// Page level: Two / upstairs
				System.out.println("Once upstairs, there is a long, dark hallway to your left, and an open door with stairs" + 
								   " leading up to what must be the attic. Do you want to go down the dark \"hallway\" or" + 
								   " up the stairs to the \"attic\"?");
				choice2 = keyboard.next();
				System.out.println();

					if (choice2.equals("hallway")) 
					{
						// Page level: Three / hallway
						System.out.println("As you walk down the dark hallway, you get an eerie feeling that someone, or something, is following you. " +
									      "Do you \"turn\" around to see what's there, or do you \"run\" as fast as you can into the darkness?");
						choice3 = keyboard.next();
						System.out.println();

						if (choice3.equals("turn")) 
						{
							// Page level: Four / turn around
							System.out.println("You're so scared, you can't move a muscle. You feel the warm breath of someone, " + 
										      " or something, on the back of your neck. You slowly turn your head around, terrified " + 
										      " of what you will find!");
						} // end choice3 turn around if

						if (choice3.equals("run")) 
						{
							// Page level: Four / start running
							System.out.println("You take off running as fast as you can down the pitch dark hallway, sinister footsteps " +
										   	   "fast approaching. You check all the doorknobs to try and hide, but they're all are locked! ");
						} // end choice3 start running if	

					} // end choice2 hallway if

					if (choice2.equals("attic")) 
					{
						// Page level: Three / attic
						System.out.println("Slowly ascending up te attic stairs, you notice it's pitch dark up there and you get a sickly " +
									      "feeling in your stomache that you are not alone. You're seriously second guessing your choice " +
									      "to go up to the attic in such a creepy house. Do you want to go back to the \"hallway\" or " + 
									      "keep going up into the \"darkness\"?");
						choice3 = keyboard.next();
						System.out.println();

						if (choice3.equals("hallway")) 
						{
							// Page level: Four / hallway
							System.out.println("You're just too frightened to continue up the stairs to the attic. As you head back " + 
											   " towards the attic door, you hear a sinister voice saying \"You will never leave!\"" + 
											   " Just then, the door to the attic slams shut and you hear footsteps in the darkness");
						} // end choice3 hallway if

						if (choice3.equals("darkness")) 
						{
							// Page level: Four / darkness
							System.out.println("As you continue up the stairs and into the attic, you notice that there is a small " + 
											   "box at the far end of the room. As you walk towards the box, you hear a voice saying " + 
											   "\" You will never leave!");
						} // end choice3 darkness if

					} // end choice2 attck if

			} // end choice1 upstairs if


			if (choice1.equals("basement")) 
			{
			
				// Page level: Two / basement
				System.out.println("You make your way to the basement and discover that the light switch doesn't work." + 
								   " As you slowly decend down the creaky staircase, the basement door slams shut behind you! " +
								   " Do you run back up the stairs and try to open the \"door\" or do you keep decending into " + 
								   " the \"darkness\"?");
				choice2 = keyboard.next();
				System.out.println();

				if (choice2.equals("door")) 
				{
					// Page level: Three / door
					System.out.println("You race back up the basement stairs towards the door. When you get there, the handle is cold as ice as " + 
									   "you impatiently shake it back and forth. It's locked! Do you  start screaming for someone to \"help\" you, " + 
									   " or do you turn around and face the \"darkness\"?");
					choice3 = keyboard.next();
					System.out.println();

						if (choice3.equals("help")) 
						{
							// Page level: Four / help
							System.out.println("You're scared out of your wits and start screaming for help as loud as you can in your frightened state. " + 
											   " After what seems like an hour, you stop screaming for help and realize you're all alone. Or are you?");
						} // end choice3 help if

						if (choice3.equals("darkness")) 
						{
							// Page level: Four / darkness
							System.out.println("You carefully and quietly walk down the stairs into the basement. You notice a terrible smell and that suddenly " + 
											   " the temperature has dropped to what feels like below freezing. You can see your cold breath in front of your face " + 
											   " through the light from a tiny window on the far end of the room. Suddenly, someone, or something grabs your arm!");
						} // end choice3 darkness if

				} // end choice2 door if

				if (choice2.equals("darkness")) 
				{
					// Page level: Three / darkness
					System.out.println("Step by creaky, wooden step you can hear your heart beating as you make your way to the basement floor. " +
									   " There's a tiny window on the far side of the room, letting in just enought light to cast a dozen frightening " + 
									   " shadows across the items in the basement. You hear a scratching sound in the darkest corner of the room. " + 
									   "Do you walk towards the \"sound\" or head over towards the \"window\"?");
					choice3 = keyboard.next();
					System.out.println();

						if (choice3.equals("sound")) 
						{
							// Page level: Four / sound
							System.out.println("Despite your better judgement, you move slowly towards the faint scratching sound coming from a dark corner of the " + 
											   " basement. As you approach the noise, it becomes louder and louder. Suddenly, you realize it isn't scratching at all. " +
											   " You reach your hand slowly... into the dark corner... and afraid of what you might find.");
							System.out.println("It's your lost cell phone! It was just vibrating from several messages alerts. It has just enough battery to make a call" +
											   " so you dial your nearest Pizza Hut and give special instructions to come inside and deliver the pizza to the " + 
											   " basement. This way you get rescued and a pizza.");
							
						} // end choice3 sound if

						if (choice3.equals("window")) 
						{
							// Page level: Four / window
							System.out.println("You make your way towards the window, hopeful that even though it looks small, you might be able to squeeze out. " + 
											   " The basement is damp and freezing, uncommonly freezin in fact. Just as you approach the window and realize it is " + 
											   " far too small to fit through, you hear a loud BANG right behind you!");
							
						} // end choice3 window if

				} // end choice2 darkness if

			} // end choice1 basement if

	} // end main

} // end class