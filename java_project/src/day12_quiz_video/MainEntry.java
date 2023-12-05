package day12_quiz_video;

import java.util.Scanner;

public class MainEntry {
	
	public static void menu() {
		System.out.println("\n\n*-*-*-*-* 메뉴 *-*-*-*-*");
		System.out.println("1. Video 추가");
		System.out.println("2. Video 삭제");
		System.out.println("3. Video 리스트 출력");
		System.out.println("4. Video 수정");
		System.out.println("5. Video 대여");
		System.out.println("6. Video 반납");
		System.out.println("7. 종료");
		System.out.println("----------------------");
		System.out.print(" >> ");
	}
	
	public static void main(String[] args) {
		VideoLend vl = new VideoLend();
		Scanner sc = new Scanner(System.in);
		
		
		while (true) { 
			menu();
			int select_menu = sc.nextInt();
			
			switch(select_menu) {
			case 1:
				System.out.println("\n*-*-*-* 비디오 추가 *-*-*-*");
				vl.video_add();
				break;
			case 2:
				System.out.println("\n*-*-*-* 비디오 삭제 *-*-*-*");
				vl.video_delete();
				break;
			case 3:
				System.out.println("\n*-*-*-* 비디오 리스트 출력 *-*-*-*");
				vl.video_display();
				break;
			case 4:
				System.out.println("\n*-*-*-* 비디오 정보 수정 *-*-*-*");
				vl.video_change();
				break;
			case 5:
				System.out.println("\n*-*-*-* 비디오 대여 *-*-*-*");
				vl.video_lend();
				break;
			case 6:
				System.out.println("\n*-*-*-* 비디오 반납 *-*-*-*");
				vl.video_return();
				break;	
			case 7:
				System.out.println("\n* 프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("번호를 잘못 입력하셨습니다!!");
			}
		}
		
	}
}
