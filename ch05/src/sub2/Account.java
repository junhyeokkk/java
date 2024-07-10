package sub2;

public class Account {
	
	private String bank;
	private String acc;
	private String name;
	private int balance;
	
	//생성자 정의
	public Account(String bank, String acc, String name, int balance) {
		this.bank = bank;
		this.acc = acc;
		this.name = name;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBank() {
		return bank;
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public void deposit(int Money) {
		this.balance += Money;
	}
	
	public void withdraw(int Money) {
		this.balance -= Money;
	}
	
	public void show() {
		System.out.println("은행명 : " + bank);
		System.out.println("계좌번호 : " + acc);
		System.out.println("입금주 : " + name);
		System.out.println("현재잔액 : " + balance);
	}
}
