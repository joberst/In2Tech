import java.util.Scanner;

public class TwoMoreQuestions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String answer1, answer2;

		System.out.println("TWO MORE QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");
		System.out.println();
		System.out.print("Question 1) Does it belong inside, outside, or either?\n> ");
		answer1 = keyboard.next();

		System.out.print("Question 2) Is it a living thing? (y/n)\n> ");
		answer2 = keyboard.next();

		if (answer1.equals("inside") && answer2.equals("n")){
				System.out.println("My guess is that you are thinking of a NKOTB Poster.");
				System.out.println("I would ask you if I'm right, but I'm pretty sure I'm right.");
		}
		if (answer1.equals("inside") && answer2.equals("y")){
				System.out.println("My guess is that you are thinking of toxic mold.");
				System.out.println("I would ask you if I'm right, but I think what's more important " + 
								   "is that you get someone out there to look at that mold.");	
		}


		if (answer1.equals("outside") && answer2.equals("n")){
				System.out.println("My guess is that you are thinking of the a car.");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
		}
		if (answer1.equals("outside") && answer2.equals("y")){
				System.out.println("My guess is that you are thinking of an elephant.");
				System.out.println("I would ask you if I'm right, but I don't actually care.");	
		}


		if (answer1.equals("either") && answer2.equals("n")){
				System.out.println("My guess is that you are thinking of a chair!");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
		}
		if (answer1.equals("either") && answer2.equals("y")){
				System.out.println("My guess is that you are thinking of a plant");
				System.out.println();
				System.out.println("I would ask you if I'm right, but I don't actually care.");
		}
		

	}
}