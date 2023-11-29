package day08_02_inheritance;

public class MainEntry {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.display();
		
		Circle c1 = new Circle(10);
		c1.display();
		
		Circle c3 = new Circle(10, 10, 5);
		c3.display();
		
		Rectangle rc = new Rectangle();
		rc.dislpay();
		
		Rectangle rc2 = new Rectangle(1000, 1000);
		rc2.dislpay();
	}
}
