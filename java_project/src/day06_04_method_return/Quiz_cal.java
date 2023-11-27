package day06_04_method_return;

import java.util.Scanner;

public class Quiz_cal {
	public static int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	public static int sub(int x, int y) {
		int result = x - y;
		return result;
	}
	
	public static int mul(int x, int y) {
		int result = x * y;
		return result;
	}
	
	public static double div(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 2개를 입력해주세요: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", x, y, plus(x, y));
		System.out.printf("%d - %d = %d\n", x, y, sub(x, y));
		System.out.printf("%d * %d = %d\n", x, y, mul(x, y));
		if(y==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		else {
			System.out.printf("%d / %d = %.2f\n", x, y, div(x, y));
		}
	}
}
