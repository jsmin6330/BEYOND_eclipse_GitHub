package day09_01_abstract.ex01;


abstract class Shape{	//추상클래스, super class
	double  result = 0;
	public abstract double calc(); //abstract 메소드
	public abstract void draw();
	public void show() { //블럭이 있으면 일반 메소드
		System.out.println("Super class Shape");
	}
}//Shape end

class Circle extends Shape{ //Sub class
	double r = 5.0;

	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.printf("원의 넓이: %.2f인 원을 그렸습니다.\n", result);
	}
} // Circle end

	
class Triangle extends Shape{
	int w = 3, h = 5;
	
	@Override
	public double calc() {
		result = w * h * 0.5;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.printf("삼각형의 넓이: %.2f인 삼각형을 그렸습니다.\n", result);
	}
}

class Rectangle extends Shape{
	int w = 3, h = 5;
	
	@Override
	public double calc() {
		result = w * h;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.printf("직사각형의 넓이: %.2f인 직사각형을 그렸습니다.\n", result);
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
//		Shape sh = new Shape(); //shape는 자체적으로 객체를 생성할 수 없다.
		Circle c = new Circle();
		c.draw();
		new Triangle().draw();
		new Rectangle().draw();
		
		Shape sh = new Circle(); //상속받은 자손 클래스로는 객체를 생성할 수 있다.
		sh.draw();
		sh = new Triangle();
		sh.draw();
	}
}
