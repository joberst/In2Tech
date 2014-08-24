class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class MailingAddresses
{
	public static void main( String[] args)
	{
		Address uno, dos, tres, four;

		uno = new Address();
		uno.street = "191 Marigold Lane";
		uno.city = "Miami";
		uno.state = "FL";
		uno.zip = 33179;

		dos = new Address();
		dos.street = "3028 Losh Lane";
		dos.city = "Crafton";
		dos.state = "PA";
		dos.zip = 15205;

		tres = new Address();
		tres.street = "2693 Habah Street";
		tres.city = "Hickory";
		tres.state = "NC";
		tres.zip = 28601;

		four = new Address();
		four.street = "1234 Main Street Way";
		four.city = "Heretownville";
		four.state = "NV";
		four.zip = 89191;

		System.out.println( uno.street + "\n" + uno.city + ", " + uno.state + " " + uno.zip + "\n" );
		System.out.println( dos.street + "\n" + dos.city + ", " + dos.state + " " + dos.zip + "\n" );
		System.out.println( tres.street + "\n" + tres.city + ", " + tres.state + " " + tres.zip + "\n" );
		System.out.println( four.street + "\n" + four.city + ", " + four.state + " " + four.zip + "\n" );
	}
}

/*

Study Drills
1. Create a fourth Address variable on line 13 and change the code to put your mailing address in it.
Don’t forget to print it out at the bottom.
	ANSWERL: Done


*/

// LJH: Exercise 53