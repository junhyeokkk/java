package DAO;

import java.util.ArrayList;
import java.util.List;

import VO.OrderVO;
import shopdb.DBHelper;
import shopdb.SQL;

public class OrderDAO extends DBHelper {
	private static OrderDAO instance = new OrderDAO();
	
	public static OrderDAO getInstance() {
		return instance;
	}
	
	public OrderDAO() {}
	
	public int InsertOrder(OrderVO vo) {
		int count = 0;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_ORDER);
			psmt.setString(1, vo.getOrderId());
			psmt.setInt(2, vo.getOrderProduct());
			psmt.setInt(3, vo.getOrderCount());
			
			count = psmt.executeUpdate();
			
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public List<OrderVO> showOrder(String custId){
		List<OrderVO> vos = new ArrayList<OrderVO>();
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELEET_ORDER);
			psmt.setString(1, custId);
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				OrderVO vo = new OrderVO();
				vo.setOrderNo(Integer.parseInt(rs.getString(1)));
				vo.setOrderProduct(Integer.parseInt(rs.getString(2)));
				vo.setProName(rs.getString(3));
				vo.setOrderCount(Integer.parseInt(rs.getString(4)));
				vo.setOrderer(rs.getString(5));
				vo.setOrderDate(rs.getString(6));
				vos.add(vo);
			}
			
		} catch (Exception e) {

 
		}
		return vos;
	}
}
