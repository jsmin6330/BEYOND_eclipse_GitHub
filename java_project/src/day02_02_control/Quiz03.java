package day02_02_control;

import java.util.Scanner;

public class Quiz03 {
//	public static void main(String[] args) {
//		System.out.print("첫 번째 숫자를 입력하세요: ");
//		int a = new Scanner(System.in).nextInt();
//		
//		System.out.print("두 번째 숫자를 입력하세요: ");
//		int b = new Scanner(System.in).nextInt();
//		
//		if(a>b) {
//			System.out.printf("큰 수는 %d입니다.", a);
//		}
//		else if(a<b){
//			System.out.printf("큰 수는 %d입니다.", b);
//		}
//		else {
//			System.out.printf("두 수는 같습니다.");
//		}
//	}
	
//		public static void main(String[] args) {
//		System.out.print("연도를 입력하세요: ");
//		int year = new Scanner(System.in).nextInt();
//		
//		if((year%400 == 0) || ((year%4 == 0) && (year%100 != 0))){
//			System.out.println("윤년입니다.");
//		}
//		else{
//			System.out.println("평년입니다.");
//		}
//	}

	public static void main(String[] args) {
		System.out.println("아래 각 과목의 점수를 입력하세요");
		System.out.print("전산: ");
		int com = new Scanner(System.in).nextInt();
		System.out.print("영어: ");
		int eng = new Scanner(System.in).nextInt();
		System.out.print("국어: ");
		int kor = new Scanner(System.in).nextInt();
		
		int avg = (com + eng + kor)/3;
		
		if((avg>=60 && (com>40 && eng> 40 && kor>40))) {
			System.out.print("합격입니다.");
		}
		else {
			System.out.print("불합격입니다.");
		}
	}
}	
