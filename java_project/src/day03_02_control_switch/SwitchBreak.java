package day03_02_control_switch;
import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) { 
		System.out.print("point: ");
		
		int p = new Scanner(System.in).nextInt();
		
		switch(p) { 
		case 1 : System.out.print("집 ");
		case 2 : System.out.print("피아노 "); 
		case 3 : System.out.print("우산 ");
		case 4 : System.out.print("달고나 "); 
		System.out.println("상품에 당첨되셨습니다..");
		}//switch end
	}
}