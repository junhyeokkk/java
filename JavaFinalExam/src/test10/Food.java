package test10;

public class Food extends Product {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getPrice() {
		return price;
	}

	
}
