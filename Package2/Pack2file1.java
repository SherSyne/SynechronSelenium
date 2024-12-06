package Package2;

import AccessModifiers.AccessPublic;

public class Pack2file1 {

	public static void main(String[] args) {
		AccessPublic ob = new AccessPublic();
		System.out.println(ob.S1);
		
		System.out.println(ob.ip);
		// not able to access private variables in another package
		//System.out.println(ob.address);
		//System.out.println(ob.city); within same package
		//System.out.println(ob.BU);default not visible within different package
	}

}
