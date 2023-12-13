package day18_02_mvc.model;

public class GiftDTO { //Model은 이름에 ~~VO 혹은 ~~DTO를 붙인다.
	public final String TableName = "gift_set";
	//final은 setter은 못만든다.
	
	private int GNO;
	private String GNAME;
	private int G_START;
	private int G_END;
	private int price;
	
	public String getTableName() {
		return TableName;
	}
	
	public int getGNO() {
		return GNO;
	}
	public void setGNO(int gNO) {
		GNO = gNO;
	}
	public String getGNAME() {
		return GNAME;
	}
	public void setGNAME(String gNAME) {
		GNAME = gNAME;
	}
	public int getG_START() {
		return G_START;
	}
	public void setG_START(int g_START) {
		G_START = g_START;
	}
	public int getG_END() {
		return G_END;
	}
	public void setG_END(int g_END) {
		G_END = g_END;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
