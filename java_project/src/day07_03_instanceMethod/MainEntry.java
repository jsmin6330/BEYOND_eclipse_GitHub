package day07_03_instanceMethod;


//instance Method: 객체 생성하고 사용해야함(메모리상에 할당이 되어야...)
//instance Method는 static를 붙이면 안된다.

class B{
	int x, y;
	
	public void setData(int xx, int yy) {
		System.out.println(xx + "," + yy);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		B b = new B(); //객체 생성, 메모리에 할당, 생성자함수 자동호출
		b.setData(100, 200);
	}
}
