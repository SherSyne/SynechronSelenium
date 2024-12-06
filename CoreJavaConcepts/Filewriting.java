package CoreJavaConcepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriting {

	public static void main(String[] args) throws IOException {
		//FileOutputStream fout = new FileOutputStream("D://test.txt");
		FileWriter fw = new FileWriter("D:\\test.txt");
		//String S = "Hey Welcome";
		//byte b[] = S.getBytes();
		//fout.write(b);
		//fout.close();
		fw.write("Welcome to India");
		System.out.println("success");
		fw.close();
	}

}
