package day02_01_operater;

public class Mainentry {
	// 최단산쉬관논삼대콤
//	public static void main(String[] args) {
//		//단항연산자 : 증감 ==> ++, --, ~, ....
//	
//		int x = 10, y;
//		int a = 10, b;
//		
//		y = x++; //후위연산 : 대입 먼저, 연산 나중
//		System.out.println("X = " + x + ", Y = " + y);
//
//		b = ++a; //전위연산: 연산 먼저, 대입 나중
//		System.out.println("A = " + a + ", B = " + b);
//	}
	
//	public static void main(String[] args) {
//		//비트연산자
//	
//		int x = 10;
//		int y = ~x; //비트부정 -(원래값+1) => 결과 
//	
//		System.out.println("X = " + x + ", Y = " + y);	
//	}
	
//	public static void main(String[] args) {
//		//산술연산자: +, -, *, /, %
//	
//		int x = 10, y = 3;
//		double a = 10, b = 3; 
//		
//		// 정수 연산(+, -, *, /, %)의 결과는 정수이다.
//		System.out.println("x * y = " + x*y);
//		System.out.println("x / y = " + x/y); // 2, 몫
//		System.out.println("x % y = " + x%y); // 1, 나머지
//		
//		// 실수연산 
//		System.out.println("a * b = " + a*b); // 30.0
//		System.out.println("a / b = " + a/b); // 3.33333..., 몫
//		System.out.println("a % b = " + a%b); // 1.0, 나머지
//	}
	
//	public static void main(String[] args) {
//		//Shift 연산지: <<, >>
//		
//		int x = 8, result;
//	
//		result = x << 2; //left shift  원래값 * 2^n
//		System.out.println(result); 
//		
//		result = x >> 3; //right shift  원래값 / 2^n
//		System.out.println(result); 
//	}

//	public static void main(String[] args) {
//		//관계연산자: >, <, >=, <=, ==, !=
//		
//		int x = 3, y = 5;
//		boolean flag = true;
//	
//		System.out.println(!flag); // !는 부정연산자
//		
//		if(x > y) {
//			System.out.println("max : " + x);
//		}
//		else {
//			System.out.println("max : " + y);
//		}
//	}
	
//	public static void main(String[] args) {
//		//논리연산자: &, |, ^     
//		//2진 논리 => 결과를 값으로 돌려준다.
//	
//		int x = 4, y = 7;
//		
//		System.out.println(x&y);
//		System.out.println(x|y);		
//		System.out.println(x^y); 
//	}
	
	
//	public static void main(String[] args) {
//		//논리연산자: &&, ||, !     
//		//10진 논리 => 결과를 값으로 돌려준다.
//	
//		int x = 10, y = 20, z = 30;
//		boolean result = true;
//		
//		result = (x>y) && (y>z); // &&연산은 앞의 것이 '거짓'이면 뒤는 수행 X
//		result = (x<y) || (y<z); // ||연산은 앞의 것이 '참'이면 뒤는 수행 X
//		result = !result;
//	}
	
//	public static void main(String[] args) {
//		//삼항연산자   (조건)? 참 : 거짓 ;
//	
//		int x = 20, y = 10;
//		int a = 10, b = 20, c = 30;
//		String msg = null;
//		int result = 0;
//		
//		msg = ( x != y ) ? ("not same") : ("same");
//		System.out.println(msg);
//		
//		result = (a>b) ? (a) : (b>c) ? (b) : (c);
//		System.out.println(result);
//	}
	
	public static void main(String[] args) {
		//대입연산자 =, +=, -=, *=, /=, %=, >>=, <<=, ...
		
		int x = 3, y = 5, result;
		int a = 3, b = 5;
		
		result = x + y;
		x = x + y;
		a += b;
		
		System.out.println("x = "+ x  + "y = " + y);
		System.out.println("a = "+ x  + "b = " + y);
	}
}


