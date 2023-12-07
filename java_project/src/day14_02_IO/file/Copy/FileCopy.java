package day14_02_IO.file.Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		//읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("C:\\Users\\Playdata\\git\\BEYOND_eclipse_GitHub\\java_project/java.png");
		
		//쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("C:\\Users\\Playdata\\Pictures\\copy_test/javaa2.png");
		
		
		long start = System.currentTimeMillis();
		
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(inputData);
		}//end while
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		is.close();
		os.close();
		System.out.println("복사성공!!!");
		
	}//end main
}
