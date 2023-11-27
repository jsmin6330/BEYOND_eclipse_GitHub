package day06_04_method_return;

public class MainEntry {
	
	//3. 매개변수 없고, 리턴타입 있는 경우
	public static String show() { 
		String str = "Hello";
		return str;
	}
	
	
	//4. 매개변수 있고, 리턴타입 있는 경우
	

	
	public static void main(String[] args) {
		String msg = show();
		System.out.println(msg);
		System.out.println(show());
	}
}
