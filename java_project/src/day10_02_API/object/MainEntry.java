package day10_02_API.object;

class Point{	}


public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name: " + pt.getClass());
		System.out.println("class name: " + pt.hashCode());
		System.out.println("class name: " + pt.toString());
		System.out.println("class name: " + pt);
		
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name: " + pt2.getClass());
		System.out.println("class name: " + pt2.hashCode());
		System.out.println("class name: " + pt2.toString());
		System.out.println("class name: " + pt2);
		System.out.println("toString()의 의미 - day10_API.object.Point@73a28541");
		System.out.println(pt.getClass().getName() + '@' + Integer.toHexString(pt2.hashCode()));
		
		Point pt3 = new Point();
		if(pt.hashCode() == pt3.hashCode()) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		Point pt4 = new Point();
		pt4 = pt;
		if(pt.hashCode() == pt4.hashCode()) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		System.out.println(pt.hashCode() + "," + pt4.hashCode());
		
	}
}
