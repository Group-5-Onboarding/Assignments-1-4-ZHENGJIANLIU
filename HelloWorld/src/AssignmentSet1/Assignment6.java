package AssignmentSet1;
import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter third number: ");
		int num3 = input.nextInt();
		
		if(num3 == 7) {
			System.out.println("-1");
		} else if(num2 == 7) {
			System.out.println(num3);
		} else if(num1 == 7) {
			System.out.println(num2 * num3);
		} else {
			System.out.println(num1 * num2 * num3);
		}
	}
}
