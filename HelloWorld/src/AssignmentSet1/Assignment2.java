package AssignmentSet1;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();
		double pi = 3.14;
		double area = pi * radius * radius;
		System.out.println(area);
	}
}
