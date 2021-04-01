package AssignmentSet1;
import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter N for Non-vegetarian or V for Vegeatian: ");
		char foodType = input.next().charAt(0);
		System.out.println("Enter Quantity: ");
		int quantity = input.nextInt();
		System.out.println("Enter distance: ");
		int distance = input.nextInt();
		
		int deliveryFee = 0;
		int foodTotal = 0;
		int totalAmount = 0;
		
		
		
		if(foodType == 'V') {
			foodTotal += quantity * 12;
		}else if(foodType == 'N') {
			foodTotal += quantity * 15;
		} else {
			foodTotal = 0;
		}
		
		
		if(distance > 3 && distance <= 6) {
			deliveryFee += distance - 3;
		}
		
		if(distance > 6) {
			deliveryFee += (distance -6)*2+3;
		}
		
		totalAmount = foodTotal + deliveryFee;		
		
		if(distance < 0) {
			totalAmount = -1;
		} else if(quantity <= 0) {
			totalAmount = -1;
		} else if(foodTotal <= 0) {
			totalAmount = -1;
		}
		System.out.println(totalAmount);
	}
}
