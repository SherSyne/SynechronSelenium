package CoreJavaConcepts;

public class MethodOverloading {
	//rule method name should be same
	//method add with 2 parameters
	public void add(int a, int b) {
				int c= a + b;
				System.out.println("The sum is " + c);
	}
	
	
	public void add(int a, int b, int c) {
				int d= a + b + c;
				System.out.println("The sum is " + d);
	}
	
	
	public void add(int a, float b) {
				float d= a + b;
				System.out.println("The sum is " + d);
	}
	
	
	public void add(int a, double b, double c) {
				double d= a + b + c;
				System.out.println("The sum is " + d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ob = new MethodOverloading();
		ob.add(2, 3);
		ob.add(5, 12.8d, 25.7d);
		ob.add(4, 15.5f);
	}

}
