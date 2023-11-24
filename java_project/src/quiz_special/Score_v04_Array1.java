//package quiz_special;
//
//import java.util.Scanner;
//
//public class Score_v04_Array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);  //객체 생성, 메모리에 할당, 생성자함수 자동호출
//		int num;
//		
//		System.out.print("몇명의 학생을 입력받으시겠습니까?: ");
//		num = sc.nextInt();
//		
//		String[] name = new String[num];
//		int[] kor = new int[num];
//		int[] eng = new int[num];
//		int[] com = new int[num];
//		int[] total = new int[num];
//		double[] avg = new double[num];
//		
//		char grade;
//		char yesno;
//		
//		//성적 입력받기
//		for(int i = 0; i<num; i++) { 
//			System.out.print("이름: ");
//			name[i] = sc.next();
//			do {
//				System.out.print("국어, 영어, 컴퓨터 점수를 입력해줘(공백구분): ");
//				kor[i] = sc.nextInt();
//				eng[i] = sc.nextInt();
//				com[i] = sc.nextInt();
//			}while(	(kor[i] < 0 || kor[i] > 100) || (eng[i] < 0 || eng[i] > 100) || (com[i] < 0 || com[i] > 100));
//		} //end for문 
//		
//		//총점, 평점구하기
//		for(int i = 0; i<num; i++) {
//			total[i] = kor[i] + eng[i] + com[i];
//			avg[i] = total[i] / 3.0;
//		}//end for문
//		
//		//출력하기
//		System.out.println("\n성적을 출력하겠습니다---------");
//		for(int i = 0; i<num; i++) {
//			if(avg[i]>100 || avg[i]<60) {
//				grade = 'F';
//			}
//			else if(avg[i]>=90) {
//				grade = 'A';
//			}
//			else if(avg[i]>=80) {
//				grade = 'B';
//			}
//			else if(avg[i]>=70) {
//				grade = 'C';
//			}
//			else{
//				grade = 'D';
//			}
//			System.out.printf("%s님의 성적표 *****\n", name[i]);
//			System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor[i], eng[i], com[i]);
//			System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s\n",total[i],avg[i],grade);
//		}//end for문
//		
//		System.out.println("시스템이 종료했습니다.");
//	}
//}




//package quiz_special;
//import java.util.Scanner;
//
//public class Score_v04_Array1 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);  //객체 생성, 메모리에 할당, 생성자함수 자동호출
//		int num;
//		
//		System.out.print("몇명의 학생을 입력받으시겠습니까?: ");
//		num = sc.nextInt();
//		
//		String[] name = new String[num];
//		int[] kor = new int[num];
//		int[] eng = new int[num];
//		int[] com = new int[num];
//		int[] total = new int[num];
//		double[] avg = new double[num];
//		
//		int total_all = 0;
//		double avg_all;
//		
//		char grade;
//		char yesno;
//		
//		//성적 입력받으면서 총점, 평점도 같이 구하기
//		for(int i = 0; i<num; i++) { 
//			System.out.printf("%d번 학생의 정보를 입력하세요\n", i+1);
//			System.out.print("이름: ");
//			name[i] = sc.next();
//			do {
//				System.out.print("국어, 영어, 컴퓨터 점수를 입력해줘(공백구분): ");
//				kor[i] = sc.nextInt();
//				eng[i] = sc.nextInt();
//				com[i] = sc.nextInt();
//			}while(	(kor[i] < 0 || kor[i] > 100) || (eng[i] < 0 || eng[i] > 100) || (com[i] < 0 || com[i] > 100));
//			total[i] = kor[i] + eng[i] + com[i];
//			avg[i] = (double)total[i] / 3.0;
//			
//			total_all += total[i];
//			
//		} //end for문 
//		
//		//출력하기
//		System.out.println("\n--------- 성적을 출력하겠습니다 ---------");
//		for(int i = 0; i<num; i++) {
//			if(avg[i]>100 || avg[i]<60) {
//				grade = 'F';
//			}
//			else if(avg[i]>=90) {
//				grade = 'A';
//			}
//			else if(avg[i]>=80) {
//				grade = 'B';
//			}
//			else if(avg[i]>=70) {
//				grade = 'C';
//			}
//			else{
//				grade = 'D';
//			}
//			System.out.printf("\n%s님의 성적표 *****\n", name[i]);
//			System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor[i], eng[i], com[i]);
//			System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s\n",total[i],avg[i],grade);
//		}//end for문
//		avg_all = total_all/3/num;
//		
//		System.out.printf("학급 총점: %d, 학급 총 평균: %.2f\n", total_all, avg_all);
//		System.out.println("\n시스템이 종료했습니다.");
//	}
//}


package quiz_special;
import java.util.Scanner;

public class Score_v04_Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //객체 생성, 메모리에 할당, 생성자함수 자동호출
		int num;
		
		System.out.print("몇명의 학생을 입력받으시겠습니까?: ");
		num = sc.nextInt();
		
		String[] name = new String[num];
		int[] kor = new int[num];
		int[] eng = new int[num];
		int[] com = new int[num];
		int[] total = new int[num];
		double[] avg = new double[num];
		
		int total_all = 0;
		double avg_all;
		
		char[] grade = new char[10];
		char yesno;
		
		//성적 입력받으면서 총점, 평점도 같이 구하기
		for(int i = 0; i<num; i++) { 
			System.out.printf("%d번 학생의 정보를 입력하세요\n", i+1);
			System.out.print("이름: ");
			name[i] = sc.next();
			do {
				System.out.print("국어, 영어, 컴퓨터 점수를 입력해줘(공백구분): ");
				kor[i] = sc.nextInt();
				eng[i] = sc.nextInt();
				com[i] = sc.nextInt();
			}while(	(kor[i] < 0 || kor[i] > 100) || (eng[i] < 0 || eng[i] > 100) || (com[i] < 0 || com[i] > 100));
			total[i] = kor[i] + eng[i] + com[i];
			avg[i] = (double)total[i] / 3.0;
			
			total_all += total[i];
			
		} //end for문 
		
		//출력하기
		System.out.println("\n--------- 성적을 출력하겠습니다 ---------");
		for(int i = 0; i<num; i++) {
			if(avg[i]>100 || avg[i]<60) {
				grade[i] = 'F';
			}
			else if(avg[i]>=90) {
				grade[i] = 'A';
			}
			else if(avg[i]>=80) {
				grade[i] = 'B';
			}
			else if(avg[i]>=70) {
				grade[i] = 'C';
			}
			else{
				grade[i] = 'D';
			}
			System.out.printf("\n%s님의 성적표 *****\n", name[i]);
			System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor[i], eng[i], com[i]);
			System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s\n",total[i],avg[i],grade[i]);
		}//end for문
		avg_all = total_all/3/num;
		
		System.out.printf("학급 총점: %d, 학급 총 평균: %.2f\n", total_all, avg_all);
		System.out.println("\n시스템이 종료했습니다.");
	}
}