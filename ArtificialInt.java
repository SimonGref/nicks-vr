//import java.util.Scanner;
//hehe
public class ArtificialInt
{
	
	//public static void Uppers
	
	   static int scoreone = 0;
		static int scoretwo = 0;
		static int scorethree = 0;
		static int scorefour = 0;
		static int scorefive = 0;
		static int scoresix = 0;
		//static int score = score1 + score2 + score3 + score4 + score5 + score6;  
		static int qat1 = 0;
		static int qat2 = 0;
		static int qat3 = 0;
		static int qat4 = 0;
		static int qat5 = 0;
		static int qat6 = 0;
		static int scoreA;
		
		//UpperScores us = new UpperScores();
	
	   static int[] dice;
	
	public ArtificialInt(int scoreA)
	{
	   this.scoreA = scoreA;
	}
	
	public int GetScoreA()
	{
	   return scoreA;
	}
	
	public void SetScoreA(int scoreA)
	{
      this.scoreA = scoreA;
	}
	
	public void ComputerRoll()
	{  
	   UpperComputer cpu = new UpperComputer(0);  
		//Scanner input = new Scanner(System.in);
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
		a = (int)(1 + Math.random() * 4);
		if (a <= 2){
		   //random1 = 0;	
		}
		else if (a > 2){
		   dice[0] = (int)(1 + Math.random() * 6);  
			//score++;
		}
		System.out.println("Do you want to keep "+ dice[1] +" ?");
		a = (int)(1 + Math.random() * 4);
		if (a <= 2){
		   //random1 = 0;	
		}
		else if (a > 2){
		   dice[1] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[2] +" ?");
		a = (int)(1 + Math.random() * 4);
		if (a <= 2){
		   //random1 = 0;	
		}
		else if (a > 2){
		   dice[2] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[3] +" ?");
		a = (int)(1 + Math.random() * 4);
		if (a <= 1){
		   //random1 = 0;	
		}
		else if (a > 2){
		   dice[3] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[4] +" ?");
		a = (int)(1 + Math.random() * 4);
		if (a <= 2){
		   //random1 = 0;	
		}
		else if (a > 2){
		   dice[4] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Your second roll was: "+dice[0]+dice[1]+dice[2]+dice[3]+dice[4]);
		System.out.println("Do you want to keep "+ dice[0] +" ? 1 is Yes, 0 is No");
		a = (int)(1 + Math.random() * 4);
		if (a <= 2){
		   //random1 = 0;	
		}
		else if (a > 2){
		   dice[0] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[1] +" ?");
		a = (int)(1 + Math.random() * 4);
		if (a <= 2){
		   //random1 = 0;	
		}
		else if (a > 2){
		   dice[1] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[2] +" ?");
	   a = (int)(1 + Math.random() * 4);
		if (a <= 2){
		   //random1 = 0;	
		}
		else if (a > 2){
		   dice[2] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[3] +" ?");
		a = (int)(1 + Math.random() * 4);
		if (a <= 2){
		   //random1 = 0;	
		}
		else if (a > 2){
		   dice[3] = (int)(1 + Math.random() * 6);
		}
		System.out.println("Do you want to keep "+ dice[4] +" ?");
		a = (int)(1 + Math.random() * 4);
		if (a <= 2){
		   //random1 = 0;	
		}
		else if (a > 2){
		   dice[4] = (int)(1 + Math.random() * 6);
	 }
	 System.out.println("Your final roll was: "+dice[0]+dice[1]+dice[2]+dice[3]+dice[4]);
	 System.out.println("Which category do you want to score? Press 1 for Upper, press any other number for Lower (1-6).");
	 b = (int)(1 + Math.random() * 12);
	 if (b >= 7)
	 {
	    cpu.countDice();
	 }
	 else if (b <= 6){    
			
		 switch(b){
		 case 1:
		 if(dice[0]==1)
		 {
		   scoreone = scoreone + 1;
		 }
		 if(dice[1]==1)
		 {
		   scoreone = scoreone + 1;
		 }
		 if(dice[2]==1)
		 {
		   scoreone = scoreone + 1;
		 }
		 if(dice[3]==1)
		 {
		   scoreone = scoreone + 1;
		 }
		 if(dice[4]==1)
		 {
		   scoreone = scoreone + 1;
		 }
		 break;
		 case 2:
		 if(dice[0]==2)
		 {
		   scoretwo = scoretwo + 2;
		 }
		 if(dice[1]==2)
		 {
		   scoretwo = scoretwo + 2;
		 }
		 if(dice[2]==2)
		 {
		   scoretwo = scoretwo + 2;
		 }
		 if(dice[3]==2)
		 {
		   scoretwo = scoretwo + 2;
		 }
		 if(dice[4]==2)
		 {
		   scoretwo = scoretwo + 2;
		 }
		 break;
		 case 3:
		 if(dice[0]==3)
		 {
		   scorethree = scorethree + 3;
		 }
		 if(dice[1]==3)
		 {
		   scorethree = scorethree + 3;
		 }
		 if(dice[2]==3)
		 {
		   scorethree = scorethree + 3;
		 }
		 if(dice[3]==3)
		 {
		   scorethree = scorethree + 3;
		 }
		 if(dice[4]==3)
		 {
		   scorethree = scorethree + 3;
		 }
		 break;
		 case 4:
		 if(dice[0]==4)
		 {
		   scorefour = scorefour + 4;
		 }
		 if(dice[1]==4)
		 {
		   scorefour = scorefour + 4;
		 }
		 if(dice[2]==4)
		 {
		   scorefour = scorefour + 4;
		 }
		 if(dice[3]==4)
		 {
		   scorefour = scorefour + 4;
		 }
		 if(dice[4]==4)
		 {
		   scorefour = scorefour + 4;
		 }
		 break;
		 case 5:
		 if(dice[0]==5)
		 {
		   scorefive = scorefive + 5;
		 }
		 if(dice[1]==5)
		 {
		   scorefive = scorefive + 5;
		 }
		 if(dice[2]==5)
		 {
		   scorefive = scorefive + 5;
		 }
		 if(dice[3]==5)
		 {
		   scorefive = scorefive + 5;
		 }
		 if(dice[4]==5)
		 {
		   scorefive = scorefive + 5;
		 }
		 break;
		 case 6:
		 if(dice[0]==6)
		 {
		   scoresix = scoresix + 6;
		 }
		 if(dice[1]==6)
		 {
		   scoresix = scoresix + 6;
		 }
		 if(dice[2]==6)
		 {
		   scoresix = scoresix + 6;
		 }
		 if(dice[3]==6)
		 {
		   scoresix = scoresix + 6;
		 }
		 if(dice[4]==6)
		 {
		   scoresix = scoresix + 6;
		 }
		 break;
		 default:
		 System.out.println("Dude put in a real number from 1-6");
		 break;
		 //return a;
		}
		 
		scoreA = scoreone + scoretwo + scorethree + scorefour + scorefive + scoresix;
		GetScoreA();
		SetScoreA(scoreA);  
		System.out.println("You scored in the "+b+" category");
		System.out.println("Your scores are currently: 1's "+scoreone+" 2's "+scoretwo+" 3's "+scorethree+" 4's "+scorefour+" 5's "+scorefive+ " 6's "+scoresix);
		System.out.println("Total: "+GetScoreA());
	
		 
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
