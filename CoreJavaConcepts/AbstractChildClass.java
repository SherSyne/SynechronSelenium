package CoreJavaConcepts;

public class AbstractChildClass extends AbstractEg{
	
	public void read() {
		System.out.println("This is the child abstract class ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChildClass ob = new AbstractChildClass();
		ob.fetch();
		ob.read();
	}

}
