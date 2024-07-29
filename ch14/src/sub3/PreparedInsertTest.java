package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*
 * 날짜 : 2024/07/29	
 * 이름 : 최준혁
 * 내용 : PreparedStatement 실습하기
 */
public class PreparedInsertTest {
	public static void main(String[] args) {

		
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "root";
		String pass = "1001";
		
		try {
			//1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//2단계 - SQL 실행객체 (PreparedStatement) 생성
			String sql = "Insert into `user2` values (?,?,?,?)"; // 준비된 쿼리 (쿼리 파라미터 ?가 사용된 임시 쿼리문)
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "J101");
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "1999-09-09");
			pstmt.setString(4, "부산광역시");
			
			//3단계 - SQL 실행
			pstmt.executeUpdate();
			
			//4단계 - ResultSet 결과처리
			
			//5단계 - 데이터베이스 종료
			pstmt.close();
			conn.close();
		} catch (Exception e) {
		
		}
		System.out.println("Insert 완료..");
	}
}
