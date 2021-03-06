package AssignmentSet1;
import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		String accountNumber = input.next();
		
		if(accountNumber.length()!=4 || accountNumber.charAt(0)!='1') {
			System.out.println("Validation Failed! Account Number be must be 4 digits and first digit should be 1");
			return;
		}

		System.out.println("Enter Salary: ");
		int salary = input.nextInt();
		
		
		System.out.println("Enter Account Balance: ");
		int accountBalance = input.nextInt();
		
		if(accountBalance <1000) {
			System.out.println("Validation Failed! Must have a minimum balance of $1000 in the account");
			return;
		}
		
		System.out.println("Enter Loan Type(Car, House, Business): ");
		String loanType = input.next();
		
		System.out.println("Enter Loan Amount expected: ");
		int loanAmount = input.nextInt();
		
		System.out.println("Enter EMIs expected: ");
		int expectedEmis = input.nextInt();
		
		int emis = 0;
		int eligibleLoan = 0;
		
		switch(loanType) {
		case "Car":
			emis = 36;
			eligibleLoan = 500000;
			break;
		case "House":
			emis = 60;
			eligibleLoan = 6000000;
			break;
		case "Business":
			emis = 84;
			eligibleLoan = 7500000;
			break;
		}
		
		if(expectedEmis <= emis) {
			System.out.println("Account Number:" + accountNumber);
			System.out.println("Eligible Loan Amount = " + eligibleLoan);
			System.out.println("Loan Amount requested = " + loanAmount);
			System.out.println("EMIs = " + emis);
		}else {
			System.out.println("Sorry, you're not eligible.");
		}
		
	}
}
