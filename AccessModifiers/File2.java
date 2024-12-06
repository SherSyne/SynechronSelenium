package AccessModifiers;

public class File2 {

	public static void main(String[] args) {
		AccessPublic ob = new AccessPublic();
		System.out.println(ob.S1);
		
		System.out.println(ob.ip);
		// not able to access private variables in another class under same package
		//System.out.println(ob.address);
		
		System.out.println(ob.city); //protected accessible within same package
		System.out.println(ob.BU);
	}

}
