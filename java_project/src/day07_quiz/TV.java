package day07_quiz;

public class TV {
	private String color;
	private int channel;
	
	
	//생성자함수(default constructor)
	//class 명과 동일하다
	//return 타입 없음(void 조차 사용하지 않음)
	//중복정의 가능함(overload가능 - 중복함수)
	//default constructor 갖고 있음(단, 사용자가 생성자 함수 재정의 하면 디폴트 생성자 함수의 기능 상실함
	//멤버변수의 초기화 담당
	

	

	public TV() { //default constructor
		color = "gray";
		channel = 11;
	}
	
	public TV(String color) {
		this.color = color;
	}
	
	public TV(int channel) {
		this.channel = channel;
	}
	
	public TV(String color, int channel) {
		this.color = color;
		this.channel = channel;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void display() {
		System.out.printf("선택한 TV색상은 %s색이고, 시청하실 채널은 %d번 입니다.\n", color, channel);
	}
}
