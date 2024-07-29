package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 날짜 : 2024/07/29	
 * 이름 : 최준혁
 * 내용 : Delete 실습하기
 */
public class DeleteTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1001";
		
		try {
			Connection conn = DriverManager.getConnection(host,user,pass);
		
			Statement stmt = conn.createStatement();
			
			//아이디 J101 삭제
			String sql = "Delete from `user1` where uid = 'J101' ";
			
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료 ...");
	}
}
