package DataDriven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Testcase1  {
// Class separately to output the data
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fin = new FileInputStream("C://Users//Kiosk_User//Desktop//JavaPract//JavaSelenium//Config.properties");
		prop.load(fin);
		
		String s = prop.getProperty("username");
		String p = prop.getProperty("password");
		String e = prop.getProperty("environment");
		System.out.println(s);
		System.out.println(p);
		System.out.println(e);
		fin.close();
		

	}

}
