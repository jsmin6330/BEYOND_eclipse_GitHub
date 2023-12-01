package day10_01_Enum;


enum Day{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
	THURSDAY, FRIDAY, SATURDAY
}



public class EnumTest {
	Day day;
	
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellItLikeTkTs() {
		switch(day) {
		case MONDAY:
			System.out.println("월요일 싫어");
			break;
		case FRIDAY:
			System.out.println("금요일 좋은 듯");
			break;
		case SATURDAY:
			System.out.println("토요일 좋아!!");
			break;
		default:
			System.out.println("SOSO");
			break;
		}
	}
}

