package AssignmentSet1;
import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
		int total;
		if(num1 == num2) {
			total= num1 + num2;
		} else {
			total = (num1 + num2) * 2;
		}
		System.out.println(total);
	}
}
