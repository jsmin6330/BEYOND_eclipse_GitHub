package day11_01_collection.set;

import java.util.TreeSet;

public class TreeSetEx3 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from = "a";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bee");
		set.add("bat");
		set.add("Car");
		set.add("cheeze");
		set.add("daring");
		set.add("elephant");
		set.add("elevateo");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from " + from + " to " + to);
		System.out.println("result : " +  set.subSet(from, to)); //앞에 포함, 뒤에 미포함
		System.out.println("result : " +  set.subSet(from, to + "zzz")); //앞에 포함, 뒤에 포함
	}
}
