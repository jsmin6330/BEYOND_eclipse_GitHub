package day06_05_method_overload;

//overload(중복 함수): 다형성의 대표
public class MainEntry {
	
	public static int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
//	public static int plus(int x, int y, int z) {
//		int result = x + y + z;
//		return result;
//	}
	
	public static double plus(int x, int y, int z) { //함수 원형 타입 - double
		return x + y + z; //return int지만, 함수 원형 타입이 double이므로 double로 return이 된다.
	}
	
	public static void line() {
		System.out.println("-------------------------");
	}
	
	public static void line(String str) {
		for(int i = 1; i<11; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public static void line(String str, int n) {
		for(int i = 1; i<n+1; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		line();
		line("*");
		line("*", 100);
	}
}
