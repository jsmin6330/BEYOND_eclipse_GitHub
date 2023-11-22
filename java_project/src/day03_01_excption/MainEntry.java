//package day03_01_excption;
//public class MainEntry { //예외 발생 연출1
//	public static void main(String[] args) {
//		int x = 3, y = 0;
//		
//		//예외발생
//		int result = x/y; //java.lang.ArithmeticException(숫자 관련 에러)
//		
//		System.out.println(result); 
//	}
//}


//package day03_01_excption;
//public class MainEntry { //예외 발생 연출2
//	public static void main(String[] args) {
//		int x = 3, y = 0;
//		
//		if(y == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
//		else {
//			int result = x/y; //예외 발생: 스택영역의 변수는 범위를 벗어나면 못씀
//		}	
//		System.out.println(result); 
//	}
//}


//package day03_01_excption; 
//public class MainEntry { //예외발생 해결1
//	public static void main(String[] args) {
//		int x = 3, y = 0;
//		int result = 0;
//		
//		if(y == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			return; 
//		} else {
//			result = x/y; 
//		}	
//		System.out.println(result); 
//	}
//}

package day03_01_excption;
import java.util.Scanner;
public class MainEntry { //예외발생 해결2
	public static void main(String[] args) {
		int x, y = 0;
		int result = 0;
		
		try {
			System.out.print("x값을 입력하세요: ");
			x = new Scanner(System.in).nextInt();
			System.out.print("y값을 입력하세요: ");
			y = new Scanner(System.in).nextInt();
			
			result = x/y; //문제 발생 소지 있는 코드
			System.out.println(result); 
			
		}catch(Exception e) {
			//System.out.println("0으로 나눌 수 없습니다."); //user message
			//System.out.println(e.getMessage()); 
			e.printStackTrace(); //단계적으로 찾아서 쓴다. 주로 사용
		} //try end
	}
}