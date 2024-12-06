package Collections;

import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack();
		//pushing the elemnts
		st.push(23);
		st.push(30);
		st.push(33);
		st.push(40);
		st.push(50);
		System.out.println("Pushing the element" + st);
		//poping the elements
		st.pop();
		System.out.println("Pushing the element" + st);
		System.out.println("Return top most element" +st.peek());
		System.out.println(st.search(st));
	}

}
