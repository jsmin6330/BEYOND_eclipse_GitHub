package day07_05_oop01;

class Point{
//	int x, y; // 멤버 변수
	private int x, y; // int 0, double/float 0.0, String null로 초기화 된다.
	
	//멤버 함수
	public void setX(int xx) {x = xx;}
	public int getX() {return x;}
	public void setY(int yy) {y = yy;}
	public int getY() {return y;}
	public void display() {
	System.out.println(x + " " + y);
	}
}//Point end


class Circle{
	private int x, y, r;
	
	public void setX(int xx) {x = xx;}
	public int getX() {return x;}
	public void setY(int yy) {y = yy;}
	public int getY() {return y;}
	public void setR(int rr) {r = rr;}
	public int getR() {return r;}
	public void output() {
		System.out.printf("[%d, %d]좌표에 반지름 %d인 원을 그림", x, y, r);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point(); //객체생성, 메모리에 할당, 생성자함수 자동호출 
//		pt.x = 3; //class 외부에서 직접 건드는 것은 가능하지만
//		pt.y = 5; //이렇게 사용하면 반쪽짜리 객체 지향이다.
//		System.out.println(pt.x + " " + pt.y);

		pt.setX(3); 
		pt.setY(5); 
		System.out.println(pt.getX() + " " + pt.getY());
		pt.display(); //위 출력 업그레이드판
		

		Circle cr = new Circle();
		cr.setX(5);
		cr.setY(5);
		cr.setR(2);
		cr.output();
	}
}
