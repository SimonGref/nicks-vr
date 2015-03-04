import java.util.*;

public class UpperScores
{
	static int[] CountResults = {0,0,0,0,0,0}; //The array for the number of 1s, 2s, etc. in your Dice[].
	static int CountStraight = 0;
	static String s;
	static int count;
	static boolean found2;
	static boolean found3;
	//static int consecutiveValues;
	static String YahtzeeConstants;
	static int uscore;
	static int p;
	//static int threeKind;
	
	public UpperScores(int uscore)
	{
	   this.uscore = uscore;
	}
	
	public static int GetUscore()
	{
	   return uscore;
	}
	
	public static void SetUscore(int Uscore)
	{
      uscore = Uscore;
	}
	
	
	static YahtzeeThree yt = new YahtzeeThree(0);
	
	public void countDice(){
		for(int i=0; i<5; i++) {
			for(int j=0; j<6; j++) {
				if ( yt.dice[i]==(j+1) ){
					CountResults[j]++;
				}
			}
		}
	//}
	
	//public static void Pancake()
	//{   
		Scanner input = new Scanner(System.in);  
		System.out.println("Upper: t = 3 of a kind, q = 4 of a kind, f = Full House, s = Small Straight, l = Large Straight, y = Yahtzee, c = Chance");
		s = input.nextLine();
		switch (s)
		{
		   case "t": //method for three of a kind
			if (check3())
			{
			   
				p = yt.dice[0] + yt.dice[1] + yt.dice[2] + yt.dice[3] + yt.dice[4]; //set p to a value that is the sum of all DICE ROLLS
				SetUscore(p); //So now set the total score equal to the present score + the new 3 of a kind
				System.out.println("You scored Three of a Kind! Your total is now " +(yt.GetScore() + GetUscore())+ " !");
			}
			else
			{
			   //set 3 of a kind score to zero
				System.out.println("No such luck.");
			}
			break;
			case "q": //method for four of a kind
			if (check4())
			{
			   
				p = yt.dice[0] + yt.dice[1] + yt.dice[2] + yt.dice[3] + yt.dice[4]; //set p to a value that is the sum of all DICE ROLLS
				SetUscore(p); //So now set the total score equal to the present score + the new 4 of a kind
				System.out.println("You scored Four of a Kind! Your total is now " +(yt.GetScore() + GetUscore())+ " !");
			}
			else
			{
			   //set 4 of a kind score to zero
				System.out.println("No such luck.");
			}
			break;
			case "f": //full house
			if (checkfh(yt.dice))
			{
			   
				p = p + 25;
				SetUscore(p); 
				System.out.println("You scored a Full House (25 Points)! Your total is now " +(yt.GetScore() + GetUscore())+ " !");
			}
			else
			{
				System.out.println("No such luck.");
			}
			break;
			case "s": //I combined small + large straight for the sake of ease
			checkStraight();
			if (CountStraight > 0)
			{
			   
				p = yt.dice[0] + yt.dice[1] + yt.dice[2] + yt.dice[3] + yt.dice[4]; //set p to a value that is the sum of all DICE ROLLS
				SetUscore(p); //So now set the total score equal to the present score + the new 3 of a kind
				System.out.println("You scored a Straight! Your total is now " +(yt.GetScore() + GetUscore())+ " !");
			}
			else
			{
			   //set 3 of a kind score to zero
				System.out.println("No Straights.");
			}
			break;
			case "l": System.out.println("This should be a Large Straight. But it's not.");
			//print result
			break;
			case "y": //yahtzee
			if (check5())
			{
			   
				p = yt.dice[0] + yt.dice[1] + yt.dice[2] + yt.dice[3] + yt.dice[4]; //set p to a value that is the sum of all DICE ROLLS
				SetUscore(p); //So now set the total score equal to the present score + the new 3 of a kind
				System.out.println("You scored a Yahtzee! Your total is now " +(yt.GetScore() + GetUscore())+ " !");
			}
			else
			{
			   //set 3 of a kind score to zero
				System.out.println("No such luck.");
			}
			break;
			case "c": //chance
			p = yt.dice[0] + yt.dice[1] + yt.dice[2] + yt.dice[3] + yt.dice[4]; //set p to a value that is the sum of all DICE ROLLS
		   SetUscore(p); //So now set the total score equal to the present score + the new 3 of a kind
			System.out.println("You scored on a Chance! Your total is now " +(yt.GetScore() + GetUscore())+ " !");
			break;
			default: System.out.println("Invalid input. Please try again.");
			s = input.nextLine();
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
		for (int i=1; i < yt.dice.length; i++)
		{
		   if (yt.dice[i] == yt.dice[i-1])
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