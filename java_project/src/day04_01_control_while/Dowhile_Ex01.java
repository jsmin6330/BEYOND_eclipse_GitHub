package day04_01_control_while;

import java.util.Scanner;

public class Dowhile_Ex01 {
	
	public static void main(String[] args) {
		int num = 0;		
		
		do {
			System.out.print("점수를 입력하세요: ");
			num = new Scanner(System.in).nextInt();
			
		}while(num<0 || num>100);
		System.out.print("num: " + num);
		
	}
}
