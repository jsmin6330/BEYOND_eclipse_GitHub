package day18_quiz_jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException{
		Scanner sc = new Scanner(System.in);
		menu();
		int choice = sc.nextInt();
		
		Gift_set_Manager gs = new Gift_set_Manager();
		
		do {
			switch(choice) {
			case 1:
				gs.gift_select_ALL();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력 입니다");
			}
		}while(choice >= 1 || choice <= 6);
	}
	
	public static void menu() {
        System.out.println("메뉴를 골라주세요");
        System.out.println("1. select all");
        System.out.println("2. select by gno");
        System.out.println("3. update ");
        System.out.println("4. delete ");
        System.out.println("5. insert ");
        System.out.println("6. exit ");
        System.out.print("선택 번호: ");
    }

}
