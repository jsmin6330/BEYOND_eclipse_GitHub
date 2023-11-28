package day07_05_oop02;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		Circle cr = new Circle();
		
		pt.setX(0);
		pt.setY(0);
		pt.display();
		
		cr.setX(10);
		cr.setY(10);
		cr.setR(5);
		cr.display();
	}
}
