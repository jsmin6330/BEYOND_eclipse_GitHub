package day12_quiz_video;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VideoLend extends Video{
	
	static HashMap map = new HashMap();
	protected static int num_code = 1; 
	//번호가 자동으로 늘어나길 원해서 코드 추가
	
	public VideoLend() {
		
	}
	
//	public VideoLend(String title, String category) {
//		super(title, category);
//		// TODO Auto-generated constructor stub
//	}
	
	//추가
	public void video_add() {
		Scanner sc = new Scanner(System.in);
//		System.out.print("고유 번호: ");
//		번호를 자동으로 발급 받고 싶어서 코드 수정
//		int k_num = sc.nextInt();
		System.out.print("비디오 이름: ");
		title = sc.next();
		System.out.print("비디오 카테고리: ");
		category = sc.next();
		
		Video v = new Video(title, category);
		map.put(num_code++, v);
	}
	
	//삭제
	public void video_delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 비디오 번호: ");
		int n = sc.nextInt();
		map.remove(n);
	}
	

	//리스트출력
	public void video_display() {
		System.out.println("저장된 비디오 수 : " + map.size());
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("고유번호: " + e.getKey() + ", Video정보: " + e.getValue());
		}
	}
	
	
	//수정
	//비디오가 없으면 수정이 안뜨도록 추가 필요
	public void video_change() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 비디오 번호: ");
		int n = sc.nextInt();
		
		System.out.print("비디오 이름: ");
		title = sc.next();
		System.out.print("비디오 카테고리: ");
		category = sc.next();
		
		Video v = new Video(title, category);
		map.replace(n, v);
		
	}
	
	
	//이미 대여한 비디오는 대여 못하도록 하는거 추가 필요.
	//대여할 비디오가 없으면 진행 안되도록 하는 것 추가 필요
	public void video_lend() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("대여할 비디오 번호: ");
		int n = sc.nextInt();
		
		Video v = (Video) map.get(n);
		System.out.print("대여자: ");
		String lendName = sc.next();
//		System.out.print("대여일자: ");
//		String lendDate = sc.next();
		
		//날짜를 랜덤으로 넣고 싶다.(영진님 코드 참조)
		//현재 날짜 구하기
		LocalDate now = LocalDate.now();
		// 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        // 포맷 적용
        String formatedNow = now.format(formatter);
		
		
		v.Video_lend(true, lendName, formatedNow);
		map.replace(n, v);
	}
	
	//대여하지 않은 비디오 반납 불가 필요
	//대여한 비디오가 없거나, 비디오가 없으면 진행이 안되도록 추가 필요
	public void video_return() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("반납할 비디오 번호: ");
		int n = sc.nextInt();
		
		Video v = (Video) map.get(n);
		v.Video_lend(false, null, null);
		map.replace(n, v);
	}
	
	//프로그램 종료 
}
