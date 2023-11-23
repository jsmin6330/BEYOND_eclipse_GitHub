package day04_02_control_BreakContinue;

public class MainEntry {
	public static void main(String[] args) {
		for(int i = 1; i<11; i++) {
			if(i  == 7) {
				break; //탈출
			}
			System.out.println(i);
		}
		
		for(int i = 1; i<11; i++) {
			if(i == 7) {
				continue; //for문에서 continue를 만나면 증감식으로 이동
				//while문에서 continue를 만나면 조건식으로 이동
			}
			System.out.println(i);
		}
		
		for(int i = 1; i<11; i++) {
			if(i % 2 != 0) {
				continue; //활용해서 짝수만 출력
			}
			System.out.println(i);
		}
	}
}
