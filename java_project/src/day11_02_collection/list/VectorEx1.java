package day11_02_collection.list;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("lengthhh    /   capacity");
		System.out.println(v.size() + "          /          " + v.capacity());
		
		
	 	Vector<Integer> v2 = new Vector<Integer>(3,4); //초기용량, 
		v2.add(20);	v2.add(12);	v2.add(20);	v2.add(20);	v2.add(88);
		
		System.out.println(v2.size()+ "         /         " + v2.capacity());
		
		
		System.out.println("--------iterator() method-----------");
		Iterator it = v2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next() + "%t");
		}
		
		System.out.println("--------get() method-----------");
		for(int i = 0; i< v2.size(); i++) {
			System.out.println(v2.get(i) + "\t");
		}
		
		System.out.println("--------elementsAt() method-----------");
		for(int i = 0; i< v2.size(); i++) {
			Integer num = v2.elementAt(i);
			System.out.println(num);
			System.out.println(num.toString() + "\t");
		}
		System.out.println("\n\n + b2" + "v2.ca[acity");
		v2.trimToSize();
		System.out.println();
	}
}