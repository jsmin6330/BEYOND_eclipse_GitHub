package day07_quiz;

public class MainEntry {
	public static void main(String[] args) {
		TV t = new TV();
		t.setColor("핑크");
		t.setChannel(11);
		t.display();
		
		TV tv1 = new TV(7);
		tv1.display();
		
		TV tv2 = new TV("아쿠아", 15);
		tv2.display();
		
	}
}
