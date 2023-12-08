package day14_05_IO.Quiz;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
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
		Member m ;
		int j = -1;
		
		for(int i = 0; i<m_list.size(); i++) {
			if(m_list.get(i).getName().equals(name)) {
				j = i;
			}
		}//for end
		
		m  =  m_list.get(j);
		System.out.println("수정할 회원의 정보는?");
		
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
		}while(option !=1 && option != 2);
		
		m_list.set(j,m);
	}
	

	public void Member_display() {
		System.out.println(m_list);
	}
	
	public void makeFile() throws Exception{
		String str, file;
//		Date date = new Date();
//		str = "파일 생성 시간 \r\n" + date + "\r\n" ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("파일 이름 입력 요망: ");
		file = br.readLine();
		file = file.concat(".txt");
		
		OutputStream os = new FileOutputStream(file);
		
		Iterator it = m_list.iterator();
		
		while (it.hasNext()) {
			os.write(it.next().toString().getBytes());  // 파일
			os.write(new String("\r\n").getBytes());
		}
		os.close();
		System.out.println("프로그램을 종료합니다.");
	}
}
