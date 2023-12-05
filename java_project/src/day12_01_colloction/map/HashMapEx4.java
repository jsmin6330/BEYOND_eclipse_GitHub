package day12_01_colloction.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx4 {
	public static void main(String[] args) {
		String[] data = {"A", "K", "a", "D","K","a","K","K","K","Z","D"};
		
		
		HashMap map = new HashMap(); //<TypeParameter>을 쓸 경우에는 wrapper class type만 들어간다.
		
		for(int i = 0; i<data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1));
			}else {
				map.put(data[i], new Integer(1));
			}//if end
		}//for end
		
		Iterator it = map.entrySet().iterator();
//		System.out.println(it);
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			int value = ((Integer)e.getValue()).intValue();
			System.out.println(e.getKey() + " : " + printBar('#', value) + " " + value);
		}
		
	}//end main

	public static Object printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i = 0; i< bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar); //String(char[] chArr) 가넝!!
	}
}
