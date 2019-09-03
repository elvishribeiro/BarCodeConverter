package principal;
import java.util.Scanner;
	

public class Program {
	public static void main(String []args) {
		Scanner stdin = new Scanner(System.in);
		String input = stdin.nextLine();
		input = input.replace(" ", "");
		try {
			NumericCode nc = EncodeType.values()[13 - input.length()].getEncodeType();
			nc.setDigits(input);

			System.out.print(nc.generateBarCode());

		}catch(Exception Ex) {
			System.out.println("O código inserido está inválido!");
		}
				

		
		
	}
}
