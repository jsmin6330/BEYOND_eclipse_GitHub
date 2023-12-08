package day15_03_innerClass;


class OuterClass{
	static int no;
	String message = "hello~~~";
	
	public void outerMethod() { //외부 클래스
		System.out.println("outer method call~");
	}
	
	class InnerCalss{ //내부클래스
		int su = 99;
		
		public void show() {
			System.out.println(su); //내부(자신의 것) 사용 가능
			System.out.println(message); //외부 클래스 멤버 사용 가능
	
		}
		
		public void disp() {
			outerMethod(); //외부 클래스 메소드 호출
		}
	} //inner class end
}//outerClass end

public class MainEntry {
	public static void main(String[] args) {
		
	}
}
