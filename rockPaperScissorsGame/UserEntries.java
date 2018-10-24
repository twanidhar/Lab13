package rockPaperScissorsGame;

public class UserEntries extends Player {

	public UserEntries(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;}

	if (choice.startsWith("r")) {
		System.out.println("rock.");
		
	} else if  (choice.startsWith("p")) {
		System.out.println("paper.");

	} else if (choice.startsWith("s")){
		System.out.println("scissors");

	}else {
		System.out.println("Oops! Select from rock, paper, or scissors.");
	
	

}}
