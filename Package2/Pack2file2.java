package Package2;

import AccessModifiers.AccessPublic;

public class Pack2file2 extends AccessPublic{

	public static void main(String[] args) {
		
		Pack2file2 ob = new Pack2file2();
		System.out.println(ob.city);// protected is accessible within subclass of another package
	}

}
