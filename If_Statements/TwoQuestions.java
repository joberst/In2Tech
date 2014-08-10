import java.util.Scanner;

public class TwoQuestions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String answer1, answer2;

		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");
		System.out.println();
		System.out.print("Question 1) Is it an animal, vegetable, or mineral?\n> ");
		answer1 = keyboard.next();

		System.out.print("Question 2) Is it bigger than a breadbox? (y/n)\n> ");
		answer2 = keyboard.next();

		if (answer1.equals("animal")){
			if (answer2.equals("n")){
				System.out.println("My guess is that you are thinking of a chinchilla.");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			} else if (answer2.equals("y")){
				System.out.println("My guess is that you are thinking of a capybara.");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			}
		}
		if (answer1.equals("vegetable")){
			if (answer2.equals("n")){
				System.out.println("My guess is that you are thinking of a pea.");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			} else if (answer2.equals("y")){
				System.out.println("My guess is that you are thinking of a watermelon.");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			}
		}
		if (answer1.equals("mineral")){
			if (answer2.equals("n")){
				System.out.println("My guess is that you are thinking of a diamonds!");
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			} else if (answer2.equals("y")){
				System.out.println("My guess is that you are thinking of a very large diamond!");
				System.out.println();
				System.out.println("I would ask you if I'm right, but I don't actually care.");
			}
		}

	}
}