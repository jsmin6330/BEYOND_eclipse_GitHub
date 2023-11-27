package day06_03_method;

public class MainEntry {
	//1. 매개변수 없고, 리턴타입 없는 경우
	public static void line() {//함수 정의
		System.out.println("-------------------------");
	}
	
	//2. 매개변수 있고, 리턴타입 없는 경우
	public static void showName(String name, int age) {
		System.out.printf("당신의 이름은 %s이시군요\n", name);
		System.out.printf("당신의 나이는은 %d살 이시군요\n", age);
	}
	
	
	
	public static void main(String[] args) {
		line(); //함수호출
		showName("김콩콩", 10);
	}
}
