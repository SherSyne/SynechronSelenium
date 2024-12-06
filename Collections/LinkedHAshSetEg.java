package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHAshSetEg {

	public static void main(String[] args) {
		LinkedHashSet<Float> ts = new  LinkedHashSet();
	    ts.add(67.1f);
	    ts.add(68.1f);
	    //ts.add(68.1f); duplicate values not allowed
	    ts.add(69.1f);
	    ts.add(47.1f);
	    ts.add(57.1f);
	   ts.add(null);
	    
	    Iterator itr = ts.iterator();
	    while (itr.hasNext()) {
	    	System.out.println(itr.next());
	    }


	}

}
