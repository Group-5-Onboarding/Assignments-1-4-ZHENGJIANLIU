package AssignmentSet1;
import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = input.nextInt();
		System.out.println("Enter b value: ");
		int b = input.nextInt();
		System.out.println("Enter c value: ");
		int c = input.nextInt();
		
		double d = Math.pow(b, 2) - (4*a*c);
		double r1 = (-b + d)/(2*a);
		double r2 = (-b - d)/(2*a);
		
		if( d == 0) {
			System.out.println("The root is " + r1);
		} else if(d>0) {
			System.out.println("The first root: " + r1);
			System.out.println("The second root: " + r2);
		} else {
			System.out.println("The equation has no real roots");
		}
	}
}
