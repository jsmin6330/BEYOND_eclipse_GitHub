package day14_01_IO.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

//상대경로로 파일 생성
public class FileinputEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
//			OutputStream os = new FileOutputStream("test.txt");
			//상대경로, 예외 발생함
			OutputStream os = new FileOutputStream("C:\\Users\\Playdata\\git\\BEYOND_eclipse_GitHub\\java_project.memo.txt");
			
			while(true) {
				System.out.println("문자열 입력 요망: ");
				String str = sc.nextLine() + "\r\n";
				
				if(str.equalsIgnoreCase("EXIT\r\n")){
					System.out.println(str.length() + "byte 만큼 썼습니다.");
					break;
				}				
				
				os.write(str.getBytes()); //예외발생, 읽어들인 문자 str의 길이(getBytes())만큼 써주세요.
				System.out.println(str); //화면 출력 
				
			}//while end			
		}catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
	}//main end
}
