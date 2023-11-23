package quiz_special;
import java.util.Scanner;

//여러명의 데이터를 받을 수 있도록 while 무한루프 추가
public class Score_v03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //객체 생성, 메모리에 할당, 생성자함수 자동호출
		int kor, eng, com;
		int total;
		double avg;
		char grade;
		char yesno;
		
		while(true) { 
			System.out.print("이름: ");
			String name = sc.next();
			
			do {
				System.out.print("국어, 영어, 컴퓨터 점수를 입력해줘(공백구분): ");
				kor = sc.nextInt();
				eng = sc.nextInt();
				com = sc.nextInt();
			}while(	(kor < 0 || kor > 100) || (eng < 0 || eng > 100) || (com < 0 || com > 100));
				
			total = kor + eng + com;
			avg = total / 3.0;

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
			System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s\n",total,avg,grade);
			
			
			System.out.print("계속 입력하시겠습니까?(Y/N): ");
			yesno = sc.next().charAt(0);
			
			if(yesno == 'n' || yesno == 'N') {break;}
		}
		System.out.println("시스템이 종료했습니다.");
	}
}


