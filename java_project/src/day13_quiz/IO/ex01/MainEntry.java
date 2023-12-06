package day13_quiz.IO.ex01;
import java.io.IOException;

//2개의 정수를 입력 받고, 1개의 연산자 입력 받아서
//사칙연산 프로그램 작성하기(IO로 처리)
public class MainEntry {
	public static void main(String[] args) throws IOException {
		
		Calculator cal = new Calculator();
		cal.input();
		
		switch(cal.getCh()) {
		case '+':
			System.out.println(cal.plus());
			break;
		case '-':
			System.out.println(cal.minus());
			break;
		case '*':
			System.out.println(cal.multiply());
			break;
		case '/':
			if(cal.su2 == 0) {
				System.out.println("0으로 나눌 수 없습니다!");
				break;
			}
			System.out.println(cal.sub());
			break;
		default:
			System.out.println("올바른 연산자가 아닙니다.");
		}
	}
}
