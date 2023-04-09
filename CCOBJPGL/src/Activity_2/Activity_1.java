package Activity_2;

class EmployeeInformation{
	private String empId;
	private String empName;
	private int empAge;
	private String phoneNum;
	private String companyRank;
	private int empRank = 11;

	//Employee ID
	public String getEmpId() {return empId;}
	public void setEmpId(String newEmpId) {
		this.empId = newEmpId;
	}
	
	//Employee Name
	public String getEmpName() {return empName;}
	public void setEmpName(String newEmpName) {
		this.empName  = newEmpName;
	}
	
	//Employee Age
	public int getEmpAge(){return empAge;}
	
	public void setEmpAge(int newEmpAge) {
		this.empAge = newEmpAge;
	}
	
	//Employee Phone Number
	public String getPhoneNum(){return phoneNum;}
	
	public void setPhoneNum(String newPhoneNum) {
		this.phoneNum = newPhoneNum;
	}
	
	//Employee Company Rank
	public String getCompanyRank(){return companyRank;}
	
	public void setCompanyRank(String newCompanyRank) {
		this.companyRank = newCompanyRank;
		}
	
	//Employee Rank
	public int getEmployeeRank(){return empRank;}
	
	public void setEmployeeRank(int newEmployeeRank) {
		this.empRank = newEmployeeRank;
	}
}

public class Activity_1 {

	public static void main(String[] args) {
		EmployeeInformation empInfo = new EmployeeInformation();
		empInfo.setEmpId("2022-0001");
		empInfo.setEmpName("Juan Dela Cruz");
		empInfo.setEmpAge(30);
		empInfo.setPhoneNum("222-3333");
		empInfo.setCompanyRank("The Company");
		empInfo.setEmployeeRank(11);
		System.out.println("Employee ID: " + empInfo.getEmpId());
		System.out.println("Employee Name: " + empInfo.getEmpName());
		System.out.println("Employee Age: " + empInfo.getEmpAge());
		System.out.println("Phone Number: " + empInfo.getPhoneNum());
		System.out.println("Company: " + empInfo.getCompanyRank());
		System.out.println("Employee Rank: " + empInfo.getEmployeeRank());
		
		
	}
	
}
