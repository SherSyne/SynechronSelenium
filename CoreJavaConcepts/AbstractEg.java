package CoreJavaConcepts;

abstract class AbstractEg {
	//abstract class can contain default methods as well as abstract methods
	//have only method signature without body
	//no object creation for abstract class
	// we can achieve 0 to 80 percent of abstraction
	
	public void fetch() {
		System.out.println("Displaying in default method");
	}
	
	//abstract method
	abstract void read();

}
//no object creation for abstract class
