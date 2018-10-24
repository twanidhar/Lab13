package rockPaperScissorsGame;

import java.util.Scanner;

public class Player1 extends Player   {

	public Player1(String name) {
		super(name);
		
		
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Player1 [generateRoshambo()=" + generateRoshambo() + ", getName()=" + getName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return Roshambo.ROCK;
	}

	
	
}