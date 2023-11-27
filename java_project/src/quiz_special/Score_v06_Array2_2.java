package quiz_special;
import java.util.Scanner;

public class Score_v06_Array2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //객체 생성, 메모리에 할당, 생성자함수 자동호출
		int num_person;
		int num_subject = 4; //국어, 영어, 전산, 총점, 평균
		
		System.out.print("몇명의 학생을 입력받으시겠습니까?: ");
		num_person = sc.nextInt();
		
		String[] name = new String[num_person];
		String[] subject_name = {"국어", "영어", "전산", "총점"};
		int[][] subject = new int[num_person][num_subject];
		double[] avg = new double[num_person];
		
		int total_all = 0;
		double avg_all;
		char[] grade = new char[10];
		
		//성적 입력받으면서 총점, 평점도 같이 구하기
		for(int i = 0; i<num_person; i++) { 
			System.out.printf("%d번 학생의 정보를 입력하세요\n", i+1);
			System.out.print("이름: ");
			name[i] = sc.next();
				for(int j=0; j<num_subject; j++) {
					if(j==num_subject-1) {
						subject[i][j] = subject[i][0] + subject[i][1] +subject[i][2];
					}
					else {
						do {
							System.out.printf("%s점수를 입력해줘: ", subject_name[j]);
							subject[i][j] =sc.nextInt();
						}while(	(subject[i][j] < 0 || subject[i][j] > 100));
					}
				}// end for j
			
			avg[i] = (double)subject[i][3] / 3.0;
			
			total_all += subject[i][3];
			
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
			
		} //end for i문 
		
		//출력하기
		System.out.println("\n--------- 성적을 출력하겠습니다 ---------");
		for(int i = 0; i<num_person; i++) {
			System.out.printf("\n%s님의 성적표 *****\n", name[i]);
			System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", subject[i][0], subject[i][1], subject[i][2]);
			System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s\n",subject[i][3],avg[i],grade[i]);
		}//end for문
		avg_all = total_all/3/num_person;
		
		System.out.println("\n-----------------------------");
		System.out.printf("학급 총점: %d, 학급 총 평균: %.2f\n", total_all, avg_all);
		System.out.println("\n시스템이 종료했습니다.");
	}
}