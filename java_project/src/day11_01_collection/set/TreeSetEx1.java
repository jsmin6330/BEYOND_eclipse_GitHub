package day11_01_collection.set;

import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet(); // 타입 파라미터 <> 가 있으면 타입 제한, 없으면 타입 제한 없음(5.x에 추가된 기능)	
		int[] score = {85, 95, 35, 45, 65, 40, 100};
		
		for(int i = 0; i<score.length; i++) {
			set.add(score[i]);
			//set.add(new Integer(score[i]));
		}
		
		System.out.println(set);
		
		System.out.println("50보다 작은 값: " + set.headSet(new Integer(50)));
	}
}
