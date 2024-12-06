package CoreJavaConcepts;

public class HierSubClass2 extends HierarSuperClass{
	public void subclass2() {
		System.out.println("I am in subclass2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierSubClass2 hs2 = new HierSubClass2();
		hs2.fetch();;
		hs2.subclass2();
	}

}
