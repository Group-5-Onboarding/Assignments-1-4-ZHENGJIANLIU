package AssignmentSet3;

class Teacher {
    //Implement your code here
    private String teacherName;
	private String subject;
	private double salary;

	public Teacher(String teacherName, String subject, double salary) {
		this.teacherName = teacherName;
		this.subject = subject;
		this.salary = salary;
	}

	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		// Implement your code here 
		Teacher teacher1 = new Teacher("Alex", "Java Fundamentals", 1200l);
		Teacher teacher2 = new Teacher("John", "RDBMS", 800l);
		Teacher teacher3 = new Teacher("Sam", "Networking", 900l);
		Teacher teacher4 = new Teacher("Maria", "python", 900l);
		
		Teacher [] teachers = {teacher1, teacher2, teacher3, teacher4};
		
		for(Teacher teacher: teachers) {			
			System.out.println("Name: " + teacher.getTeacherName() + ", Subject: " + teacher.getSubject() + ", Salary: " + teacher.getSalary());
		}

	}
}
