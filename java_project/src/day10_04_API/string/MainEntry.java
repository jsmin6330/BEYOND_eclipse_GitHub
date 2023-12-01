package day10_04_API.string;


class Point{  }

public class MainEntry {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println("str: "+ str);
		char ch = str.charAt(0);
		System.out.println(ch);
		System.out.println(str.charAt(2));
		
		char data[] = {'a','b', 'c'};
		str = new String(data);
		System.out.println("str: "+ str);
		
		String msg = "abcqwerasdqweasdzxc";
		System.out.println("en-core "+ msg);
		System.out.println(msg);
		
		String str2 = "abcd".substring(2); //중간 값을 출력
		System.out.println(str2);
		
		str2 = "abcdefghijklmnop".substring(2,5);//시작값 포함, 끝값 미포함
		System.out.println(str2);
		
		System.out.println(msg + ":" + str2);
		
//----------------------------------------------------------------------------------------
		Point p1 = new Point();
		Point p2 = new Point();
		System.out.println(p1.hashCode()+ ", "+ p2.hashCode()); //다름
		
		String s1 = new String("encore");
		String s2 = new String("encore");
		System.out.println(s1.hashCode()+ ", "+ s2.hashCode()); //같음
		// String 객체는 문자가 같으면 같은 주소를 가진다.
		
		String s3 = "seoul";
		String s4 = "seoul";
		System.out.println(s3.hashCode()+ ", "+ s4.hashCode()); //값이 바뀌면서 주소가 바뀜
		
		if(s3 == s4) System.out.println("same"); // == 은 스택 영역의 값을 물어본다.
		else System.out.println("not same");
//----------------------------------------------------------------------------------------
		if(s1 == s2) System.out.println("same");
		else System.out.println("not same");
		
		
		s2 = "kosa";
		System.out.println(s1.hashCode()+ ", "+ s2.hashCode()); //값이 바뀌면서 주소가 바뀜
	}
}
