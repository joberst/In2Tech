import java.util.Scanner;

public class UserInfo
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		
		String firstName;
		String lastName;
		int grade;
		String studentID;
		String login;
		double gpa; 
		
		
		System.out.println("Please enter the following information so I can sell it for a profit! \n" );
		
		System.out.print( "First name: " );
		firstName = keyboard.next();
		
		System.out.print( "Last name: " );
		lastName = keyboard.next();
		
		System.out.print( "Grade: " );
		grade = keyboard.nextInt();
		
		System.out.print( "Student ID: " );
		studentID = keyboard.next();
		
		System.out.print( "Login: " );
		login = keyboard.next();
		
		System.out.print( "GPA: " );
		gpa = keyboard.nextDouble();
		
		System.out.println( "Your Information: " );
		System.out.println("\t Login: " + login );
		System.out.println("\t ID:    " + studentID );
		System.out.println("\t Name:  " + lastName + ", " + firstName );
		System.out.println("\t GPA:   " + gpa );
		System.out.println("\t Grade: " + grade );
	}
}

// http://programmingbydoing.com/a/more-user-input-of-data.html