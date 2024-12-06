package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TrresetEg {

	public static void main(String[] args) {
		TreeSet<Float> ts = new  TreeSet();
	    ts.add(67.1f);
	    ts.add(68.1f);
	    //ts.add(68.1f); dupicate values not allowed
	    ts.add(69.1f);
	    ts.add(47.1f);
	    ts.add(57.1f);
	   // ts.add(null);
	    
	    Iterator itr = ts.iterator();
	    while (itr.hasNext()) {
	    	System.out.println(itr.next());
	    }

	}

}
