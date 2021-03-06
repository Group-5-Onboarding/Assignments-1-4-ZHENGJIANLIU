package AssignmentSet2;
import java.util.Scanner;

public class ChickensAndRabbitsInAFarm {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter heads: ");
		int heads = input.nextInt();
		System.out.println("Enter legs: ");
		int legs = input.nextInt();
		
		int r = 4;
		int c = 2;
		if(legs/r == heads) {
			System.out.println("Rabbits: " + heads);
			return;
		}
		if(legs/c == heads) {
			System.out.println("Chickens: " + heads);
			return;
		}
		
		for(int i = 0; i< legs/r; i++ ) {
			for(int j = 0; j <legs/c;j++) {
				if( (i*r +j*c) == legs && i+j == heads ) {
					System.out.println("Chickens: " + j);
					System.out.println("Rabbits: " + i);
					return;
				}
			}
		}
		
		System.out.println("The number of chickens and rabbits cannot be found");
	}
}
