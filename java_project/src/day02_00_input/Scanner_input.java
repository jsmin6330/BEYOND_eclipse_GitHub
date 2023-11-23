package day02_00_input;

import java.util.Scanner;

public class Scanner_input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 데이터 이력 요망: ");
		int x = sc.nextInt();
		System.out.print("실수 데이터 이력 요망: ");
		double y = sc.nextDouble();
		System.out.print("문자 데이터 이력 요망: ");
		char c = sc.next().charAt(0);
		
		System.out.print("문자열 데이터 이력 요망: ");
		String str1 = sc.next(); //공백 인식 못함
		System.out.print("문자열 데이터 이력 요망: ");
		String str2 = sc.nextLine(); //공백 인식 못함
		
	}
}
