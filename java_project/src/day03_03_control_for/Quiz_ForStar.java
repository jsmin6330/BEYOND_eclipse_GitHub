package day03_03_control_for;

public class Quiz_ForStar {
	public static void main(String[] args) {
		//정사각형
//		for(int i = 0; i <=5; i++) {
//			for(int j = 0; j<=5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}			
		
//		System.out.println("1.");
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j ++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
			
//		System.out.println("2.");
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 5; j >= i; j --) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		System.out.println("3.");
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 4; j >= i; j--) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j ++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		System.out.println("4.");
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 0; j < i-1 ; j ++) {
//				System.out.print(" ");
//			}
//			for(int j = 5; j >= i; j --) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		System.out.println("5");
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 4-i; j >= 0; j --) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= (i*2)-1; j ++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		
//		System.out.println("6.");
//		for(int i = 0; i < 5; i++) {
//			for(int j = 1; j <= i ; j ++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < 9-(i*2); j ++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
	
//		System.out.println("7");
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 4-i; j >= 0; j --) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= (i*2)-1; j ++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i = 1; i < 5; i++) {
//			for(int j = 1; j <= i ; j ++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < 9-(i*2); j ++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		System.out.println("8");
		for(int i = 1; i <= 5; i++) {
			for(int j = 4-i; j >= 0; j --) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i*2)-1; j ++) {
				if(j==1 || j==((i*2)-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}			
			}
			System.out.println("");
		}
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j <= i ; j ++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 9-(i*2); j ++) {
				if(j == 0 || j == (9-(i*2)-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
