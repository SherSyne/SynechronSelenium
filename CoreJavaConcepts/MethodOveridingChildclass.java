package CoreJavaConcepts;

public class MethodOveridingChildclass extends MethodOverridingParentClass{

	public void displaycolor() {
		String color = "white";
		int si = 2334;
		System.out.println(color);
		System.out.println(si);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOveridingChildclass ob = new MethodOveridingChildclass();
		ob.displaycolor();
		
			
	}

}
