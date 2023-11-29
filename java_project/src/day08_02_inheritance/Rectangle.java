package day08_02_inheritance;

public class Rectangle extends Point {
	private int x2, y2;
	
	
	public Rectangle() {
		x2 = 0;
		y2 = 0;
		System.out.println("Rectangle default constructor call");
	}

	public Rectangle(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("Rectangle 2 constructor call");
	}


	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
	public void dislpay() {
		System.out.printf("[%d,%d]와 [%d,%d]를 연결하는 선", x, y, x2, y2);
	}
}
