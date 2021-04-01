package AssignmentSet1;
import java.util.Scanner;

public class Assignment3 {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double f = input.nextDouble();
		double c;
		c = (f-32)/9*5;
		System.out.println(c);
	}
}
