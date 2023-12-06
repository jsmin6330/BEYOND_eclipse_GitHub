package day13_02_IO.ex01;

import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in; //표준입력
		
//		System.out.println("단일 문자 입력: ");
//		int num = is.read(); //예외 발생!!! 에러!!!
		// try-catch에 넣으면 에러 발생 안함
		
		
		try {
			System.out.print("단일 문자 입력: ");
//			int num = is.read();  //0~9는 48~57의 아스키코드 값을 가지고 있다.
			int num = is.read() - 48; //그래서 48값을 빼면 의도하는 숫자 출력 가능
			System.out.println(num);
			
			is.read(); //white space 제거를 위해 사용
			is.read(); //한번 더 써야햄... 자바는 문자가 2byte 처리되니까
			
			int num2 = is.read() - 48;
			System.out.println(num+num2); //두 수를 더한 값
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
