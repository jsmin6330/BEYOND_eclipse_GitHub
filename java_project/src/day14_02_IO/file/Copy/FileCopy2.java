package day14_02_IO.file.Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy2 {
	public static void main(String[] args) throws Exception {
		//읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("C:\\Users\\Playdata\\git\\BEYOND_eclipse_GitHub\\java_project/java.png");
		
		//쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("C:\\Users\\Playdata"
				+ "\\Pictures\\copy_test/javaa4.png");
		
		byte[] buffer = new byte[1024*8];
		long start = System.currentTimeMillis();
		
		
		while(true) {
			int inputData = is.read(buffer);
			if(inputData == -1) break;
			os.write(buffer, 0, inputData);
		}//end while
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		is.close();
		os.close();
		System.out.println("복사성공!!!");
		
	}//end main
}
