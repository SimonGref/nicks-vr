import java.util.*;

public class UpperComputer
{
	static int[] CountResults = {0,0,0,0,0,0}; //The array for the number of 1s, 2s, etc. in your Dice[].
	static int CountStraight = 0;
	static String s;
	static int count;
	static boolean found2;
	static boolean found3;
	//static int consecutiveValues;
	static String YahtzeeConstants;
	static int Ucscore;
	static int pc;
	static int y;
	//static int threeKind;
	
	public UpperComputer(int Ucscore)
	{
	   this.Ucscore = Ucscore;
	}
	
	public static int GetUcscore()
	{
	   return Ucscore;
	}
	
	public static void SetUcscore(int Ucscore)
	{
      Ucscore = Ucscore;
	}
	
	
	static ArtificialInt ai = new ArtificialInt(0);
	
	public void countDice(){
		for(int i=0; i<5; i++) {
			for(int j=0; j<6; j++) {
				if ( ai.dice[i]==(j+1) ){
					CountResults[j]++;
				}
			}
		}
	//}
	
	//public static void Pancake()
	//{    
		System.out.println("Upper: t = 3 of a kind, q = 4 of a kind, f = Full House, s = Small Straight, l = Large Straight, y = Yahtzee, c = Chance");
		y = (int)(1 + Math.random() * 6); 
		switch (y)
		{
		   case 1: //method for three of a kind
			if (check3())
			{
			   
				pc = ai.dice[0] + ai.dice[1] + ai.dice[2] + ai.dice[3] + ai.dice[4]; //set p to a value that is the sum of all DICE ROLLS
				SetUcscore(pc); //So now set the total score equal to the present score + the new 3 of a kind
				System.out.println("You scored Three of a Kind! Your total is now " +(ai.GetScoreA() + GetUcscore())+ " !");
			}
			else
			{
			   //set 3 of a kind score to zero
				System.out.println("No such luck.");
			}
			break;
			case 2: //method for four of a kind
			if (check4())
			{
			   
				pc = ai.dice[0] + ai.dice[1] + ai.dice[2] + ai.dice[3] + ai.dice[4]; //set p to a value that is the sum of all DICE ROLLS
				SetUcscore(pc); //So now set the total score equal to the present score + the new 4 of a kind
				System.out.println("You scored Four of a Kind! Your total is now " +(ai.GetScoreA() + GetUcscore())+ " !");
			}
			else
			{
			   //set 4 of a kind score to zero
				System.out.println("No such luck.");
			}
			break;
			case 3: //full house
			if (checkfh(ai.dice))
			{
			   
				pc = pc + 25;
				SetUcscore(pc); 
				System.out.println("You scored a Full House (25 Points)! Your total is now " +(ai.GetScoreA() + GetUcscore())+ " !");
			}
			else
			{
				System.out.println("No such luck.");
			}
			break;
			case 4: //I combined small + large straight for the sake of ease
			checkStraight();
			if (CountStraight > 0)
			{
			   
				pc = ai.dice[0] + ai.dice[1] + ai.dice[2] + ai.dice[3] + ai.dice[4]; //set p to a value that is the sum of all DICE ROLLS
				SetUcscore(pc); //So now set the total score equal to the present score + the new 3 of a kind
				System.out.println("You scored a Straight! Your total is now " +(ai.GetScoreA() + GetUcscore())+ " !");
			}
			else
			{
			   //set 3 of a kind score to zero
				System.out.println("No Straights.");
			}
			break;
			case 5: System.out.println("This should be a Large Straight. But it's not.");
			//print result
			break;
			case 6: //yahtzee
			if (check5())
			{
			   
				pc = ai.dice[0] + ai.dice[1] + ai.dice[2] + ai.dice[3] + ai.dice[4]; //set p to a value that is the sum of all DICE ROLLS
				SetUcscore(pc); //So now set the total score equal to the present score + the new 3 of a kind
				System.out.println("You scored a Yahtzee! Your total is now " +(ai.GetScoreA() + GetUcscore())+ " !");
			}
			else
			{
			   //set 3 of a kind score to zero
				System.out.println("No such luck.");
			}
			break;
			case 7: //chance
			pc = ai.dice[0] + ai.dice[1] + ai.dice[2] + ai.dice[3] + ai.dice[4]; //set p to a value that is the sum of all DICE ROLLS
		   SetUcscore(pc); //So now set the total score equal to the present score + the new 3 of a kind
			System.out.println("You scored on a Chance! Your total is now " +(ai.GetScoreA() + GetUcscore())+ " !");
			break;
			default: System.out.println("Invalid input. Please try again.");
			break;
		}
	}
	
	// need to check for 3 of the same value
	private static boolean check3(){
		for(int i=0; i<6; i++){
			if (CountResults[i]>=3){
				return true;
			}
		}
		return false;
	}
	// need to check for 4 of the same value
	private static boolean check4(){
		for(int i=0; i<6; i++){
			if (CountResults[i]>=4){
				return true;
			}
		}
		return false;
	}
	
	private static boolean check2(){
		for(int i=0; i<6; i++){
			if (CountResults[i]>=2){
				return true;
			}
		}
		return false;
	}
	
	/*private static boolean checkfh(){
		for(int i=0; i<6; i++){
			if (check3() != false && check2() != false && check3() != check2() ){
				return true;
			}
		}
		return false;
	}*/
	
	private static boolean checkfh(int[] dice)
	{
	   int count = 1;
		boolean found3 = false; 
		boolean found2 = false;
		for (int i=1; i < ai.dice.length; i++)
		{
		   if (ai.dice[i] == ai.dice[i-1])
			count++;
		else
		{
		   if (count == 3)
			   found3 = true;
			else if (count == 2)
			   found2 = true;
				count = 1;
		}
	}
	if (count == 3)
	   found3 = true;
	else if (count == 2)
	   found2 = true;
	if (found3 && found2) return true;
	return false;
}
	
	private static boolean check5(){
		for(int i=0; i<6; i++){
			if (CountResults[i]>=5){
				return true;
			}
		}
		return false;
	}
	
	/**
 * This method checks to see if the longest sequence of numbers in the die array.
 * It returns the sequence as an int value. So, a short straight will be >=4, and
 * a long straight will be ==5.
 *
 * @author David Simkins
 **/
	private int checkStraight(){
		//int CountStraight=0;
		int Longest=0;
		for(int i=0; i<6; i++){
			if (CountResults[i]>=1){
				CountStraight++;
			}
			else if ((CountResults[i]==0)&& (CountStraight>Longest) ){
				Longest=CountStraight;
				CountStraight=0;
			}
			else {
				CountStraight=0;
			}
		}
		if (CountStraight > Longest){
			Longest = CountStraight;
		}
		return Longest;
	}
}