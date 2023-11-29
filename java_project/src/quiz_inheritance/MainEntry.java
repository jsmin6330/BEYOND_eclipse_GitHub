package quiz_inheritance;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		char yn;

		System.out.print("해당하는 근무 형태를 골라주세요.\n"
				+ "1. 정직원\n"
				+ "2. 파트직원\n"
				+ "입력: ");
		
		choice = sc.nextInt();
		if(choice==2) {
			PartTime pt = new PartTime();
			pt.display();
		}
		else {
			System.out.print("영업부서인가요?(Y/N) : ");
			yn = sc.next().charAt(0);
			if(yn == 'Y') {
				Sales sales = new Sales();
				sales.display();
			}else {
				Regular regular = new Regular();
				regular.display();
			}
		}

	}
}
