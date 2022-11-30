import java.util.Scanner;

public class Arithmetic_Demo {
	private static Scanner in;

	public static void main(String args[]) {
		in = new Scanner(System.in);
		int denominator, numerator, result;
		
		System.out.println("ENTER NUMERATOR VALUE: ");
		numerator = in.nextInt();
		System.out.println("ENTER DENOMINATOR VALUE: ");
		denominator = in.nextInt();
		
		result = numerator/denominator;
		System.out.print(numerator+" DIVIDED BY " +denominator);
		System.out.println( " = "+result);
		
		}
}
