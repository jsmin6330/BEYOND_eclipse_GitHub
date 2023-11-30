package day09_03_staticmember;



class Atm{
	int count; //instance member
	static int total; //static member
	
	public Atm(int amount) {//constructor
		count += amount;
		total += amount;
	}
	
	public static void view() {
//		count += 100; //static method에서는 일반 멤버 변수는 사용할 수 없다.
		total += 100;
	}
	
	public void show(int count, int total) {
		this.count = count;
//		this.total = total; //static 변수는 this를 사용하지 못한다.
	}
	
	public void display() {
		System.out.printf("count = %d\n total = %d\n", count, total);
	}
}


public class MainEntry {
	public static void main(String[] args) {
		Atm at = new Atm(1000);
		at.display(); // count: 1000, total: 1000
		
		Atm at2 = new Atm(1000);
		at2.display(); // count: 1000, total: 2000
		
		Atm at3 = new Atm(1000);
		at3.display(); // count: 1000, total: 3000
		
		System.out.println(Atm.total);
		System.out.println(at.count);
	}
}
