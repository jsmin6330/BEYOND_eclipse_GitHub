package day06_03_method;

import java.util.Scanner;

public class Quiz_Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		info();
		abs(-100);
		
		System.out.print("정수 2개를 입력하세요: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		max(x, y);
	}
	
	
//	public static void info() {
//		System.out.println("이름: 이하율");
//		System.out.println("연락처: 010-1111-2222");
//		System.out.println("주소: 서울시 동작구 여의대방로 112");
//	}
	
	public static void info() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("연락처:");
		String phone = sc.next();
		System.out.print("주소:");
		String addr = sc.next();
		
		System.out.printf("이름: %s\n", name);
		System.out.printf("연락처: %s\n", phone);
		System.out.printf("주소: %s\n", addr);	
	}
	
	public static void abs(int x) {
		if(x<0) {
			x = -1 * x;
		}
		System.out.printf("절대값: %d\n",x);
	}
	
	public static void max(int x, int y) {
		if(x>y) {
			System.out.printf("큰 수 = %d\n", x);
		}
		else{
			System.out.printf("큰 수 = %d\n", y);
		}	
	}
}
