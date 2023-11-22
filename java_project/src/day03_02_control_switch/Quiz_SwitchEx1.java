package day03_02_control_switch;
import java.util.Scanner;

public class Quiz_SwitchEx1 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		int n = new Scanner(System.in).nextInt();
		
		
		switch(n%2) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
		}
	}
}

