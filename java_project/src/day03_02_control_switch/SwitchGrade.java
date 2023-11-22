package day03_02_control_switch;
import java.util.Scanner;

public class SwitchGrade {
	public static void main(String[] args) {
		System.out.println("국어, 영어, 컴퓨터 점수를 입력해줘");
		Scanner sc = new Scanner(System.in);
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		int total = kor + eng + com;
		double avg = (double)total / 3;
		char grade;
		
		switch((int)avg/10) {
		case 10:
		case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F';
		}//end switch
		System.out.printf("총점은 %d고, 학점은 %s입니다.",total,grade);
	}
}
