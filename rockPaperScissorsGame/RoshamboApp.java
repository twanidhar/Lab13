package rockPaperScissorsGame;

import java.util.Scanner;

public class RoshamboApp {

	public static void main (String []args) {
		Roshambo roshambo;
		Scanner scnr = new Scanner (System.in);
		String Player;
		String Player1;
		String Player2;
		
		String userResponse;
		Player = new UserEntries("");
		Player1 = new Player1();
		Player2 = new Player2();
		
		System.out.println("Welcome to Roshambo! Let's play Rock, Paper, Scissors!");
		
		do 
		{
		
			System.out.println("Select rock, paper, or scissors.");
		String choice = scnr.nextLine();
		if (choice.startsWith("r")) {
			System.out.println("rock.");
			
		} else if  (choice.startsWith("p")) {
			System.out.println("paper.");
	
		} else if (choice.startsWith("s")){
			System.out.println("scissors");

		}else {
			System.out.println("Oops! Select from rock, paper, or scissors.");
		
		}System.out.println("Continue? (yes/no)");
		Object userResponse = scnr.nextInt();
		while (userResponse.equals("yes"));{
		int i =0;
		for(int i =0;i = userResponse.equals(); i ++);

	private static Object userResponse(String yes) {
		// TODO Auto-generated method stub
		return true;
	}
}
