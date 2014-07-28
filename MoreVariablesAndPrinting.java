public class MoreVariablesAndPrinting
{
	public static void main( String[] args )
	{
		String name, eyes, teeth, hair;
		int age, height, weight;
		double altHeight, altWeight;
		
		name = "Zed A. Shaw";
		age = 35; // not a lie
		height = 74; // inches
		altHeight = height * 2.54; // cm
		weight = 180; // lbs
		altWeight = weight / 2.2046; // kg
		eyes = "Blue";
		teeth = "White";
		hair = "Brown";
		
		
		System.out.println( "Let's talk about " + name + "." );
		System.out.println( "He's " + height + " (or " + altHeight + ") inches tall." );
		System.out.println( "He's " + weight + " (or " + altWeight + ") pounds heavy." );
		System.out.println( "Actually, that's not too heavy." );
		System.out.println( "He's got " + eyes + " eyes and " + hair + " hair." );
		System.out.println( "His teeth are usually " + teeth + " depending on the coffee." ); 
		
		//This line is tricky to get exactly right.
		System.out.println( "If I add " + age + "," + height + ", and " + weight
			+ " I get " + (age + height + weight) + "," );
	}
}
		
		// http://programmingbydoing.com/a/more-variables-and-printing.html