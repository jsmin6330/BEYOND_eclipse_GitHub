package day10_02_API.object;


class Rectangle{
	int x, y;
	public void display() {
		System.out.println(x + ", " + y);
	}
	
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}
	
//	public String toString() { //오버라이드
//		String str = x + ", " + y;
//		return str;
//	}
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.display();
		System.out.println(r); //내부적으로 r.toString()을 가지고 있다.
	}
}
