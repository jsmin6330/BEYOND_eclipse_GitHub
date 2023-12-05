package day12_01_colloction.map;

import java.util.HashMap;
import java.util.Scanner;

//key, value 한 쌍으로 처리
public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("encore", "1234");
		map.put("kosa", "1111");
		map.put("kingsmile", "1234"); //key값 중복으로 안들어감
		map.put("kingsmile", "1004");
		
		System.out.println(map);
		System.out.println("요소개수: " + map.size());
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id: ");
			String id = sc.nextLine().trim();
			System.out.print("password: ");
			String pwd = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 ID는 존재하지 않습니다.");
				continue;
			}else {
				if(!(map.get(id).equals(pwd))) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
				}else {
					//System.out.println("id와 password가 일치합니다.");
					System.out.println(id + "님 반갑습니다.");
					break;
				}
			}
		}
	}
}
