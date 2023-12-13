package day18_02_mvc.view;
import java.sql.SQLException;
import day18_02_mvc.controller.GiftController;

public class MainEntry {
	public static void main(String[] args) throws SQLException {
		GiftController.connect();
		GiftController.menu();
	}
}
