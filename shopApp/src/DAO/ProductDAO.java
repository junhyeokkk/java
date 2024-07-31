package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import VO.ProductVO;
import shopdb.DBHelper;
import shopdb.SQL;

public class ProductDAO extends DBHelper{

	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	private ProductDAO() {}
	
	public int insertProduct(ProductVO vo) throws SQLException {
		int count = 0;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_PRODUCT);
			psmt.setString(1, vo.getProName());
			psmt.setInt(2, vo.getStock());
			psmt.setInt(3, vo.getPrice());
			psmt.setString(4, vo.getCompany());
			
			count = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	public ProductVO selectProduct(int prodNo1) {
		ProductVO vo = null;
		try {
			String prodNo  = String.valueOf(prodNo1);
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setString(1, prodNo);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new ProductVO();
				vo.setProdNo(Integer.parseInt(rs.getString(1)));
				vo.setProName(rs.getString(2));
				vo.setStock(Integer.parseInt(rs.getString(3)));
				vo.setPrice(Integer.parseInt(rs.getString(4)));
				vo.setCompany(rs.getString(5));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	public List<ProductVO> selectProducts() {
		List<ProductVO> vos = new ArrayList<ProductVO>();
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCTS);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setProdNo(Integer.parseInt(rs.getString(1)));
				vo.setProName(rs.getString(2));
				vo.setStock(Integer.parseInt(rs.getString(3)));
				vo.setPrice(Integer.parseInt(rs.getString(4)));
				vo.setCompany(rs.getString(5));
				vos.add(vo);
			}
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vos;
	}
	public void updateProduct() {
		
	}
	public void deleteProduct() {
		
	}
}
