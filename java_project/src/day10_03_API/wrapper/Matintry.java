package day10_03_API.wrapper;

//Wraper class: 기본 자료형에 대응되는 클래스형 자료형
//기본 자료형: 클래스형(래퍼런스 또는 참조형) 자료형
/*		int				Integer
		float			Float
		char			Charater
		double			Double
*/

class Point{  }

public class Matintry {
	public static void main(String[] args) {
		Integer Ia = new Integer(9);
		Integer Ib = new Integer("9");
		String su = "30";
		int x = 10;
		Point pt = new Point();
		
		System.out.println(pt); 
		System.out.println(pt.toString());
		System.out.println(pt.hashCode());
		
		System.out.println(Ia); 
		System.out.println(Ia.hashCode());
		System.out.println(Ia.getClass().getName() + '@' + Integer.toHexString(Ia.hashCode()));
		
		
		//Boxing  vs  UnBoxing
		int y = 5;
		double d = 3.3;
//		d = y; 묵시적 형변환
//		y = (int)d; //명시적 형변환
		//------- 스택영역 ▲

		int c = Ia.intValue(); //jdk 4.x 이전까지는 
		//기본 자료형을 래퍼런스 형으로 바꿈
		
		int e = Ib; //jdk 5.x이후부터는 autoboxing, unboxing
		int num = Integer.parseInt(su);
		System.out.println(num+100);
		
		System.out.println(Ia.MAX_VALUE);
		System.out.println(Ia.MIN_VALUE);
		
		int f = Integer.parseInt("123");
		int g = Integer.parseInt("1111111",2); //"1111111"은 2진수인데 10진수로 찍어줘~
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10)); 
		System.out.println(Integer.toBinaryString(10)); 
		
		int h = 3; //stack
		Integer i = new Integer(3);
		
	}
}
