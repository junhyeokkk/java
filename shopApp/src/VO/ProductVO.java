package VO;

public class ProductVO {
	private int prodNo;
	private String proName;
	private int stock;
	private int price;
	private String company;
	
	public ProductVO() {
	}



	public ProductVO(int prodNo, String proName, int stock, int price, String company) {
		this.prodNo = prodNo;
		this.proName = proName;
		this.stock = stock;
		this.price = price;
		this.company = company;
	}



	public int getProdNo() {
		return prodNo;
	}



	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}



	public String getProName() {
		return proName;
	}



	public void setProName(String prodName) {
		this.proName = prodName;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	@Override
	public String toString() {
		return "ProductVO [prodNo=" + prodNo + ", proName=" + proName + ", stock=" + stock + ", price=" + price
				+ ", company=" + company + "]";
	}
	
	
}
