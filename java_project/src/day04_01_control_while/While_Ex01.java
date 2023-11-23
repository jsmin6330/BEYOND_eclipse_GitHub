package day04_01_control_while;

import java.util.Scanner;

public class While_Ex01 {
	public static void main(String[] args) {
		int num;
		
		while(true) { //무한루프
			do {
				System.out.print("국어 점수를 입력하세요(0~100): ");
				num = new Scanner(System.in).nextInt();
			}while(num<0 || num>100);
			System.out.println("점수" + num);
			System.out.print("점수를 더 입력 받으시겠습니까?(y/n): ");
			char yesno = new Scanner(System.in).next().charAt(0);
			if(yesno == 'n' || yesno == 'N') {
				break;
			}
		}
	}
}
