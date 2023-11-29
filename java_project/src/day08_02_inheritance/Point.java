package day08_02_inheritance;

public class Point {
	protected int x, y; 
	//상속받은 자손은 사용을 가능하게 하기 위해서 protected로 선언 
	
	public Point() {
		x = 100;
		y = 100;
		System.out.println("Point default constructor call");
		// print는 알림을 위해 만듬
	}
	
	
	public Point(int x) {
		this.x = x;
		System.out.println("Point 1 constructor call");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 2 constructor call");
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void display() {
		System.out.printf("x: %d, y: %d\n", x, y);
	}
}
