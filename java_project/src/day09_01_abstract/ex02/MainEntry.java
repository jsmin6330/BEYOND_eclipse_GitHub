package day09_01_abstract.ex02;

public class MainEntry {
	public static void main(String[] args) {
		//1.각자의 클래스로 객체 생성 형태
		new Circle().show("원");
		new Rectangle().show("정사각형");
		new Triangle().show("정삼각형");
		
		
		//2. Shape 부모 추상 클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("원");
		
		sh = new Rectangle();
		sh.show("정사각형");
		
		sh = new Triangle();
		sh.show("정삼각형");
		
		
		//3. 배열을 이용한 형태
		Shape[] ss = new Shape[3]; //배열을 선언 및 생성, 배열을 선언한거지 객체를 선언한게 아니다<?>
		ss[0] = new Circle();
		ss[1] = new Rectangle();
		ss[2] = new Triangle();
		
		String[] name = {"Circle", "Rectangle", "Triangle"};
		for(int i = 0; i < ss.length; i++) {
			ss[i].show(name[i]);
		}
	}
}
