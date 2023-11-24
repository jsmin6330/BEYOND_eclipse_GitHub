package day05_03_random;
import java.util.Scanner;

//문제1] 업/다운 게임 프로그램 작성 (난수 이용)
//1~100 숫자 중에서 임의의 난수 추출해 놓고, 사용자는 5번의 기회를줘서 입력 받는다.
//그 입력 받은 숫자와 추출한 난수가 같은지를 판정하는 프로그램 작성
public class Quiz_updown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = ((int)(Math.random()*100))+1;
		int num;
		
		for(int i = 0; i< 5; i++) {
			System.out.printf("추측한 숫자는 무엇입니까?: ");
			num = sc.nextInt();
			
			if(num == key) {
				System.out.println("정답입니다!!!");
				break;
			}
			else if(num > key) {
				System.out.println("DOWN");
			}
			else {
				System.out.println("UP");
			}
			if(i==4) {
				System.out.println("틀렸습니다. 기회는 더 이상 없습니다.");
				System.out.printf("정답은 %d입니다.", key);
			}
		}
	}
}
