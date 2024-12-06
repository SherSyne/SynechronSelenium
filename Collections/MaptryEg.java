package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaptryEg {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(0, "Rahul");
		map.put(1, "John");
		map.put(2, "Peter");
		map.put(3, "Sam");
		map.put(4, "Neil");
		System.out.println(map);
		
		 Iterator itr = map.();
		    while (itr.hasNext()) {
		    	System.out.println(itr.next());
		    }

	}

}
