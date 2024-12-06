package CoreJavaConcepts;

public class Staticvar {
	
	String EmpName = "Sherin"; // non static variable
	
	static int Empid = 6788; //static variable
	
	public void displayEmpBU() {
		
		String EmpBU = "Testing";
		
		// static int ss = 123; not allowed to declare static variables in method
		System.out.println(EmpBU);
		System.out.println(Empid);
		System.out.println(EmpName);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticvar sv = new Staticvar();
		sv.displayEmpBU();
		System.out.println(Empid);
	}

}
