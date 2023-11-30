package day09_01_abstract.ex02;

public class Circle extends Shape {

	@Override
	public double calc(double x) {
		result = x * x * Math.PI;
		return result;
	}

	@Override
	public void show(String name) {
		calc(5.5);
		System.out.printf("넓이가 %.2f %s인 그려졌습니다.\n", result, name);
	}
}
