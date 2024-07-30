package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User2DAO {
	
	private static User2DAO	instance = new User2DAO();
	
	public static User2DAO getInstance() {
		return instance;
	}

	//DB연결
	private static final String HOST = "jdbc:mysql://localhost:3306/studydb";
	private static final String USER = "root";
	private static final String PASS = "1001";
	
	public User2DAO() {}
	
	public void insertUser2(User2VO vo) {
		String sql = "Insert into `user2` (uid, name, birth, addr) values (?, ?, ?, ?)";
		try {
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUid());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getBirth());
			pstmt.setString(4, vo.getAddr());
		
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public User2VO selectUser2(String uid) {
		String sql = "select * from `user2` where uid = ?";
		User2VO vo = null;
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, uid);
			
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new User2VO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setBirth(rs.getString(3));
				vo.setAddr(rs.getString(4));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	public List<User2VO> selectUser2s() {
		String sql = "select * from `user2`";
		List<User2VO> vos = new ArrayList<>();
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String birth = rs.getString(3);
				String addr = rs.getString(4);
				  
				vos.add(new User2VO(uid, name, birth, addr));
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vos;
	}
	public int updateUser2(User2VO vo) {
		String sql = "update `user2` set name=?, birth=?, addr=? where uid =?";
		int result = 0;
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getBirth());
			pstmt.setString(3, vo.getAddr());
			pstmt.setString(4, vo.getUid());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int delectUser2(String uid) {
		String sql = "delete from `user2` where uid = ?";
		int result = 0;
		try {
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
}
