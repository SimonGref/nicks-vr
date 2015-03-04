public class PlayMe
{
   public static void main(String [] args)
	{  
	   int x;  
		YahtzeeThree three = new YahtzeeThree(0);
		PlayerTwo two = new PlayerTwo(0);
	   
		three.FirstLine();
		for (x = 2; x < 14; x++)
	 {  
		three.FirstRoll();
		System.out.println("Now it is Player 2's turn.");
		two.SecondRoll();
		System.out.println("Now it is time to start Round " +x+ " !");
	}
		
		if (three.GetScore() > two.GetScorePoo())
		{
		   System.out.println("Player 1 wins!");
		}
		else if (three.GetScore() < two.GetScorePoo())
		{
		   System.out.println("Player 2 wins!");
		}
		else if (three.GetScore() == two.GetScorePoo())
		{
		   System.out.println("It's a tie. How uninteresting.");
		}
		three.EndLine();
	}
}