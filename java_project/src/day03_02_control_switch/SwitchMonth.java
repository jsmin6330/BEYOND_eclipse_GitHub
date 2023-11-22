package day03_02_control_switch;
import java.util.Scanner;

public class SwitchMonth {
	public static void main(String[] args) {
		System.out.println("원하는 달의 일수 확인 하기 : ");
		int month = new Scanner(System.in).nextInt(); 
		int day = 0; 
		String result = null;
		boolean flag = false;
		
		switch (month) {
			case 1 : case 3: case 5: case 7: case 8: case 10: case 12:  
				day = 31;	break;
			case 4 : 
			case 6: 
			case 9: 
			case 11:   
				day = 30;	break;
			case 2 : 
				day = 28;
		} 
		System.out.println(month + " ==> " + day + "일까지 있습니다.");
	}
}
