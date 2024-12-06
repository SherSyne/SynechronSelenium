package CoreJavaConcepts;

public class InterfaceChildClass implements Interface1{
	
	public void fetch() {
		System.out.println("Displaying in Interface");
	}

	public static void main(String[] args) {
		
		InterfaceChildClass ob = new InterfaceChildClass();
		ob.fetch();
		System.out.println(S);

	}

}
