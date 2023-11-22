//package day03_02_control;
//import java.util.Scanner;
//
//public class SwitchMain {
//	public static void main(String[] args) {
//		System.out.print("도시를 선택하세요(s, d, b, j): ");
//		
//		char ch = new Scanner(System.in).next().charAt(0); // "s" ==> "s\0"라서 0번째 문자만 뽑음
//		
//		switch(ch) { 
//		case 's' : System.out.print("서울"); break;
//		case 'd' : System.out.print("대구"); break;
//		case 'b' : System.out.print("부산"); break;
//		case 'j' : System.out.print("제주"); break;
//		default: 
//			System.out.println("잘못 선택하셨습니다. (s, d, b, j)중에서 선택하세요..");
//			System.exit(1); //exit안의 숫자는 상관없이 프로그램 강제종료
//		}//switch end
//		System.out.println("를(을) 선택하셨습니다.");
//	}
//}



package day03_02_control_switch;
import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) { 
		System.out.print("도시를 선택하세요(s, d, b, j): ");
		
		//char ch = new Scanner(System.in).next().charAt(0); // "s" ==> "s\0"라서 0번째 문자만 뽑음
		String str = new Scanner(System.in).next();
		
		switch(str) { 
		case "s" : System.out.print("서울"); break;
		case "d" : System.out.print("대구"); break;
		case "b" : System.out.print("부산"); break;
		case "j" : System.out.print("제주"); break;
		default: 
			System.out.println("잘못 선택하셨습니다. (s, d, b, j)중에서 선택하세요..");
			System.exit(1); //exit안의 숫자는 상관없이 프로그램 강제종료
		}//switch end
		System.out.println("를(을) 선택하셨습니다.");
	}
}