package VO;

public class OrderVO {
	private int orderNo;
	private String orderId;
	private int orderProduct;
	private int orderCount;
	private String orderDate;
	
	//추가 필드
	private String proName;
	private String orderer;
	
	public OrderVO() {
	}
	public OrderVO( String orderId, int orderProduct, int orderCount) {
		this.orderId = orderId;
		this.orderProduct = orderProduct;
		this.orderCount = orderCount;

	}
	
	public OrderVO(int orderNo, String orderId, int orderProduct, int orderCount, String orderDate) {
		this.orderNo = orderNo;
		this.orderId = orderId;
		this.orderProduct = orderProduct;
		this.orderCount = orderCount;
		this.orderDate = orderDate;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getOrderProduct() {
		return orderProduct;
	}
	public void setOrderProduct(int orderProduct) {
		this.orderProduct = orderProduct;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getOrderer() {
		return orderer;
	}
	public void setOrderer(String orderer) {
		this.orderer = orderer;
	}
	
	@Override
	public String toString() {
		return "OrderVO [orderNo=" + orderNo + ", orderId=" + orderId + ", orderProduct=" + orderProduct
				+ ", orderCount=" + orderCount + ", orderDate=" + orderDate + "]";
	}
	
}
