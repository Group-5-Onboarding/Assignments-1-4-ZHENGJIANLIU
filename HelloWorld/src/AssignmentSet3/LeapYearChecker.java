package AssignmentSet3;
import java.util.Scanner;

public class LeapYearChecker {
	
	public static int[] push(int n, int arr[], int x){
        int newarr[] = new int[n + 1];
        for (int i = 0; i < n; i++)
            newarr[i] = arr[i];
        newarr[n] = x;
        return newarr;
    }
	
	public static int[] findLeapYears(int year){
		int count = 0;
		int [] leapYears = {};
		while(count<15) {
			if((year % 4==0 && year%100!=0) || year%400 ==0) {				
				int [] newArr = push(leapYears.length, leapYears, year);
				leapYears = newArr;
				count++;
			}
			year+=4;
		}
		return leapYears;
   }
    
   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter a year: ");
       int year = input.nextInt();
	   int[] leapYears;
	   leapYears=findLeapYears(year);
	   System.out.println("\n************");
	   for ( int index = 0; index<leapYears.length; index++ ) {
	       System.out.println(leapYears[index]);
	   }
    }
}
