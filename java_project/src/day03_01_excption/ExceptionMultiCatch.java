package day03_01_excption;
import java.util.Scanner;
import java.util.InputMismatchException;


public class ExceptionMultiCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수 두 개 입력해주세요.");
			System.out.print("숫자 1: "); int num1 = sc.nextInt();
			System.out.print("숫자 2: "); int num2 = sc.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
			System.out.println("올바른 숫자를 입력하세요.");
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			System.out.println("Exception");
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
