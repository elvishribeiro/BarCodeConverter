package eangenerators;

public class Two extends EanGeneratorType {

	public Two(String digits) {
		super(digits);
	}
	
	public String generateCode() {
		String code = "";
		code += LO.get(Character.getNumericValue(digits.charAt(1)));
		code += LO.get(Character.getNumericValue(digits.charAt(2)));
		code += LE.get(Character.getNumericValue(digits.charAt(3)));
		code += LE.get(Character.getNumericValue(digits.charAt(4)));
		code += LO.get(Character.getNumericValue(digits.charAt(5)));
		code += LE.get(Character.getNumericValue(digits.charAt(6)));
		return code;
	}

}
