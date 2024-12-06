package CoreJavaConcepts;

public class MultilevelInheritanceClassC extends MultilevelInheritanceClassB{
	
   public void fetchC() {
	   System.out.println("I an sublass2");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritanceClassC obj = new MultilevelInheritanceClassC();
		obj.FetchB();
	}

}
