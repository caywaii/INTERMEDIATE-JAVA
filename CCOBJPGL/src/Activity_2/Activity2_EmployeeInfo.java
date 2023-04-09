package Activity_2;

class Employee{
	String empName = "Juan Dela Cruz";
	String empDesignation = "Instructor";
	String empSchool = "National Univesity";
	public void Teaching() {
	
	}
	
	public void CCIT() {
		
	}
	
	public void ComputerSubjects() {
		
	}
}

class Professor extends Employee{
	public void Teaching() {
		System.out.println("He is Teaching");
	}
	
	public void CCIT() {
		System.out.println("His department is CCIT");
	}
	
	public void ComputerSubjects() {
		System.out.println("He teaches Computer Subject");
	}
}

public class Activity2_EmployeeInfo {
	public static void main(String[] args) {
		Employee prof = new Professor();
		
		System.out.println("Employee Name: " + prof.empName);
		System.out.println("Designation: " + prof.empDesignation);
		System.out.println("University: " + prof.empSchool);
		prof.Teaching();
		prof.CCIT();
		prof.ComputerSubjects();
		
	}
	
}
