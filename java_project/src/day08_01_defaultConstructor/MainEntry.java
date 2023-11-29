package day08_01_defaultConstructor;

public class MainEntry {
	/**
	 * @param args 메인은 아무값도 넘겨 받지 않는다.
	 * @author doyeon
	 * @param x 곱을 구하는 것에 첫 번째 정수형 변수
	 * @param y 곱을 구하는 것에 두 번째 정수형 변수
	 * @param gob 변수는 x와 y의 두 정수의 곱을 저장 변수
	 */
	
	
	public static void main(String[] args) {
		int x, y, gob = 1;
		char ch = 'A';
		String msg;
		
		x = 5; y = 10;
		msg = "Hello";
		gob = gob(x, y);
		
		System.err.println(ch);
		System.err.println(msg);
		System.err.printf("%d * %d = %d", x, y, gob);
	}
	
	public static int gob(int x, int y) {
		return x*y;
	}
}

