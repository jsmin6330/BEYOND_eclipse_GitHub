package day07_05_oop02;

public class Circle {
	private int x, y, r;
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	public int getR() {
		return r;
	}


	public void setR(int r) {
		this.r = r;
	}


	public void display() {
		System.out.printf("[%d, %d]좌표에 반지름 %d인 원을 그림", x, y, r);
	}
}
