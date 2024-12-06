package StudentDetails;

public class Student {

	String sd = "Sherin";
	int id = 1343;
	boolean present = true;
	char A = 'P';
	
	public void fetchdetails() {
		System.out.println("fetching details");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s = new Student();
System.out.println(s.sd);
System.out.println(s.present);
System.out.println(s.A);
System.out.println(s.id);

	}

}
