package rockPaperScissorsGame;

import java.util.Random;
import java.util.Scanner;

public class Player2 extends Player {
// int (Math.random() *3)//angela
	
	Scanner scnr = new Scanner (System.in);
	
	
	
	
	
	public Player2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		
		int random = (int)(Math.random()*3);
		System.out.println("Select rock, paper, or scissors.");
		String choice = scnr.nextLine();
		if (choice.startsWith("r")) {
			System.out.println("rock.");
			
		} else if  (choice.startsWith("p")) {
			System.out.println("paper.");
	
		} else if (choice.startsWith("s")){
			System.out.println("scissors");

		}else {
			System.out.println("Oops! Select from rock, paper, or scissors.");}
		return null;//eclipse automatically wrote null.
			
		
	}



	@Override
	public String toString() {
		return "Player2 [generateRoshambo()=" + generateRoshambo() + ", getName()=" + getName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
