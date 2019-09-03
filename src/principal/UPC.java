package principal;

import java.util.ArrayList;


public class UPC implements NumericCode{
	
	private String digits;
	private ArrayList<String> leftDigits;
	private ArrayList<String> rightDigits;
	
	//----Constructors---------------------------------
	public UPC() {
		leftDigits = new ArrayList<String>();
		leftDigits.add("   || |");
		leftDigits.add("  ||  |");
		leftDigits.add("  |  ||");
		leftDigits.add(" |||| |");
		leftDigits.add(" |   ||");
		leftDigits.add(" ||   |");
		leftDigits.add(" | ||||");
		leftDigits.add(" ||| ||");
		leftDigits.add(" || |||");
		leftDigits.add("   | ||");
		
		rightDigits = new ArrayList<String>();
		rightDigits.add("|||  | ");
		rightDigits.add("||  || ");
		rightDigits.add("|| ||  ");
		rightDigits.add("|    | ");
		rightDigits.add("| |||  ");
		rightDigits.add("|  ||| ");
		rightDigits.add("| |    ");
		rightDigits.add("|   |  ");
		rightDigits.add("|  |   ");
		rightDigits.add("||| |  ");	
	}
	
	//----Methods--------------------------------------
	public boolean check() {
		int value = 0;
		for (int i = 0; i < 12; i++) {
			if (i % 2 == 0)
				value += 3 * Character.getNumericValue(digits.charAt(i));
			else
				value += Character.getNumericValue(digits.charAt(i));
		}
		return value % 10 == 0;
	}
	
	public String generateBarCode() {
		if (!check()) {
			return "O código inserido está inválido!";
		}
		
		String barCode = "_";
		
		//right side
		for (int i = 0; i < 6; i++) {
			int digit = Character.getNumericValue(digits.charAt(i));
			barCode += leftDigits.get(digit);
		}
		
		barCode += "_";
		
		//left side
		for (int i = 6; i < 12; i++) {
			int digit = Character.getNumericValue(digits.charAt(i));
			barCode += rightDigits.get(digit);
		}
		barCode += "_";
		return barCode;
	}
	
	//----Getters and Setters---------------------------
	public String getDigits() {
		return digits;
	}

	public void setDigits(String digits) {
		this.digits = digits;
	}

	public ArrayList<String> getLeftDigits() {
		return leftDigits;
	}

	public ArrayList<String> getRightDigits() {
		return rightDigits;
	}
	
	
}
