//package day02_02_control;
//import java.util.Scanner;
//
//public class Mainentry {
//	public static void main(String[] args) {
//		System.out.print("Integer data : ");
//		int su = new Scanner(System.in).nextInt();
//		
//		//짝홀수 판정
//		if(su%2 == 0) {
//			System.out.println(su + " ==> 짝수");
//		}
//		else {
//			System.out.print(su + " ==> 홀수");
//		}
//	}
//}


//package day02_02_control;
//import java.util.Scanner;
//	
//public class Mainentry {
//	public static void main(String[] args) {  // if와 else를 사용해서 양수음수 판정
//		System.out.print("Integer data : ");
//		int num = new Scanner(System.in).nextInt();
//				
//		if(num>0) {
//			System.out.printf("%d는 양수입니다.", num);
//		}
//		else {
//			if(num == 0) {
//				System.out.printf("%d는 0입니다.", num);
//			}
//			else {
//				System.out.printf("%d는 음수입니다.", num);
//			}
//		}
//	}
//}	

//package day02_02_control;
//import java.util.Scanner;
//
//public class Mainentry {
//	public static void main(String[] args) { //else if도 사용해서 양수음수 판정
//		System.out.print("Integer data : ");
//		int num = new Scanner(System.in).nextInt();
//				
//		if(num>0) {
//			System.out.printf("%d는 양수입니다.", num);
//		}
//		else if(num == 0) {
//				System.out.printf("%d는 0입니다.", num);
//		}
//		else {
//			System.out.printf("%d는 음수입니다.", num);
//		}
//	} 
//}	

package day02_02_control;
import java.util.Scanner;

public class Mainentry {
	public static void main(String[] args) {
		System.out.print("Integer data : ");
		int num = new Scanner(System.in).nextInt();
		
		if(num>0) {
			System.out.printf("%d는 양수입니다.\n", num);
			if(num%2 == 0) {
				System.out.println(num + " ==> 짝수");
			}
			else {
				System.out.print(num + " ==> 홀수");
			}
		}
		else if(num == 0) {
				System.out.printf("%d는 0입니다.", num);
		}
		else {
			System.out.printf("%d는 음수입니다.", num);
		}
	}
}
