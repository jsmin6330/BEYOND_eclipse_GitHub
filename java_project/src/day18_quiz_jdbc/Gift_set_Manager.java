package day18_quiz_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Gift_set_Manager {
	protected int GNO;
	protected String GNAME;
	protected int G_START;
	protected int G_END;
	protected int price;
	
	Connection conn;
	PreparedStatement pstmt;
	
	public void gift_insert() 
			throws ClassNotFoundException, SQLException{
		this.gift_Jdbc_connect();
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Gift Table data Update : 상품명/최저가/최고가 = ");
		String sql = "UPDATE GIFT_SET SET GNAME = ?, G_START = ?, G_END = ? , price = ? WHERE GNO = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, sc.next());
		pstmt.setInt(2, sc.nextInt());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, sc.nextInt());
		pstmt.setInt(5, sc.nextInt());
		int result = pstmt.executeUpdate();
		
		conn.commit();
		System.out.println(result + " 개 데이터 수정 성공함.");
		
		pstmt.close(); 
		conn.close();	
	}
	
	public void gift_delete() 
			throws ClassNotFoundException, SQLException{
		this.gift_Jdbc_connect();
		Scanner sc = new Scanner(System.in); 
		
		pstmt.close(); 
		conn.close();	
	}

	public void gift_update() 
			throws ClassNotFoundException, SQLException{
		this.gift_Jdbc_connect();
		Scanner sc = new Scanner(System.in); 
		
		pstmt.close(); 
		conn.close();	
	}
	
	public void gift_select_ALL() 
			throws ClassNotFoundException, SQLException{
		this.gift_Jdbc_connect();
		Scanner sc = new Scanner(System.in); 
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM gift_set "); 
		
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		
		while(rs.next()) {
			int gno = rs.getInt(1); //db의 필드 순서는 1번부터 시작한다.
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		rs.close();
		stmt.close();
		conn.close();
	}
	
	public void gift_select() 
			throws ClassNotFoundException, SQLException{
		this.gift_Jdbc_connect();
		Scanner sc = new Scanner(System.in); 
		
		pstmt.close(); 
		conn.close();	
	}
	
	public void gift_Jdbc_connect() 
			throws ClassNotFoundException, SQLException{
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("Driver load success!!");
		
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "maria");
		System.out.println("connection success!!");	
	}
}
