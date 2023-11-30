package day09_02_interface.ex01;

public class BB implements IDraw {

	@Override
	public void draw() {
		System.out.println("BB클래스에서 인터페이스 IDraw의 메소드를 오버라이드 함");
	}
	
	public void show() {
		System.out.println(su);
	}
}
