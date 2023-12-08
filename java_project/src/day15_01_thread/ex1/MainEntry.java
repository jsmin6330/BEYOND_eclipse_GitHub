package day15_01_thread.ex1;

public class MainEntry {
	public static void main(String[] args) {
		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
//		t1.run(); //쓰레드 구현한게 아니다 이건. 명시적으로 쓰면 안되고, 스케쥴표에 의해 나와야한다.
		t1.start(); // run() 유도한다. 스케쥴러(JVM)가 나머지는 일한다.
		t2.start();
		t3.start();
	}
}
