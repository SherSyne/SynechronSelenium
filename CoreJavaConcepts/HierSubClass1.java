package CoreJavaConcepts;

public class HierSubClass1 extends HierarSuperClass {

		public void subclass1() {
			System.out.println("I am in subclass1");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierSubClass1 hs = new HierSubClass1();
		hs.fetch();
		hs.subclass1();
	}

}
