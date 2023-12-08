package day15_01_thread.ex1;

public class UserThread extends Thread{

	String name;
	public UserThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() { //스레드 실행부(구현부)
		
		for(int i = 0; i<10; i++) {
			
			if(i==7) {
				try {
					sleep(5000);
				}catch(InterruptedException e) {
					e.printStackTrace();
					
				}
				System.out.println(name);
			}
			System.out.println(i);
		}
	}
}
