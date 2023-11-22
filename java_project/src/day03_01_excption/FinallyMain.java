package day03_01_excption;
import java.util.Scanner;

public class FinallyMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, result;
		
		try {
			System.out.println("정수 두 개 입력해주세요.");
			System.out.print("숫자 1: "); x = sc.nextInt();
			System.out.print("숫자 2: "); y = sc.nextInt();
			
			result = x/y; //문제 발생 소지 있는 코드
			System.out.printf("%d / %d = %d\n", x, y, result);
			
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException\n");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Exception\n");
			e.printStackTrace();
		}finally {
			System.out.println("finally 무조건 처리됨!!");
		}
	}
}
