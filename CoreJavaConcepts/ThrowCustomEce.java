package CoreJavaConcepts;

public class ThrowCustomEce {
// throw used for customised eception
	
	public void validateage(int age) {
			if(age<18) {
				
			throw new ArithmeticException("Person is not eligible for voting");// customied
			
			}
			else {
			
			System.out.println("Person is eligible for voting");
		}
	}
	public static void main(String[] args) {
		
			ThrowCustomEce ob = new ThrowCustomEce();
			ob.validateage(17);
		
	}

}
