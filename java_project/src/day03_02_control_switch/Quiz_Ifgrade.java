package day03_02_control_switch;

import java.util.Scanner;

public class Quiz_Ifgrade {
	public static void main(String[] args) {
		System.out.println("국어, 영어, 컴퓨터 점수를 입력해줘");
		Scanner sc = new Scanner(System.in);
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		int total = kor + eng + com;
		double avg = (double)total / 3;
		char grade;
		
		if(avg>=90) {
			grade = 'A';
		}
		else if(avg>=80) {
			grade = 'B';
		}
		else if(avg>=70) {
			grade = 'C';
		}
		else if(avg>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}	
		System.out.printf("총점은 %d고, 평균은%.2f고,학점은 %s입니다.",total,avg,grade);
	}
}
