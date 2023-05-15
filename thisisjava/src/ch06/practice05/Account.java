package ch06.practice05;

public class Account {
	private String num;
	private String name;
	private int balance = 0;
	
	void setNum(String num) {
		this.num = num;
	}
	void setName(String name) {
		this.name = name;
	}
	String getNum() {
		return num;
	}
	String getName() {
		return name;
	}
	int getBalance() {
		return balance;
	}
	void setBalance(int Balance) {
		this.balance += Balance;
	}
	void withdraw(int withdraw) {
		this.balance -= withdraw;
	}
}