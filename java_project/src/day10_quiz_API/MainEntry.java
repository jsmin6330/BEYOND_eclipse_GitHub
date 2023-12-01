package day10_quiz_API;

public class MainEntry {
	public static void main(String[] args) {
		String str = "abcDEFGHijklmnop";
		//위의 str문자열을 대문자는 소문자로, 소문자는 대문자로 출력하기
		
//		System.out.println(str.substring(0, 3).toUpperCase()+str.substring(3, 8).toLowerCase()+str.substring(8).toUpperCase());
		
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i)<97) {
				System.out.print((char)((int)(str.charAt(i))+32));
			}
			else {
				System.out.print((char)((int)(str.charAt(i))-32));
			}
		}
	}
}
