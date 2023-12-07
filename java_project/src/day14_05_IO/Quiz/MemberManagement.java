package day14_05_IO.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManagement extends Member{
	ArrayList<Member> m_list = new ArrayList(); 
	
	
	public void Member_add() {
		Member m = new Member();
		m.input();
		m_list.add(m);
	}
	
	public void Member_del() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 회원의 이름은?: ");
		String name = sc.next();
		
		for(int i = 0; i<m_list.size(); i++) {
			if(m_list.get(i).getName().equals(name)) {
				m_list.remove(i);
			}
		}
	}
	
	public void Member_modify() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 회원의 이름은?: ");
		String name = sc.next();
		
		
		for(int i = 0; i<m_list.size(); i++) {
			if(m_list.get(i).getName().equals(name)) {
				m_list.remove(i);
			}
		}
		
		System.out.print("수정할 회원의 정보는?: ");
		
		int option = 0;
		do {
			System.out.println("1. 키 정보 수정");
			System.out.println("2. 몸무게 정보 수정");
			System.out.print("선택할 옵션: ");
			option = sc.nextInt();
			
			int input;
			switch(option){
			case 1:
				System.out.print("키 입력: ");
				input = sc.nextInt();
				m.setHeight(input);
				m.BMI_Official();
				break;
			case 2:
				System.out.print("몸무게 입력: ");
				input = sc.nextInt();
				m.setWeight(input);
				m.BMI_Official();
				break;
			default:
				System.out.println("잘못된 번호입니다.");
			}
		}while(option !=1 || option != 2);
		
		
		m_list.set(x, m);
	}
	

	public void Member_display() {
		System.out.println(m_list);
	}
}
