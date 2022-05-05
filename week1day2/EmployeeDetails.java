package week1day4;

public class EmployeeDetails {
	
	public void printEmployeeName(String empName, int empId) {
		System.out.println("Employee Name="+empName);
		System.out.println("Employee Id="+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Employee Address="+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("Employee Salary="+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Mobile Number="+mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
	   emp.printEmployeeName("yogesh",1020);
       emp.getEmployeeAddress("Chennai");
       emp.printEmployeeSalary(30000.37);
       emp.printEmployeeMobileNumber(8220575944L);
	}

}
