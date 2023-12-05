package day12_01_colloction.map;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("zz", 9999);
		tm.put("bb", 1000);
		tm.put("aa", 1000);
		tm.put("dd", 2222);
		
		System.out.println("name : " + tm.get("aa"));
		System.out.println(tm); //자동정렬된다.(key 값이)
		
		TreeSet set = new TreeSet();
		for(int i = 0; i<=set.size(); i++) {
			int num = (int)((Math.random()*50)+1);
			set.add(num);
		}
		
		List list = new LinkedList(set);
		System.out.println(set);
	}
}
