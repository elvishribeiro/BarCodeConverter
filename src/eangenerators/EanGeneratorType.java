package eangenerators;

import java.util.ArrayList;

public class EanGeneratorType {
	String digits;
	
	protected ArrayList<String> LO = new ArrayList<String>();	//Left Odd
	protected ArrayList<String> LE = new ArrayList<String>();	//Left Even

	protected EanGeneratorType(String digits) {
		this.digits = digits;
		
		LO.add("   || |");
		LO.add("  ||  |");
		LO.add("  |  ||");
		LO.add(" |||| |");
		LO.add(" |   ||");
		LO.add(" ||   |");
		LO.add(" | ||||");
		LO.add(" ||| ||");
		LO.add(" || |||");
		LO.add("   | ||");

		LE.add(" |  |||");
		LE.add(" ||  ||");
		LE.add("  || ||");
		LE.add(" |    |");
		LE.add("  ||| |");
		LE.add(" |||  |");
		LE.add("    | |");
		LE.add("  |   |");
		LE.add("   |  |");
		LE.add("  | |||");
	}
	
	public String generateCode() {
		return "";
	}
	
	
}
