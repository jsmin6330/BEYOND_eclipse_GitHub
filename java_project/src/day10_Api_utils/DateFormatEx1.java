package day10_Api_utils;
import java.util.Date;
import java.text.SimpleDateFormat;

class DateFormatEx1{
	public static void main(String[] args) {
		Date today = new Date();
		
		System.out.println(today);  //
		
		SimpleDateFormat sdf1, sdf4;
		
//		sdf1 = new SimpleDateFormat("yy-MM-dd"); //연도는 무조건 소문자 Y, 월은 무조건 대문자 M 2자리, 일은 무조건 소문자 d 2자리
		sdf1 = new SimpleDateFormat("yy년 MM월 dd일");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a EEE");
		// EEEE는 요일을 나타내는데, 개수에 따라 표현이 다르다
		// E : 금, EE : 금, EEE : 금, EEEEE : 금요일
		System.out.println(sdf1.format(today));	// format(Date d)
		System.out.println(sdf4.format(today));
	}
}