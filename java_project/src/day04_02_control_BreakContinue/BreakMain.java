//package day04_02_control_BreakContinue;
//
//public class BreakMain {
//	public static void main(String[] args) {
//		for(int i = 1; i < 6; i++) {
//			for(int j = 1; j < 6; j++) {
//				if(j == 3)break;
//				System.out.printf("i = %d, j = %d\n", i, j);
//			}
//		}
//	}
//}

//package day04_02_control_BreakContinue;
//
//public class BreakMain {
//	public static void main(String[] args) {
//		
//		label: //식별자
//		for(int i = 1; i < 6; i++) {
//			for(int j = 1; j < 6; j++) {
//				if(j == 3) break label; //label의 가장 가까운 {}을 빠져나감
//				System.out.printf("i = %d, j = %d\n", i, j);
//			}// j end 
//		}// i end
//	}
//}

package day04_02_control_BreakContinue;
public class BreakMain {
	public static void main(String[] args) {
		
		label: //식별자
		for(int i = 1; i < 6; i++) { 
			for(int j = 1; j < 6; j++) {
				if(j == 3) continue label; //label의 가장 가까운 증감식으로 이동함
				System.out.printf("i = %d, j = %d\n", i, j);
			}// j end 
		}// i end
	}
}
