package day08_03_oop02;

public class Point {
	private int x, y;
	public void setX(int xx) {x = xx;}
	public int getX() {return x;}
	
	public void setY(int yy) {y = yy;}
	public int getY() {return y;}
	
	public String toString() {
		return x + ", " + y;
	}
	
	public void display() {
		System.out.println(x+ " "+ y);
	}
}
