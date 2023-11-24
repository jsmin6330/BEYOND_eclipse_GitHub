package day05_01_array1;

public class MainEntry {
	public static void main(String[] args) {
		char[] ch; //배열 선언
		ch = new char[4]; //배열 생성, 메모리에 할당
		
		char[] ch2 = new char[4]; //배열 선언 및 생성
		
		//배열 초기화
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//출력
		System.out.println(ch[0]); //J
		System.out.println(ch[1]); //A
		
		//출력2
		for(int i = 0; i<4; i++) {
			System.out.printf("ch[%d] = %s\n", i, ch[i]);
		}
		
		System.out.println("===========================");
		
		
		char[] ch3 = {'J', 'A', 'V', 'A'}; //배열 선언 및 생성 및 초기화
		System.out.printf("배열의 길이: %d\n", ch3.length); 
		//배열의 길이를 구하는 함수 사용
		
		for(int i = 0; i<ch3.length; i++) {
			System.out.printf("ch3[%d] = %s\n", i, ch3[i]);
		}
		
		System.out.println("===========================");
		String[] str = {"a", "bc", "zzz", "yyy"};
		for(int i = 0; i<str.length; i++) {
			System.out.printf("ch3[%d] = %s\n", i, str[i]);
		}
		
		//배열 크기를 나중에 정하고 싶을 때,
		int num = 3;
		char[] ch4 = new char[num]; //크기 없이 생성은 안되니 임의로 생성이라도 한다.
		
		char[] ch5 = new char[]{}; //배열 초기화방법 번외
	}
}
