package AssignmentSet6;

class Faculty{
    private String name;
	private float basicSalary;
    private float bounsPercentage;
    private float carAllowance;
    
    public Faculty(String name, float basicSalary) {
    	this.name = name;
    	this.basicSalary = basicSalary;
    	this.bounsPercentage = 0.04f;
    	this.carAllowance = 0.025f;
    }
    
    public double calculateSalary() {
    	double salary = basicSalary*(1+bounsPercentage+carAllowance);
    	return salary;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getBounsPercentage() {
		return bounsPercentage;
	}

	public void setBounsPercentage(float bounsPercentage) {
		this.bounsPercentage = bounsPercentage;
	}

	public float getCarAllowance() {
		return carAllowance;
	}

	public void setCarAllowance(float carAllowance) {
		this.carAllowance = carAllowance;
	}    
}

class OfficeStaff extends Faculty {
	private String designation;
	
	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}
		
	public double calculateSalary() {
    	double salary = super.calculateSalary();
    	
    	if(designation == "Accountant") {
    		salary+=10000.0;
    	}else if(designation == "Clerk") {
    		salary+=7000.0;
    	}else if(designation == "Peon") {
    		salary+=4500.0;
    	}
    	
    	return salary;
    }
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}

class Teacher extends Faculty{
    private String qualification;
    
	public Teacher(String name, float basicSalary, String qualification) {
    	super(name, basicSalary);
		this.qualification = qualification;
    }
	
	public double calculateSalary() {
		double salary = super.calculateSalary();
    	
    	if(qualification == "Doctoral") {
    		salary+=20000.0;
    	}else if(qualification == "Masters") {
    		salary+=18000.0;
    	}else if(qualification == "Bachelors") {
    		salary+=15500.0;
    	}else if(qualification == "Associate") {
    		salary+=10000.0;
    	}
    	
    	return salary;
    }
	
    public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
    
    
    
}


public class MethodOverridingAssignment1 {
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
		
		System.out.println("Teacher Details\n***************");
		System.out.println("Name: "+teacher.getName());
		System.out.println("Qualification: "+teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary()*100)/100.0); 
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: "+officeStaff.getName());
		System.out.println("Designation: "+officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 

        //Create more objects for testing your code   

	}
}
