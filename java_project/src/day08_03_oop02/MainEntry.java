package day08_03_oop02;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		
		pt.setX(0);
		pt.setY(0);
		pt.display();
		
		System.out.println(pt);
		System.out.println(pt.hashCode());
		System.out.println(pt.toString());

	}
}

