package CoreJavaConcepts;

public class ThrowsnThrow {
	public void readfile(String filename) throws  {
		FileReader fr = new FileReader("Downloads\\test.txt");
	}
	
	public void sleep() {
		Thread.sleep(2000);
	}
	public static void main(String[] args) {
	
		ThrowsnThrow th = new ThrowsnThrow();
		
	}

}
