package ch06.practice04;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("Balance : " + account.getBalance());
		account.setBalance(-10);
		System.out.println("Balance : " + account.getBalance());
		account.setBalance(2000000);
		System.out.println("Balance : " + account.getBalance());
		account.setBalance(300000);
		System.out.println("Balance : " + account.getBalance());

	}

}
