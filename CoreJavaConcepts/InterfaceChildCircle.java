package CoreJavaConcepts;

public class InterfaceChildCircle implements InterfaceGetArea {

	 public void getArea() {
	    	int r = 10;
	    	
	    	double c = 3.14 *r*r;
	    	System.out.println("the Area of circle is:" + c);
	 }  	
	    	
	    	public static void main(String[] args) {
	    		// TODO Auto-generated method stub
	    		InterfaceChildCircle ob = new  InterfaceChildCircle();
	    		ob.getArea();
	    	}

}
	 
	 
