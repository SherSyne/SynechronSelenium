package Variables;

public class VariablesSam {

	String Studentname = "Sherin"; //Class variable
	
	int Studentid = 123;    // CV
	 static String studentcoll= "BMC";
	 public void details() {
		 String studentDept = "CS";
		 System.out.println(studentDept);
		 System.out.println(studentcoll);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesSam sv = new VariablesSam();
		System.out.println(sv.Studentid);
		System.out.println(sv.Studentname);
		System.out.println(studentcoll);
		sv.details();
		
	}

}
