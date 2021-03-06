package AssignmentSet3;

public class SalaryAnalysis {
	
	public static double[] findDetails(double[] salary) {		
		int salariesLength = salary.length;
		double total = 0;
		
		for(double s: salary) {
			total+= s;
		}
		double average = total / salariesLength;
		double greaterThanAverage = 0;
		double lesserThanAverage = 0;
		
		for(double s: salary) {
			if(s > average) {
				greaterThanAverage++;
			}
			if(s < average) {
				lesserThanAverage++;
			}
		}
		
		double[] details = {(double)average, greaterThanAverage, lesserThanAverage};
		
		return details;
		
	}
	public static void main(String[] args) {
		double [] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		double[] details = findDetails(salary);
		
		 System.out.println("Average salary: "+ details[0]);
	     System.out.println("Number of salaries greater than the average salary: "+ details[1]);
	     System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
	}
}
