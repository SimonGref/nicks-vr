import java.util.Scanner;

public class PlayerTwo
{
	
	//public static void Uppers
	
	   static int scoreOne = 0;
		static int scoreTwo = 0;
		static int scoreThree = 0;
		static int scoreFour = 0;
		static int scoreFive = 0;
		static int scoreSix = 0;
		//static int score = score1 + score2 + score3 + score4 + score5 + score6;  
		static int kat1 = 0;
		static int kat2 = 0;
		static int kat3 = 0;
		static int kat4 = 0;
		static int kat5 = 0;
		static int kat6 = 0;
		static int scorePoo;
		static int total2;
		
		//UpperScores us = new UpperScores();
	
	   static int[] dice;
	
	public PlayerTwo(int scorePoo)
	{
	   this.scorePoo = scorePoo;
	}
	
	public int GetScorePoo()
	{
	   return scorePoo;
	}
	
	public void SetScorePoo(int scorePoo)
	{
      this.scorePoo = scorePoo;
	}
	
	public void SecondRoll()
	{  
	   UpperScorez uz = new UpperScorez(0);  
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
	    uz.countDice();
	 }
	 else {
	  a = input.nextInt();    
			
		 switch(a){
		 case 1:
		 if(dice[0]==1)
		 {
		   scoreOne = scoreOne + 1;
		 }
		 if(dice[1]==1)
		 {
		   scoreOne = scoreOne + 1;
		 }
		 if(dice[2]==1)
		 {
		   scoreOne = scoreOne + 1;
		 }
		 if(dice[3]==1)
		 {
		   scoreOne = scoreOne + 1;
		 }
		 if(dice[4]==1)
		 {
		   scoreOne = scoreOne + 1;
		 }
		 break;
		 case 2:
		 if(dice[0]==2)
		 {
		   scoreTwo = scoreTwo + 2;
		 }
		 if(dice[1]==2)
		 {
		   scoreTwo = scoreTwo + 2;
		 }
		 if(dice[2]==2)
		 {
		   scoreTwo = scoreTwo + 2;
		 }
		 if(dice[3]==2)
		 {
		   scoreTwo = scoreTwo + 2;
		 }
		 if(dice[4]==2)
		 {
		   scoreTwo = scoreTwo + 2;
		 }
		 break;
		 case 3:
		 if(dice[0]==3)
		 {
		   scoreThree = scoreThree + 3;
		 }
		 if(dice[1]==3)
		 {
		   scoreThree = scoreThree + 3;
		 }
		 if(dice[2]==3)
		 {
		   scoreThree = scoreThree + 3;
		 }
		 if(dice[3]==3)
		 {
		   scoreThree = scoreThree + 3;
		 }
		 if(dice[4]==3)
		 {
		   scoreThree = scoreThree + 3;
		 }
		 break;
		 case 4:
		 if(dice[0]==4)
		 {
		   scoreFour = scoreFour + 4;
		 }
		 if(dice[1]==4)
		 {
		   scoreFour = scoreFour + 4;
		 }
		 if(dice[2]==4)
		 {
		   scoreFour = scoreFour + 4;
		 }
		 if(dice[3]==4)
		 {
		   scoreFour = scoreFour + 4;
		 }
		 if(dice[4]==4)
		 {
		   scoreFour = scoreFour + 4;
		 }
		 break;
		 case 5:
		 if(dice[0]==5)
		 {
		   scoreFive = scoreFive + 5;
		 }
		 if(dice[1]==5)
		 {
		   scoreFive = scoreFive + 5;
		 }
		 if(dice[2]==5)
		 {
		   scoreFive = scoreFive + 5;
		 }
		 if(dice[3]==5)
		 {
		   scoreFive = scoreFive + 5;
		 }
		 if(dice[4]==5)
		 {
		   scoreFive = scoreFive + 5;
		 }
		 break;
		 case 6:
		 if(dice[0]==6)
		 {
		   scoreSix = scoreSix + 6;
		 }
		 if(dice[1]==6)
		 {
		   scoreSix = scoreSix + 6;
		 }
		 if(dice[2]==6)
		 {
		   scoreSix = scoreSix + 6;
		 }
		 if(dice[3]==6)
		 {
		   scoreSix = scoreSix + 6;
		 }
		 if(dice[4]==6)
		 {
		   scoreSix = scoreSix + 6;
		 }
		 break;
		 default:
		 System.out.println("Dude put in a real number from 1-6");
		 break;
		 //return a;
		}
		 
		scorePoo = scoreOne + scoreTwo + scoreThree + scoreFour + scoreFive + scoreSix;
		GetScorePoo();
		SetScorePoo(scorePoo);
		//total2 = GetScorePoo() + uz.GetUscoreZ();  
		System.out.println("You scored in the "+a+" category");
		System.out.println("Your scores are currently: 1's "+scoreOne+" 2's "+scoreTwo+" 3's "+scoreThree+" 4's "+scoreFour+" 5's "+scoreFive+ " 6's "+scoreSix);
		System.out.println("Total: "+GetScorePoo());
		
	
		 
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
