package day15_01_thread.ex2;

public class UserRunnable implements Runnable {
	String name;
	
	public UserRunnable(String name) {
		this.name = name;
	}


	@Override
	public void run() {
//		System.out.println("Runnable run() call~~~~");
		

		for(int i = 1; i<11; i++) {
			
			if(i==4) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name);
			System.out.println(i);
		}//end for
	}
}
