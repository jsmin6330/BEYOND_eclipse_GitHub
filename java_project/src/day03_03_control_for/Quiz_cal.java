//package day03_03_control_for;
//import java.util.Scanner;
//
//public class Quiz_cal {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("사칙연산 프로그램입니다.");
//		
//		System.out.print("첫 번째 숫자를 입력하세요: ");
//		int a = sc.nextInt();
//		System.out.print("두 번째 숫자를 입력하세요: ");
//		int b = sc.nextInt();
//		System.out.print("연산자를 입력하세요(+, -, *, /): ");
//		char c = sc.next().charAt(0);
//		
//		int result = 0;
//		double result2 = 0;
//	
//		if(c =='+') {
//			result = a + b;
//			System.out.printf("%d %s %d = %d", a, c, b, result);
//		}
//		else if(c == '-') {
//			result = a - b;
//			System.out.printf("%d %s %d = %d", a, c, b, result);
//		}
//		else if(c == '*') {
//			result = a * b;
//			System.out.printf("%d %s %d = %d", a, c, b, result);
//		}
//		else if(c == '/') {
//			if(b==0) {
//				System.out.println("0으로 나눌 수 없습니다.");
//				return;
//			}
//			else {
//				result2 = (double)a / (double)b;
//				System.out.printf("%d %s %d = %.2f", a, c, b, result2);
//			}
//		}
//		else {
//			System.out.println("올바른 연산자가 아닙니다. 계산을 수행할 수 없습니다.");
//			return;
//		}
//	}
//}

package day03_03_control_for;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz_cal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사칙연산 프로그램입니다.");
		
		try {
			System.out.print("첫 번째 숫자를 입력하세요: ");
			int a = sc.nextInt();
			System.out.print("두 번째 숫자를 입력하세요: ");
			int b = sc.nextInt();
			System.out.print("연산자를 입력하세요(+, -, *, /): ");
			char c = sc.next().charAt(0);
			
			int result = 0;
			double result2 = 0;

				if(c =='+') {
					result = a + b;
					System.out.printf("%d %s %d = %d", a, c, b, result);
				}
				else if(c == '-') {
					result = a - b;
					System.out.printf("%d %s %d = %d", a, c, b, result);
				}
				else if(c == '*') {
					result = a * b;
					System.out.printf("%d %s %d = %d", a, c, b, result);
				}
				
				else if(c == '/') {
					result2 = a / b;
					System.out.printf("%d %s %d = %.2f", a, c, b, result2);
				}
				
				else {
					System.out.println("올바른 연산자가 아닙니다. 계산을 수행할 수 없습니다.");
					return;
				}

		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
			System.out.println("올바른 숫자를 입력하세요.");
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
