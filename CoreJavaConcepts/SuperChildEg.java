package CoreJavaConcepts;

public class SuperChildEg extends SuperEgParent {

	String s = "Black";
	
	void printcolor() {
		System.out.println(s);
		System.out.println(super.s);
	}
	public static void main(String[] args) {
		SuperChildEg ob = new SuperChildEg();
		ob.printcolor();
		

	}

}
