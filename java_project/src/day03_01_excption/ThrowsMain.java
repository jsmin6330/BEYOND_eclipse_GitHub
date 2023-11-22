package day03_01_excption;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsMain {	
	public static void main(String[] args)
			//throws ArithmeticException, InputMismatchException{ //예외처리 위임
			throws Exception{ //예외처리 한줄로 위임
				Scanner sc = new Scanner(System.in);
				int x, y, result;
		
				System.out.println("정수 두 개 입력해주세요.");
				System.out.print("숫자 1: "); x = sc.nextInt();
				System.out.print("숫자 2: "); y = sc.nextInt();
				
				result = x/y; //문제 발생 소지 있는 코드
				System.out.printf("%d / %d = %d\n", x, y, result);
	}
}
