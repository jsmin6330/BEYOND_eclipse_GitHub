package day14_02_IO.file.Copy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Uricopy {
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		URL url = new URL("https://velog.velcdn.com/images%2Fjennyfromdeblock%2Fpost%2Fa67a6bb4-0da3-44e3-a933-494a72fc5366%2FPython-Data-Structures.png");
		
		
		//읽기 객체 - FileInputStream
		InputStream is = url.openStream();
		
		//쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("자료구조.jpg");
		
		
		byte[] buffer = new byte[1024*8];
		
		while(true) {
			int inputData = is.read(buffer);//버퍼 사이즈만큼 읽어옴
			if(inputData == -1)break;
			os.write(buffer, 0, inputData);
		}
		is.close();
		os.close();
		System.out.println("웹에서 이미지 복사성공!!!");
	}
}
