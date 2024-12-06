package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {
// unique elements allowed
	//null values allowed
	//non sync
	// no insertion order
	public static void main(String[] args) {
	    HashSet<Float> hs = new  HashSet();
	    hs.add(67.1f);
	    hs.add(68.1f);
	    hs.add(69.1f);
	    hs.add(47.1f);
	    hs.add(57.1f);
	    hs.add(null);
	    
	    Iterator itr = hs.iterator();
	    while (itr.hasNext()) {
	    	System.out.println(itr.next());
	    }

	}

}
