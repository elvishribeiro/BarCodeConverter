package principal;
import eangenerators.EanGeneratorType;

import java.util.ArrayList;

import eangenerators.Digits;

public class EAN implements NumericCode{
	private ArrayList<String> rightDigits;
	private String digits;
	
	//----Constructors----------------------------------
	
	public EAN() {
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
	
	//----Methods---------------------------------------
	public boolean check() {
		int value = 0;
		for (int i = 0; i < 13; i++) {
			if (i % 2 == 0)
				value += Character.getNumericValue(digits.charAt(i));
			else
				value += 3 * Character.getNumericValue(digits.charAt(i));
		}
		return value % 10 == 0;
	}	
	
	public String generateBarCode() {
		if (!check())
			return "O código inserido está inválido!";
		
		
		String barCode = "_";
		String firstHalf = digits.substring(0, 7);
		String secondHalf = digits.substring(7);
		
		int firstDigit = Character.getNumericValue(digits.charAt(0));
		EanGeneratorType leftGenerator = Digits.values()[firstDigit].getEanGeneratorType(firstHalf);
		
		barCode += leftGenerator.generateCode() + "_";
		
		for (int i = 0; i < secondHalf.length(); i++) {
			int digit = Character.getNumericValue(secondHalf.charAt(i));
			barCode += rightDigits.get(digit);
		}
		barCode += "_";
		
		return barCode;
	}
	
	//----Getters and Setters----------------------------
	public String getDigits() {
		return digits;
	}

	public void setDigits(String digits) {
		this.digits = digits;
	}

	
}
