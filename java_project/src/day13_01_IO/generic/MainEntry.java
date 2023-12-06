package day13_01_IO.generic;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = {"abc", "kbs", "dictor"};
		t1.set(str);
		t1.print();
		System.out.println("=========================");
		
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = {1,2,3,4,5,6,7,8,9};
		t2.set(num);
		t2.print();
		System.out.println("=========================");
		
		GenericEx<Double> t3 = new GenericEx<Double>();
		Double[] d_num = {1.1, 2.1, 3.1, 4.1, 5.1};
		t3.set(d_num);
		t3.print();
		System.out.println("=========================");
		
		GenericEx<Object> t4 = new GenericEx<Object>();
		Object[] obj = {1, 1.2, "아이유"};
		t4.set(obj);
		t4.print();
	}
}
