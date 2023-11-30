package day09_02_interface.ex03;
import day09_01_abstract.ex02.Shape;
import day09_02_interface.ex01.IDraw;

public class Multiclass 
					extends Shape implements IDraw, Test {
	
	String irum = "이순신";
	

	@Override
	public void tshow(String name) {
		System.out.println("Test interfave method");
	}

	@Override
	public void draw() {
		System.out.println("Idraw interfave method");
	}

	@Override
	public double calc(double x) {
		System.out.println("Shape abstract class");
		return 0;
	}

	@Override
	public void show(String name) {
		System.out.println("Shape abstract class");
	}

}
