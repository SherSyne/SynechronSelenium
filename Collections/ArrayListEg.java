package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg {
	
	//Allows duplicate cvalues
	//able to store dynamic data
	//allow null values
	//maintain the insertion order
	//non synchronised multi thread allowed 
	//modify the data output is inconsistent

	public static void main(String[] args) {
	
ArrayList<String> list = new ArrayList();
list.add("John");
list.add("Peter");
list.add("Sarath");
list.add("Sarath");
list.add("Ramya");
list.add(null);

System.out.println(list);
list.remove(1);
System.out.println(list);
System.out.println(list.contains("Sarath"));

Iterator itr = list.iterator();
while (itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
