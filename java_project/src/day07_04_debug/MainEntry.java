package day07_04_debug;

public class MainEntry {
	public static void main(String[] args) {
		int x = 5, y = 0;
		int i;
		
		for(i = 1;  i<6; i++) {
			y+= x*i;
		}// for end
		
		for(i = 1; i<100; i++) {
			if(i==30)break;
			System.out.println(i);
		}
		
		System.out.printf("%d, %d, %d", x, y, i);
	}
}
