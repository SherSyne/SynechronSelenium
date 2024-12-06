package CoreJavaConcepts;

public class Eceptionhandling {
	
		public void nulldisplay() {  //null pointer eception
				try {
						String s = null;
						System.out.println(s.length());
					}catch(Exception e) {
						e.printStackTrace();
						}
	
					}
		public void divby0() {     //Arithmetic Eception
			try {
				int i = 3;
				int c = i/0;
				System.out.println(c);
			}catch(ArithmeticException e) {
				e.printStackTrace();
				}

			}
		
	public static void main(String[] args) {
		
		Eceptionhandling ob = new Eceptionhandling();
		ob.divby0();
		
	}

}
