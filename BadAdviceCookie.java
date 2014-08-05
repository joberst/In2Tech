import java.util.Random;

public class BadAdviceCookie
{
	public static void main(String[] args)
	{
		Random rando = new Random();

		int fortune = 1 + rando.nextInt(6);
		int lottoNum1 = 1 + rando.nextInt(54);
		int lottoNum2 = 1 + rando.nextInt(54);
		int lottoNum3 = 1 + rando.nextInt(54);
		int lottoNum4 = 1 + rando.nextInt(54);
		int lottoNum5 = 1 + rando.nextInt(54);
		int lottoNum6 = 1 + rando.nextInt(54);


		System.out.println("Hope you enjoyed your meal!");
		System.out.println();


		if ( fortune == 1 ) {
			System.out.println("Fortune cookie says: \"The grass is greener on the other side.\"");
			System.out.println(lottoNum1 + " - " + lottoNum2 + " - " + lottoNum3 + " - " + lottoNum4 + " - " + lottoNum5 + " - " + lottoNum6);
		} else if ( fortune == 2 ) {
			System.out.println("Fortune cookie says: \"All work and no play is the quickest way to the top.\"");
			System.out.println(lottoNum1 + " - " + lottoNum2 + " - " + lottoNum3 + " - " + lottoNum4 + " - " + lottoNum5 + " - " + lottoNum6);
		} else if ( fortune == 3 ) {
			System.out.println("Fortune cookie says: \"If you fall off the horse, just walk.\"");
			System.out.println(lottoNum1 + " - " + lottoNum2 + " - " + lottoNum3 + " - " + lottoNum4 + " - " + lottoNum5 + " - " + lottoNum6);
		} else if ( fortune == 4 ) {
			System.out.println("Fortune cookie says: \"If at first you don't succeed, try something else.\"");
			System.out.println(lottoNum1 + " - " + lottoNum2 + " - " + lottoNum3 + " - " + lottoNum4 + " - " + lottoNum5 + " - " + lottoNum6);
		} else if ( fortune == 5 ) {
			System.out.println("Fortune cookie says: \"Bet it all on red.\"");
			System.out.println(lottoNum1 + " - " + lottoNum2 + " - " + lottoNum3 + " - " + lottoNum4 + " - " + lottoNum5 + " - " + lottoNum6);
		} else if ( fortune == 6 ) {
			System.out.println("Fortune cookie says: \"If it seems too hard, it probably is.\"");
			System.out.println(lottoNum1 + " - " + lottoNum2 + " - " + lottoNum3 + " - " + lottoNum4 + " - " + lottoNum5 + " - " + lottoNum6);
		} else 
		System.out.println("Mmmmmm");


	}
}

// http://programmingbydoing.com/a/fortune-cookie.html