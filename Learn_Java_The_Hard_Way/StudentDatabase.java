class Student
{
	String name;
	int credits;
	double gpa;
}

public class StudentDatabase
{
	public static void main( String[] args )
	{
		Student[] db;
		db = new Student[4];

		db[0] = new Student();
		db[0].name = "Esteban";
		db[0].credits = 43;
		db[0].gpa = 2.9;

		db[1] = new Student();
		db[1].name = "Dave";
		db[1].credits = 15;
		db[1].gpa = 4.0;

		db[2] = new Student();
		db[2].name = "Michelle";
		db[2].credits = 132;
		db[2].gpa = 3.72;

		db[3] = new Student();
		db[3].name = "Jessica";
		db[3].credits = 160;
		db[3].gpa = 4.72;

		for ( int i = 0; i < db.length; i++ )
		{
			System.out.println( "Name: " + db[i].name );
			System.out.println("\tCredit hours: " + db[i].credits );
			System.out.println("\tGPA: " + db[i].gpa + "\n" );
		}

		int max = 0;
		for ( int i = 1; i < db.length; i++ )
			if ( db[i].gpa > db[max].gpa )
				max = i;
		System.out.println( db[max].name + " has the highest GPA." );

		int hiCred = 0;
		for ( int i = 1; i < db.length; i++ )
			if ( db[i].credits < db[hiCred].credits )
				hiCred = i;
		System.out.println( db[hiCred].name + " has the least credits." );

	}
}

/*

Study Drills
1. Change the array to have a capacity of 4 instead of 3. Change nothing else and compile and run 
the program. Do you understand why the program blows up?
	ANSWER: Yes. Because you have to change the number of "slots" to 4 for it to work.

2. Now add some more code to put values into the fields for your new student. Give this new 
student a higher GPA than “Dave” and confirm that the code correctly labels them as having the 
highest GPA.
	ANSWER: 


3. Change the code so that it finds the person with the fewest credits instead of the person with the 
highest GPA.
	ANSWER:

*/

// LJH: Exercise 55