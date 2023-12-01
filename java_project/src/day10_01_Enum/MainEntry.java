package day10_01_Enum;



public class MainEntry {
	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeTkTs();
		
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellItLikeTkTs();
	}
}
