package Methods;

public class ParMethods {
 //public void add() {
//	int a = 25;
//	int b = 2;
//	int  c = a+b;
//	System.out.println(c);
// }
 
 public void adda(int a, int b) {
	 	int c= a+b;
	
 }
 
 public void login(String username, String password) {
	 	System.out.println(username+"\n" +  password);
	 	
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParMethods pm = new ParMethods();
		pm.adda(5, 3);
		pm.adda(8, 10);
		pm.login("ABC", "12ghd12");
		pm.login("SHERIN", "123456");
	}

}
