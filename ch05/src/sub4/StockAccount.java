package sub4;

public class StockAccount extends Account {

	private String stock;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String acc, String name, int balance, String stock, int amount, int price) {
		super(bank, acc, name, balance);
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	public void buy(int amount, int price) {
		this.amount += amount;
		balance -= amount * price;
	}
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		balance += amount * price;
	}
	
	public void show() {
		super.show();
		System.out.println("주식종목 :" + stock);
		System.out.println("주식수량 :" + amount);
		System.out.println("현재가격 :" + price);
	}
}
