package quiz_inheritance;

public class Sales extends Regular{
	private int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus() {
		this.bonus = (int) (salary*1.01);
	}

	public Sales() {
		super();
		this.setBonus();
		System.out.println("Sales default constructor call");
	}
	
	public void display() {
		super.display();
		System.out.printf("보너스: %d\n", getBonus());
	}
}
