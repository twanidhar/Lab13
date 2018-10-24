package rockPaperScissorsGame;

public abstract class Player {

	
public abstract Roshambo generateRoshambo();

public Roshambo generateRoshambo (String userResponse) {
	return null;
}

private String name;


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

public Player(String name) {
	super();
	// TODO Auto-generated constructor stub
this.name = name;
}



}


