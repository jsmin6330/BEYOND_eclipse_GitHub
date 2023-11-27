package quiz_special;
import java.util.Scanner;

public class Score_v07_Array_method2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		input_score();
	}
	
	public static void input_score() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, com = 0;
		
		System.out.print("name = ");
		String name = sc.nextLine();
		
		 do {
				System.out.print("국어 점수를 입력하세요(0~100) = ");
				kor = sc.nextInt();
		  } while ( kor < 0 || kor > 100 );
		 do {
				System.out.print("영어 점수를 입력하세요(0~100) = ");
				eng = sc.nextInt();
		  } while ( eng < 0 || eng > 100 );
		 do {
				System.out.print("전산 점수를 입력하세요(0~100) = ");
				com = sc.nextInt();
		  } while ( com < 0 || com > 100 );
		 
		 int total = total(kor, eng, com);
		 double avg = average(total, 3);
		 char grade = grade(avg);
		 
		 output(name, kor, eng, com, total, avg, grade);
	}
	
	public static int total(int ...score) {
		int tot = 0;
		for(int i = 0; i<score.length; i++) {
			tot += score[i];
		}
		return tot;
	}
	
	public static double average(int a, double b) {
		double avg = (double)a / b;
		return avg;
	}
	
	public static char grade(double avg) {
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
		return grade;
	}
	
	public static void output(String name, int kor, int eng, int com, int total, double avg, char grade) {
		System.out.printf("%s님의 성적표 *****\n", name);
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor, eng, com);
		System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s\n",total,avg,grade);
	}

}