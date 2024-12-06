package Collections;

import java.util.LinkedList;

public class LinkedListEg {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList();
		ll.add("John");
		ll.add("Peter");
		ll.add("Sam");
		System.out.println(ll);
		System.out.println(ll.getFirst());

	}

}
