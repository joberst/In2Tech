import java.util.Scanner;

public class Quiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );
		
		String status;
		int answer1, answer2, answer3, tally = 0;
		
		
		
		System.out.print( "Are you ready for a quiz? (y/n) " );
		status = keyboard.next();
		
		if ( status.equals("y")) {
			System.out.println( "Great! Here it comes!\n" );
		}
		else {
		    System.out.println( "Well, good luck anyway because here is comes!\n " );
		}
		
		
		System.out.print( "Q1) What is my favorite color? \n" + 
		"(Select number next to the correct answer)\n\t1) Purple\n\t2) Green\n\t3) Black\n\n> " );
		answer1 = keyboard.nextInt();
		
		if ( answer1 == 3 ) {
			System.out.println( "That's right!\n ");
			tally++;
		} else {
			System.out.println( "Sorry, that's not my favorite color. I thought you knew me better.\n " );
		}
		
		System.out.print( "Q2) Does a bear crap in the woods? \n" +
		"(Select number next to the correct answer)\n\t1) yes\n\t2) no\n\n> " );
		answer2 = keyboard.nextInt();
		
		if ( answer2 == 1 ) {
			System.out.println( "That's right!\n ");
			tally++;
		} else {
			System.out.println( "Sorry, bears do crap in the woods. (Most of them anyway)\n" );
		}
		
		System.out.print( "Q3) How much wood could a woodchuck chuck if a woodchuck could chuck wood? \n" + 
		"(Select number next to the correct answer)\n\t1) Two pounds\n\t2) Ten pounds\n\t3) I have no idea\n\n> " );
		answer3 = keyboard.nextInt();
		
		if ( answer3 == 3 ) {
			System.out.println( "That's right! It really is a mystery.");
			tally++;
		} else {
			System.out.println( "Sorry. Although it's never been proven, you're probably wrong." );
		}
		System.out.println();
		
		
		
		//Determine score
		
		
		if (tally == 3) {
			System.out.print( "Overall, you got 3 out of 3 correct!\nThank you for playing!" );
		} else if (tally == 2) {
			System.out.println( "Overall, you got 2 out of 3 correct.\nThank you for playing!" );
		} else if (tally == 1){
			System.out.println( "Overall, you got 1 out of 3 correct.\nThank you for playing!" );
		} else {
			System.out.println( "Overall, you got 0 out of 3 correct.\nTry again!" );
		}
		
	}
}
		
		
// http://programmingbydoing.com/a/a-little-quiz.html
		
		
		
		
		
		
		
		
		
		
		
		