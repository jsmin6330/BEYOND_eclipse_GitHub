package day12_01_colloction.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
	
	static HashMap phoneBook = new HashMap();
	
	
	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-9872-0201");
		addPhoneNo("친구", "김자바", "010-9872-0202");
		addPhoneNo("친구", "정자바", "010-9872-0203");
		addPhoneNo("친구", "안자바", "010-9872-0204");
		addPhoneNo("회사", "강대리", "010-1111-0001");
		addPhoneNo("회사", "박대리", "010-1111-0002");
		addPhoneNo("회사", "최과장", "010-1111-0003");
		addPhoneNo("우성세탁", "010-8282-8282");
		
		printAll();
	}//end main

	//그룹을 추가하는 메소드
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	
	//그룹에 전화번호를 추가하는 메소드
	public static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);  //이름은 중복될 수 있으니, 전화번호를 key값으로 가져감 
				
	}
	
	public static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}
	
	
	//전화번호부 전체를 출력하는 메소드
	static void printAll() {
		Set set = phoneBook.entrySet();
//		System.out.println(set);
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");
			
			while(subIt.hasNext()) {
				Map.Entry subE =  (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	}
}
