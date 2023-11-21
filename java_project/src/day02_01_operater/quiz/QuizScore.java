package day02_01_operater.quiz;

import java.util.Scanner;

public class QuizScore {
//	public static void main(String[] args) {
//		int kor = 90;
//		int eng = 88;
//		int com = 100;
//		
//		int total = kor + eng + com;
//		float avg = (float)total / 3; 
//		
//		System.out.println("고양이님의 성적표****");
//		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor, eng, com);
//		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
//	}
	
//	public static void main(String[] args) { //Scanner을 사용해서 입력 받음
//		int kor, eng, com;
//		String name;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름: ");
//		name = sc.next();
//		System.out.println("성적을 입력하시오>>");
//		System.out.print("국어: ");
//		kor = sc.nextInt();
//		System.out.print("영어: ");
//		eng = sc.nextInt();
//		System.out.print("전산: ");
//		com = sc.nextInt();
//		
//		
//		int total = kor + eng + com;
//		float avg = (float)total / 3; 
//		
//		System.out.printf("%s님의 성적표****\n",name);
//		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor, eng, com);
//		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
//	}
	
	public static void main(String[] args) { //변수 선언과 동시에 입력받기
		System.out.println("kor, eng, com date & name input: ");
		int kor = new Scanner(System.in).nextInt();
		int eng = new Scanner(System.in).nextInt();
		int com = new Scanner(System.in).nextInt();
		String name = new Scanner(System.in).next();
			
		int total = kor + eng + com;
		float avg = (float)total / 3; 
		
		System.out.printf("%s님의 성적표****\n",name);
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor, eng, com);
		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
	}
}
