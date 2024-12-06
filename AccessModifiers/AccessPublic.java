package AccessModifiers;

public class AccessPublic {

	
	public String S1 = "New delhi";
	public int ip = 5667;
	private String address = "St Peters road";
	//protected is accessible in same package and subclasses of different package
	protected String city = "Bangalore";
	
	String BU = "testing";
	public static void main(String[] args) {
		AccessPublic ob = new AccessPublic();
		System.out.println(ob.S1);
		
		System.out.println(ob.ip);
		System.out.println(ob.address);
		System.out.println(ob.city);
		System.out.println(ob.BU);
	}

}
