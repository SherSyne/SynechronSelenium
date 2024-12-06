package CoreJavaConcepts;

public class EncapsulationEg {
	
	private String Name;
	private int id;
	//getter methods to fetch the private data
	//setter methods to set the data
	
	public void getnameid() {
		System.out.println(Name);
		System.out.println(id);
	}
	
	public void setname(String n, int i) {
		this.Name = n;
		this.id= i;
	
	}
		
	public static void main(String[] args) {
		
		EncapsulationEg eg =new EncapsulationEg();
		eg.setname("Peter", 5);
		eg.getnameid();
	}

}
