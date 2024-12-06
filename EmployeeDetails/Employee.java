package EmployeeDetails;

public class Employee {

	String EmployeeName = "Sherin";
	int EmployeeId = 732;
	String EmployeeBU = "ABC";
	public void fetchdetails() {
		System.out.println("Testing");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Employee ED = new Employee();
				
				System.out.println(ED.EmployeeBU);
				System.out.println(ED.EmployeeId);
				System.out.println(ED.EmployeeName);
			ED.fetchdetails();

}
}