package day13_02_IO.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {
	public static void main(String[] args) throws IOException { //예외처리 위임 - jvm
		
//		InputStream is = System.in; //표준 입력
//		Reader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
		
		//위의 코드를 아래와 같이 축약
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		System.out.println("charator input = ");
//		String str = br.readLine(); //예외발생
//		System.out.println(str);
		
//		String str1 = br.readLine(); //예외발생, 여러개 데이터 읽기
//		String str2 = br.readLine();
//		int su1 = Integer.parseInt(str1);
//		int su2 = Integer.parseInt(str2);
//		System.out.println(su1 + su2);
		
		
		//위의 코드를 아래와 같이 축약
		int su1 = Integer.parseInt(br.readLine()); //예외발생
		int su2 = Integer.parseInt(br.readLine());
		System.out.println(su1 + su2);
	}
}
