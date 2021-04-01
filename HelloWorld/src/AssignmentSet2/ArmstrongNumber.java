package AssignmentSet2;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		String number = input.next();
		int total = 0;
		
		for(int i = 0; i < number.length();i++) {
			int digit = Character.getNumericValue(number.toCharArray()[i]);
			double poweredDigit = Math.pow(digit, number.length());
			total+= poweredDigit;
			
		}
		int mathNumber = Integer.parseInt(number);
		if(mathNumber == total) {
			System.out.println(number + " " + "is an armstrong number.");
		}else {
			System.out.println(number + " " + "is not an armstrong number.");
		}
	}
}
