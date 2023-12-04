package day11_01_collection.set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("키보드"); 		hs.add("컵");
		hs.add("마우스");		hs.add("볼펜");
		hs.add("키보드"); 
		
		System.out.println("요소 개수: " + hs.size());
		//중복을 빼고 보여줌
		
		Iterator it = hs.iterator();;
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		HashSet<Integer> hs2 = new HashSet<>();
//		hs2.add("키보드"); 		hs2.add("컵");
//		hs2.add("마우스");		hs2.add("볼펜");
//		hs2.add("키보드"); 
//		
//
//		for(Object item:hs2) {
//			System.out.println(item);
//		}
//		
//		it = hs2.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
	}
}
