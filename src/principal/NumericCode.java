package principal;

public interface NumericCode{
	
	public abstract String getDigits();
	public abstract void setDigits(String digits);
	
	public abstract boolean check();
	public abstract String generateBarCode();
}
