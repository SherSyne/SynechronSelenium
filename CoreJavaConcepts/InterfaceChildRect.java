package CoreJavaConcepts;

public class InterfaceChildRect implements InterfaceGetArea {
	
	    public void getArea() {
	    	int l = 10;
	    	int b = 20;
	    	int c = l*b;
	    	System.out.println("the Area of rectangle is:" + c);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChildRect ob = new  InterfaceChildRect();
		ob.getArea();
	}

}
