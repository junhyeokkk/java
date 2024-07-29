package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2024/07/29	
 * 이름 : 최준혁
 * 내용 : Insert 실습하기
 */

public class UpdateTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1001";
		
		
		
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			Statement stmt = conn.createStatement();
	
			String sql = "Update `user1` set ";
			   sql += "`hp` = '010-1234-1111', ";
			   sql += "`age` = 25 ";
			   sql += "where `uid` = 'J101'";
			   
			stmt.executeUpdate(sql);
			
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
	
	}
}
