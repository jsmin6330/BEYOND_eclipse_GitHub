package day12_quiz_video;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VideoLend extends Video{
	
	static HashMap map = new HashMap();
	
	public VideoLend() {
		
	}
	
//	public VideoLend(String title, String category) {
//		super(title, category);
//		// TODO Auto-generated constructor stub
//	}
	
	//추가
	public void video_add() {
		Scanner sc = new Scanner(System.in);
		System.out.print("고유 번호: ");
		int k_num = sc.nextInt();
		System.out.print("비디오 이름: ");
		title = sc.next();
		System.out.print("비디오 카테고리: ");
		category = sc.next();
		
		Video v = new Video(title, category);
		map.put(k_num, v);
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
	
	public void video_lend() {
		Scanner sc = new Scanner(System.in);
		System.out.print("대여할 비디오 번호: ");
		int n = sc.nextInt();
		
		Video v = (Video) map.get(n);
		System.out.print("대여자: ");
		String lendName = sc.next();
		System.out.print("대여일자: ");
		String lendDate = sc.next();
		v.Video_lend(true, lendName, lendDate);
		map.replace(n, v);
	}
	
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
