package sub1;

public class Account {
	
	String bank;
	String acc;
	String name;
	int balance;
	
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
