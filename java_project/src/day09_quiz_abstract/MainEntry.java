package day09_quiz_abstract;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
//		Travel mv = new Bus();
//		mv.Stop();
//		
//		mv = new Subway();
//		mv.Stop();
			
		//배열을 이용한 형태
		Travel[] tr = new Travel[2]; //
		Object[] name = {new Bus(), new Subway()};
		for(int i = 0; i < name.length; i++) {
			tr[i] = (Travel)name[i]; //name[i]이 object타입이니까 Travel타입으로 형변환
			tr[i].show();
		}
		
//		Scanner sc = new Scanner(System.in);
//		char choice;
//		System.out.printf("탈 것을 선택하세요: "
//				+ "1. 버스"
//				+ "2. 지하철");
//		choice  = sc.next().charAt(0);
//		
			
	}
}
