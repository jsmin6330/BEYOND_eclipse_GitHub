package day08_02_inheritance;

public class Circle extends Point{
	private int r;
	
	public Circle() {
		r = 5;
		System.out.println("Circle default constructor call");
	}
	
	public Circle(int r) {
		this.r = r;
		System.out.println("Circle 1 constructor call");
	}
	
	public Circle(int x, int y, int r) {
		this.r = r;
		System.out.println("Circle 3 constructor call");
	}
	
	public void display() {
		System.out.printf("반지름 %d인 원\n", r);
	}
}
