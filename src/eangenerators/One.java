package eangenerators;

public class One extends EanGeneratorType {

	public One(String digits) {
		super(digits);
	}
	
	public String generateCode() {
		String code = "";
		code += LO.get(Character.getNumericValue(digits.charAt(1)));
		code += LO.get(Character.getNumericValue(digits.charAt(2)));
		code += LE.get(Character.getNumericValue(digits.charAt(3)));
		code += LO.get(Character.getNumericValue(digits.charAt(4)));
		code += LE.get(Character.getNumericValue(digits.charAt(5)));
		code += LE.get(Character.getNumericValue(digits.charAt(6)));
		return code;
	}

}
