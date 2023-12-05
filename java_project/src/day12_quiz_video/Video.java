package day12_quiz_video;

public class Video {
	protected String title;
	protected String category;
	protected boolean lend; //대여여부
	protected String lendName;//대여자
	protected String lendDate; //대여일자
	
	public Video() {
		
	}
	
	public Video(String title, String category) {
		this.title = title;
		this.category = category;
		this.lend = false;
		this.lendName = null;
		this.lendDate =  null;
	}

	public void Video_lend(boolean lend, String lendName, String lendDate) {
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}
	
	@Override
	public String toString() {
		return "Video [title=" + title + ", category=" + category + ", lend=" + lend + ", lendName=" + lendName
				+ ", lendDate=" + lendDate + "]";
	}

	public void display() {
		System.out.println("Video 제목    : " + title);
		System.out.println("장르   : " + category);
		System.out.println("대여여부 : " + lend);
		System.out.println("대여자 : " + lendName);
		System.out.println("대여일자 : " + lendDate);
	}
}
