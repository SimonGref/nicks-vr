public class PlayComp
{
   public static void main(String [] args)
	{  
	   int z;  
		YahtzeeThree three = new YahtzeeThree(0);
		ArtificialInt ai = new ArtificialInt(0);
	   
		three.FirstLine();
		for (z = 2; z < 14; z++)
	 {  
		three.FirstRoll();
		System.out.println("Now it is Player 2's turn.");
		ai.ComputerRoll();
		System.out.println("Now it is time to start Round " +z+ " !");
	}
		
		if (three.GetScore() > ai.GetScoreA())
		{
		   System.out.println("Player 1 wins!");
		}
		else if (three.GetScore() < ai.GetScoreA())
		{
		   System.out.println("The Computer wins! You inferior human!");
		}
		else if (three.GetScore() == ai.GetScoreA())
		{
		   System.out.println("It's a tie. How uninteresting.");
		}
		three.EndLine();
	}
}