package day06_06_method_arguementVariable;

public class MainEntry {
	// 가변길이 함수
	public static void plus(int...x) {
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	
	
//	public static int plus(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
//	public static int plus(int x, int y, int z) {
//		int result = x + y + z;
//		return result;
//	}
	
	
	public static void main(String[] args) {
		plus(1, 2);
		plus(1, 2, 3);
		plus(1, 2, 3, 4);
		plus(1, 2, 3, 4, 5);
	}
}
