package CoreJavaConcepts;

public class ConstructorEg {
	// canstructor name is same as class name
	//consructoris the first method called when the object of the class is created
	// constructors are used to initialise variables
	//constructors cannot have eplicit return types
	//constructors cannot be static, final synchronied
	
	String S1;
	int id;
	ConstructorEg(){
	System.out.println("I am the constructor");
	System.out.println(S1 + " " + id);
	System.out.println("Browser is launched");
	}
	
	public void testcase1() {
		System.out.println("test case1 is eecuted");
	}
	public void testcase2() {
		System.out.println("test case2 is eecuted");
	}
	public void testcase3() {
		System.out.println("test case3 is eecuted");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorEg obj = new ConstructorEg();
		obj.testcase1();
		obj.testcase2();
		obj.testcase3();
		
		
	}

}
