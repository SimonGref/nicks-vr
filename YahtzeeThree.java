import java.util.Scanner;

public class YahtzeeThree
{
        
	
	public static void FirstLine()
	{
	   System.out.println("Welcome to Yahtzee! I'll roll the dice to get you started");
	}
	
	public static void SecondLine()
	{
	   System.out.println("Time for Round 2!");
	}
	
	public static void ThirdLine()
	{
	   System.out.println("It's Round 3, time to die!");
	}
	
	public static void FourthLine()
	{
	   System.out.println("Let Round 4 begin!");
	}
	
	public static void FifthLine()
	{
	   System.out.println("The Final Round. You should give up now you fool!");
	}
	
	public static void EndLine()
	{
	   System.out.println("Game Over.");
	}
	
	//public static void Uppers
	
	   static int score1 = 0;
		static int score2 = 0;
		static int score3 = 0;
		static int score4 = 0;
		static int score5 = 0;
		static int score6 = 0;
		//static int score = score1 + score2 + score3 + score4 + score5 + score6;  
		static int cat1 = 0;
		static int cat2 = 0;
		static int cat3 = 0;
		static int cat4 = 0;
		static int cat5 = 0;
		static int cat6 = 0;
		static int score;
		static int total1;
		//int x;
		
		//UpperScores us = new UpperScores();
	
	   static int[] dice;
	
	public YahtzeeThree(int score)
	{
	   this.score = score;
	}
	
	public int GetScore()
	{
	   return score;
	}
	
	public void SetScore(int score)
	{
      this.score = score;
	}
	
	public void FirstRoll()
	{  
	   UpperScores us = new UpperScores(0);  
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int a;
		int b;
		//int score = 0;
		//empty  
		
		dice = new int[5];
		dice[0] = (int)(1 + Math.random() * 6);
		dice[1] = (int)(1 + Math.random() * 6);
		dice[2] = (int)(1 + Math.random() * 6);
		dice[3] = (int)(1 + Math.random() * 6);
		dice[4] = (int)(1 + Math.random() * 6);
		
		System.out.println("You rolled: " +dice[0]+dice[1]+dice[2]+dice[3]+dice[4]);
		System.out.println("Do you want to keep "+ dice[0] +" ? 1 is Yes, 0 is No");
		a = input.nextInt();
		if (a == 1){
		   //random1 = 0;	
		}
		else if (a == 0){
		   dice[0] = (int)(1 + Math.random() * 6);  
			//score++;
		}
		System.out.println("Do you want to keep "+ dice[1] +" ?");
		a = input.nextInt();
		if (a == 1){
		   //random1 = 0;	
		}
		else if (a == 0){
		   dice[1] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[2] +" ?");
		a = input.nextInt();
		if (a == 1){
		   //random1 = 0;	
		}
		else if (a == 0){
		   dice[2] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[3] +" ?");
		a = input.nextInt();
		if (a == 1){
		   //random1 = 0;	
		}
		else if (a == 0){
		   dice[3] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[4] +" ?");
		a = input.nextInt();
		if (a == 1){
		   //random1 = 0;	
		}
		else if (a == 0){
		   dice[4] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Your second roll was: "+dice[0]+dice[1]+dice[2]+dice[3]+dice[4]);
		System.out.println("Do you want to keep "+ dice[0] +" ? 1 is Yes, 0 is No");
		a = input.nextInt();
		if (a == 1){
		   //random1 = 0;	
		}
		else if (a == 0){
		   dice[0] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[1] +" ?");
		a = input.nextInt();
		if (a == 1){
		   //random1 = 0;	
		}
		else if (a == 0){
		   dice[1] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[2] +" ?");
		a = input.nextInt();
		if (a == 1){
		   //random1 = 0;	
		}
		else if (a == 0){
		   dice[2] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[3] +" ?");
		a = input.nextInt();
		if (a == 1){
		   //random1 = 0;	
		}
		else if (a == 0){
		   dice[3] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[4] +" ?");
		a = input.nextInt();
		if (a == 1){
		   //random1 = 0;	
		}
		else if (a == 0){
		   dice[4] = (int)(1 + Math.random() * 6);
	 }
	 System.out.println("Your final roll was: "+dice[0]+dice[1]+dice[2]+dice[3]+dice[4]);
	 System.out.println("Which category do you want to score? Press 7 for Upper, press 8 for Lower (1-6).");
	 b = input.nextInt();
	 if (b == 7)
	 {
	    us.countDice();
	 }
	 else {
	  a = input.nextInt();    
			
		 switch(a){
		 case 1:
		 if(dice[0]==1)
		 {
		   score1 = score1 + 1;
		 }
		 if(dice[1]==1)
		 {
		   score1 = score1 + 1;
		 }
		 if(dice[2]==1)
		 {
		   score1 = score1 + 1;
		 }
		 if(dice[3]==1)
		 {
		   score1 = score1 + 1;
		 }
		 if(dice[4]==1)
		 {
		   score1 = score1 + 1;
		 }
		 break;
		 case 2:
		 if(dice[0]==2)
		 {
		   score2 = score2 + 2;
		 }
		 if(dice[1]==2)
		 {
		   score2 = score2 + 2;
		 }
		 if(dice[2]==2)
		 {
		   score2 = score2 + 2;
		 }
		 if(dice[3]==2)
		 {
		   score2 = score2 + 2;
		 }
		 if(dice[4]==2)
		 {
		   score2 = score2 + 2;
		 }
		 break;
		 case 3:
		 if(dice[0]==3)
		 {
		   score3 = score3 + 3;
		 }
		 if(dice[1]==3)
		 {
		   score3 = score3 + 3;
		 }
		 if(dice[2]==3)
		 {
		   score3 = score3 + 3;
		 }
		 if(dice[3]==3)
		 {
		   score3 = score3 + 3;
		 }
		 if(dice[4]==3)
		 {
		   score3 = score3 + 3;
		 }
		 break;
		 case 4:
		 if(dice[0]==4)
		 {
		   score4 = score4 + 4;
		 }
		 if(dice[1]==4)
		 {
		   score4 = score4 + 4;
		 }
		 if(dice[2]==4)
		 {
		   score4 = score4 + 4;
		 }
		 if(dice[3]==4)
		 {
		   score4 = score4 + 4;
		 }
		 if(dice[4]==4)
		 {
		   score4 = score4 + 4;
		 }
		 break;
		 case 5:
		 if(dice[0]==5)
		 {
		   score5 = score5 + 5;
		 }
		 if(dice[1]==5)
		 {
		   score5 = score5 + 5;
		 }
		 if(dice[2]==5)
		 {
		   score5 = score5 + 5;
		 }
		 if(dice[3]==5)
		 {
		   score5 = score5 + 5;
		 }
		 if(dice[4]==5)
		 {
		   score5 = score5 + 5;
		 }
		 break;
		 case 6:
		 if(dice[0]==6)
		 {
		   score6 = score6 + 6;
		 }
		 if(dice[1]==6)
		 {
		   score6 = score6 + 6;
		 }
		 if(dice[2]==6)
		 {
		   score6 = score6 + 6;
		 }
		 if(dice[3]==6)
		 {
		   score6 = score6 + 6;
		 }
		 if(dice[4]==6)
		 {
		   score6 = score6 + 6;
		 }
		 break;
		 default:
		 System.out.println("Dude put in a real number from 1-6");
		 break;
		 //return a;
		}
		 
		score = score1 + score2 + score3 + score4 + score5 + score6;
		GetScore();
		SetScore(score);
		//total1 = GetScore()+the other one;  
		System.out.println("You scored in the "+a+" category");
		System.out.println("Your scores are currently: 1's "+score1+" 2's "+score2+" 3's "+score3+" 4's "+score4+" 5's "+score5+ " 6's "+score6);
		System.out.println("Total: "+GetScore());
	   
		 
	}
 }
	
	/*public static void GetScore()
		{
		int score = score1 + score2 + score3 + score4 + score5 + score6;  
		System.out.println("You scored POOP in the "+a+" category");
		System.out.println("Your scores are currently: 1's "+score1+" 2's "+score2+" 3's "+score3+" 4's "+score4+" 5's "+score5+ " 6's "+score6);
		System.out.println("Total: "+score);
		 }*/
	 
}
