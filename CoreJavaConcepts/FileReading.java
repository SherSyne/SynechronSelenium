package CoreJavaConcepts;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {


	public static void main(String[] args) throws IOException {
//prgrm to read data from file using file input stream
			FileInputStream fin = new FileInputStream("D://test.txt");//I can also use FileReader fr = new FileReader(.....);
			
			int i = 0;
			
			while((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
	}

}


