//package day04_01_control_while;
//
//public class MainEntry {
//	public static void main(String[] args) {
//		int i = 1;
//		System.out.println("for ---");
//		for(i = 1; i < 4 ; i++) {
//			System.out.printf("%d\t",i);
//		}
//		System.out.println();
//		
//		System.out.println("while ---");
//		
//		i = 1;
//		while(i<=3) {
//			System.out.printf("%d\t",i);
//			i++;
//		}
//		System.out.println();
//		
//		System.out.println("Do while ---");
//		i = 1;
//		do{
//			System.out.printf("%d\t",i);
//			i++;
//		}while(i<=3);	
//	}	
//}

package day04_01_control_while;

public class MainEntry {
	public static void main(String[] args) {
		int a = 1, b = 1;
		
		while(a <= 2) {
			b = 1; //안쪽 변수의 초기화
			while( b <= 3 ) {
				System.out.print(b + "\t");
				b++;
			}
			System.out.println();
			a++;
		}
	}	
}

