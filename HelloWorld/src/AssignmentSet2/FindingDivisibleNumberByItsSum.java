package AssignmentSet2;
import java.util.Scanner;
public class FindingDivisibleNumberByItsSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String number = input.next().toString();
		int total = 0;
		
		for(int i = 0; i< number.length();i++) {
			total += Character.getNumericValue(number.toCharArray()[i]);
		}
		int mathNumber = Integer.parseInt(number);
		if(mathNumber%total == 0) {
			System.out.println(mathNumber + " " + "is divisible by sum of its digits");
		} else {
			System.out.println(mathNumber + " " + "is not divisible by sum of its digits");
		}
	}
}
