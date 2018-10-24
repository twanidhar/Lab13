package rockPaperScissorsGame;

import java.util.Scanner;

public class Validator {

	
	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		String s = scnr.next();
		 scnr.nextLine();
		 return s;
	}
	
		 
	
}
