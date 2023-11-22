package day03_02_control_switch;
import java.util.Scanner;

public class MainEntry {
//	public static void main(String[] args) {
//		System.out.print("당신의 포인트 점수는?(1~3점): ");
//		int point = new Scanner(System.in).nextInt();
//		
//		switch(point){ //정수형(long형 제외), 실수형 안됨, 문자형
//		// 숫자, '문자', "문자열"
//		case 1: 
//			System.out.println("포인트 1점입니다.");
//			break;
//		case 2: 
//			System.out.println("포인트 2점입니다.");
//			break;
//		case 3:
//			System.out.println("포인트 3점입니다.");
//			break;
//		default:
//			System.out.println("없는 점수입니다.(1~3까지만 입력요망)");
//		} // switch end
//	}
	
	public static void main(String[] args) {
		System.out.print("당신의 포인트 점수는?(1~3점): ");
		double point = new Scanner(System.in).nextDouble();
		
		switch((int)point){ //정수형(long형 제외), 실수형 안됨, 문자형
		// 숫자, '문자', "문자열"
		case 1: 
			System.out.println("포인트 1점입니다.");
			break;
		case 2: 
			System.out.println("포인트 2점입니다.");
			break;
		case 3:
			System.out.println("포인트 3점입니다.");
			break;
		default:
			System.out.println("없는 점수입니다.(1~3까지만 입력요망)");
		} // switch end
	}
}
