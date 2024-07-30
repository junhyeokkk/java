package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 날짜 : 2024/07/29	
 * 이름 : 최준혁
 * 내용 : Transcation 실습하기
 */
public class TranscationTest {
	
	private final static  String HOST = "jdbc:mysql://localhost:3306/bank";
	private final static  String USER = "root";
	private final static  String PASS = "1001";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("에러를 발생 하시겠습니까?");
		
		int answer = scan.nextInt();
		Connection conn = null;	
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);

			//트랜잭션 시작 (커밋 모드 끄기)
			conn.setAutoCommit(false);
			
			String sql1 = "Update `bank_account` set `a_balance` = `a_balance` - 10000 where `a_no` =?";
			String sql2 = "Update `bank_account` set `a_balance` = `a_balance` + 10000 where `a_no` =?";
			
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setString(1, "101-11-1001");
			
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setString(1, "101-11-1003");
			
			pstmt1.executeUpdate();
			
			if(answer == 1) {
				throw new Exception("에러가 발생했습니다.");
			}
			
			pstmt2.executeUpdate();
			
			//트랜잭션 커밋 (작업 성공처리)
			conn.commit();
			
			pstmt1.close();
			pstmt2.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				//트랜잭션 취소 (작업 실패처리)
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		System.out.println("트랜잭션 종료 ...");
	}
}
