package quiz_special.scoreclass2;

public class MainEntry {
	public static void main(String[] args) {
//		Score score = new Score();
//		score.setName("미미");
//		score.setKor(20);
//		score.setEng(20);
//		score.setCom(20);
//		score.setTotal(score.getKor(), score.getEng(), score.getCom());
//		score.setAvg(score.getTotal());
//		score.setGrade(score.getAvg());
//		score.output();
//		
//		Score score1 = new Score("유진");
//		score1.setKor(100);
//		score1.setEng(99);
//		score1.setCom(100);
//		score1.setTotal(score1.getKor(), score1.getEng(), score1.getCom());
//		score1.setAvg(score1.getTotal());
//		score1.setGrade(score1.getAvg());
//		score1.output();
//		
//		Score score2 = new Score("수민", 100, 100, 100);
//		score2.setTotal(score2.getKor(), score2.getEng(), score2.getCom());
//		score2.setAvg(score2.getTotal());
//		score2.setGrade(score2.getAvg());
//		score2.output();
		
		Score score3 = new Score();
		score3.input();
		score3.setTotal(score3.getKor(), score3.getEng(), score3.getCom());
		score3.setAvg(score3.getTotal());
		score3.setGrade(score3.getAvg());
		score3.output();
	}
}
