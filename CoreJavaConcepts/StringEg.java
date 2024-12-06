package CoreJavaConcepts;

public class StringEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			String S1 = "New";
			String S2 = "Delhi";
			String S3 = "Greater Noida";
			
			System.out.println(S1.equals(S2));
			System.out.println(S1.concat(S2));
			System.out.println(S2.substring(3));
			System.out.println(S2.substring(1, 3));
			System.out.println(S2.contains("e")); // boolean true or false
			System.out.println(S1.replace("N", "D"));
			String[]  arrofstr = S3.split(" ");
			
			for (String a : arrofstr) {
				System.out.println(a);
			}
			String fruits = String.join(" ", S1, "Apple", "Orange","Mango");
			System.out.println(fruits);
			String S4 = "America";
			String S5 = "asia";
			System.out.println(S4.compareTo(S5));// leksographical order ASCII table (in table A-65 minus a-97 = -32)
			
	}

}
