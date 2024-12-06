package CoreJavaConcepts;

public class SingleInheritanceClassB extends SingleInheritanceClassA {

	
		public void fetchBUDetails() {
			System.out.println("Employee BU is Appl");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritanceClassB obj = new SingleInheritanceClassB();
		obj.fetchEmpdetails();
		obj.fetchBUDetails();
		
	}

}

