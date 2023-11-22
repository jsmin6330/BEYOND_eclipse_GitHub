package quiz_special;
import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //객체 생성, 메모리에 할당, 생성자함수 자동호출
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.println("국어, 영어, 컴퓨터 점수를 입력해줘");
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("컴퓨터: ");
		int com = sc.nextInt();
		
		int total = kor + eng + com;
		double avg = total / 3.0;
		char grade;
		
		
		if(avg>100 || avg<60) {
			grade = 'F';
		}
		else if(avg>=90) {
			grade = 'A';
		}
		else if(avg>=80) {
			grade = 'B';
		}
		else if(avg>=70) {
			grade = 'C';
		}
		else{
			grade = 'D';
		}
		System.out.printf("%s님의 성적표 *****\n", name);
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor, eng, com);
		System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s",total,avg,grade);
	}
}


//package special_quiz_list;
//import java.util.Scanner;
//
//public class Score {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름: ");
//		String name = sc.nextLine();
//		
//		System.out.println("국어, 영어, 컴퓨터 점수를 입력해줘");
//		System.out.print("국어: ");
//		int kor = sc.nextInt();
//		System.out.print("영어: ");
//		int eng = sc.nextInt();
//		System.out.print("컴퓨터: ");
//		int com = sc.nextInt();
//		
//		int total = kor + eng + com;
//		double avg = (double)total / 3;
//		char grade;
//		
//		switch((int)avg/10) {
//		case 10:
//		case 9:
//			grade = 'A'; break;
//		case 8:
//			grade = 'B'; break;
//		case 7:
//			grade = 'C'; break;
//		case 6:
//			grade = 'D'; break;
//		default:
//			grade = 'F';
//		}//end switch
//		
//		System.out.printf("%s님의 성적표 *****\n", name);
//		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor, eng, com);
//		System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s",total,avg,grade);
//	}
//}

