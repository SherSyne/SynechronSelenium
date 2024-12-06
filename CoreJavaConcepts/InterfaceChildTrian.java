package CoreJavaConcepts;

public class InterfaceChildTrian  implements InterfaceGetArea{

	public void getArea() {
    	int b = 10;
    	int h = 20;
    	double c = 0.5 * b*h;
    	System.out.println("the Area of triangle is:" + c);
 }  	
	public static void main(String[] args) {
	
		InterfaceChildTrian ob = new InterfaceChildTrian();
		ob.getArea();
	}

}
