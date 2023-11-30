package day09_01_abstract.ex02;

public class Rectangle extends Shape {

	@Override
	public double calc(double x) {
		result = x * x;
		return result;
	}

	@Override
	public void show(String name) {
		calc(10);
		System.out.printf("넓이가 %.2f인 %s이 그려졌습니다.\n", result, name);
	}
}
