package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsEg {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(0, "Rahul");
		map.put(1, "John");
		map.put(2, "Peter");
		map.put(3, "Sam");
		map.put(4, "Neil");
		System.out.println(map);
		
		//traversing in the map to get the values in set format
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			//Map entry which will help to get the key value pair
			Map.Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}

}
