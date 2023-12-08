package day14_05_IO.Quiz;

import java.util.Scanner;


public class MainEntry {
	
	public static void menu() {
		System.out.println("\n\n*-*-*-*-* 메뉴 *-*-*-*-*");
		System.out.println("1. 회원 정보 추가");
		System.out.println("2. 회원 정보 삭제");
		System.out.println("3. 회원 정보 출력");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 파일로 내보내기");
		System.out.println("6. 종료");
		System.out.println("----------------------");
		System.out.print(" >> ");
	}
	
	
	public static void main(String[] args) throws Exception {
		MemberManagement mm = new MemberManagement();
		Scanner sc = new Scanner(System.in);
		
		
		while (true) { 
			menu();
			int select_menu = sc.nextInt();
			
			switch(select_menu) {
			case 1:
				System.out.println("\n*-*-*-* 회원 정보 추가 *-*-*-*");
				mm.Member_add();
				break;
			case 2:
				System.out.println("\n*-*-*-* 회원 정보 삭제 *-*-*-*");
				mm.Member_del();
				break;
			case 3:
				System.out.println("\n*-*-*-* 회원 정보 출력 *-*-*-*");
				mm.Member_display();
				break;
			case 4:
				System.out.println("\n*-*-*-* 회원 정보 수정 *-*-*-*");
				mm.Member_modify();
				break;
			case 5:
				System.out.println("\n*-*-*-* 파일로 내보내기 *-*-*-*");
				mm.makeFile();
				break;
			case 6:
				System.out.println("\n* 프로그램을 종료합니다.");
				System.exit(0);
			default:
				System
				.out.println("번호를 잘못 입력하셨습니다!!");
			}
		}
	}
}
