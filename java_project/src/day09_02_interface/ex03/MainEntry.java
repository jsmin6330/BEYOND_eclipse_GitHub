package day09_02_interface.ex03;

import day09_01_abstract.ex02.Shape;
import day09_02_interface.ex01.IDraw;

public class MainEntry {
	public static void main(String[] args) {
		Multiclass mc = new Multiclass();
		mc.draw();
		mc.show("광개토대왕");
		mc.tshow("광개토대왕");
		
		IDraw i = new Multiclass();
		i.draw();
		System.out.println(i.su);
		
		Shape s = new Multiclass();
		s.calc(3.3);
		s.show("쇼이름");
	}
}
