package AssignmentSet5;

class Employee {
    
    //Implement your code here 
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    
    public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
}


class PermanentEmployee extends Employee {
      
    private double basicPay;
	private double hra;
    private float experience;
    
    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
    	super(empId, name, 0);
    	this.basicPay = basicPay;
    	this.hra = hra;
    	this.experience = experience;
    }
    
    public double getBasicPay() {
		return basicPay;
	}


	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}


	public double getHra() {
		return hra;
	}


	public void setHra(double hra) {
		this.hra = hra;
	}


	public float getExperience() {
		return experience;
	}


	public void setExperience(float experience) {
		this.experience = experience;
	}
    
	public void calculateMonthlySalary() {
		double salary = 0;
		double vc = 0;
		if(this.experience >= 3 && this.experience < 5) {
			vc += this.basicPay* 0.05;
		}else if(this.experience >=5 && this.experience<5){
			vc+=this.basicPay*0.07;
		}else if(this.experience >=10) {
			vc+=this.basicPay*0.12;
		}
		salary = this.basicPay + this.hra + vc;
		this.setSalary(salary);
	}
    
    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }

}

class ContractEmployee extends Employee {
	
	private double wage;
	private float hoursWorked;
	
	public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
		super(empId, name, 0);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}
	
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
    
	public void calculateSalary(){
		double salary = 0;
		salary += this.hoursWorked * this.wage;
		this.setSalary(salary);
	}
    
    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }
}

public class InheritanceAssignment1 {
	public static void main(String[] args) {
	      
        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1850, 115, 3.5f);
        permanentEmployee.calculateMonthlySalary();
        System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+Math.round(permanentEmployee.getSalary()*100)/100.0);
            
        ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
        contractEmployee.calculateSalary();
        System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+Math.round(contractEmployee.getSalary()*100)/100.0);
        
        //Create more objects for testing your code
    }
}
