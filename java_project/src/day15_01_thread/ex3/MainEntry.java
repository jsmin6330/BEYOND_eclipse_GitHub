package day15_01_thread.ex3;

public class MainEntry {
	//우선순위는 숫자가 클 수록 높음
	
	public static void main(String[] args) {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY); //우선순위 설정(최소값0, 최대값10)
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		int priority = Thread.currentThread().getPriority();
		Thread.State state = Thread.currentThread().getState();
		
		System.out.println("현재 스레드 ID: " + id);
		System.out.println("현재 스레드 Name: " + name);
		System.out.println("현재 스레드 Priority: " + priority);
		System.out.println("현재 스레드 State: " + state);	
		
	}
}
