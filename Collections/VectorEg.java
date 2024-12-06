package Collections;

import java.util.Vector;

public class VectorEg {

	public static void main(String[] args) {
		Vector<Integer> vc = new Vector();
		vc.add(67);
		vc.add(73);
		vc.add(85);
		vc.add(83);
		vc.add(95);
		System.out.println(vc.capacity());
		System.out.println(vc.elementAt(1));
		System.out.println(vc.lastElement());
		System.out.println(vc.firstElement());
		
	}

}
