package Operators;

public class ArithmeticOperators {

	
	int a = 25;
	int b = 2;
	float c = a/b;
	public void relation() {
		if(a>b) {
			 System.out.println(a);
			 
		}
		else {
			System.out.println(b);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperators ao = new ArithmeticOperators();
	  System.out.println("Arithmetic Operators");
      System.out.println(ao.a + ao.b);
      System.out.println(ao.a - ao.b);
      System.out.println(ao.a * ao.b);
      System.out.println(ao.c);
      
      System.out.println("Relational Operators");
      ao.relation();
	}

}
