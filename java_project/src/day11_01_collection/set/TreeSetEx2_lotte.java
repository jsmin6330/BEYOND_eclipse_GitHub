package day11_01_collection.set;

import java.util.TreeSet;

public class TreeSetEx2_lotte {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		System.out.println(set);
	}
}
