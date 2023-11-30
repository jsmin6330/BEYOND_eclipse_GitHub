package day09_02_interface;


interface A{
	int x = 9; //변수가 기울어진 글씨체: static을 의미
	public void show(); //abstract 생략 
	public abstract void disp();
	public int plus(int x, int y);
} //A end

interface B{
	void bView();
} // B end

interface C{
	String name = "happy"; //final 멤버는 값 변경 불가
	//final 멤버는 반드시 초기값이 있어야 함
	public void draw();
}// C end


interface D extends B{
	void dView();
}

class Rect implements C{

	@Override
	public void draw() {
		System.out.printf("%s님 반갑습니다.", name);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		//A a = new A(); //클래스가 아니기 때문에 객체 생성 불가
		Rect r = new Rect();
		r.draw();
		C rr = new Rect();
		rr.draw();
		System.err.println(rr.name);
	}
}
