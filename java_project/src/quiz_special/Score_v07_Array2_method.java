//package quiz_special;
//import java.util.Scanner;
//
//public class Score_v07_Array2_method {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in); 
//		int num_person;
//		int num_subject = 4;
//		String[] subject_name = {"국어", "영어", "전산"};
//		
//		System.out.print("몇명의 학생을 입력받으시겠습니까?: ");
//		num_person = sc.nextInt();
//		
//		String[] name = new String[num_person];
//		int[] total = new int[num_person];
//		int[][] subject = new int[num_person][num_subject];
//		double[] avg = new double[num_person];
//		char[] grade = new char[10];
////		int total_all = 0;
////		double avg_all;
//		
//		for(int i = 0; i<num_person; i++) {
//			System.out.print("name = ");
//			name[i] = sc.next();
//			
//			for(int j = 0; j<subject_name.length; j++) {
//				subject[i][j] = input_score(name[i]);
//				total[i] += subject[i][j];
//			}
//			avg[i] = total[i] / num_subject;
//			grade[i] = grade(avg[i]);
//			output(name, subject[i][0], subject[i][1], subject[i][2], total[i], avg, grade);
//		}
//		
//	}
//	
//	public static int input_score(String subject) {
//		Scanner sc = new Scanner(System.in);
//		int score;
//		 do {
//				System.out.printf("%s 점수를 입력하세요(0~100) = ", subject);
//				score = sc.nextInt();
//		  } while ( score < 0 || score > 100 );	
//		return score;
//	}
//	
//	public static int total(int ...score) {
//		int tot = 0;
//		for(int i = 0; i<score.length; i++) {
//			tot += score[i];
//		}
//		return tot;
//	}
//	
//	public static double average(int a, double b) {
//		double avg = (double)a / b;
//		return avg;
//	}
//	
//	public static char grade(double avg) {
//		char grade;
//		if(avg>100 || avg<60) {
//			grade = 'F';
//		}
//		else if(avg>=90) {
//			grade = 'A';
//		}
//		else if(avg>=80) {
//			grade = 'B';
//		}
//		else if(avg>=70) {
//			grade = 'C';
//		}
//		else{
//			grade = 'D';
//		}
//		return grade;
//	}
//	
//	public static void output(String name, int kor, int eng, int com, int total, double avg, char grade) {
//		System.out.printf("%s님의 성적표 *****\n", name);
//		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor, eng, com);
//		System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s\n",total,avg,grade);
//	}
//
//}