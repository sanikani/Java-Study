package ch06.practice05;
import java.util.Scanner;
public class BankApplication {

	public static void main(String[] args) {
		Account[] Account = new Account[100];
		int index = 0;
		String num;
		String name;
		int initMoney;
		int addBalance;
		int withdraw;
		boolean applicationOn = true;
		Scanner scanner = new Scanner(System.in);
		while(applicationOn) {
		System.out.println("------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택>");
		int select = scanner.nextInt();
		if(select == 1) {
			Account account = new Account();
			System.out.println("----------");
			System.out.println("계좌 생성");
			System.out.println("----------");
			System.out.print("계좌번호 : ");
			num = scanner.next();
			account.setNum(num);
			System.out.print("계좌주 : ");
			name = scanner.next();
			account.setName(name);
			System.out.print("초기 입금액 : ");
			initMoney = scanner.nextInt();
			account.setBalance(initMoney);
			System.out.println("결과 : 계좌가 생성되었습니다.");
			Account[index] = account;
			index++;
		}
		else if(select == 2){
			System.out.println("----------");
			System.out.println("계좌 목록");
			System.out.println("----------");
			for(int i=0;i<index;i++) {
				System.out.println(Account[i].getNum()+ "   " + Account[i].getName()+ "   " + Account[i].getBalance());
			}
			
		}
		else if(select == 3){
			System.out.println("----------");
			System.out.println("    예금   ");
			System.out.println("----------");
			System.out.print("계좌번호: ");
			num = scanner.next();
			for(int i=0; i<index; i++) {
				if(Account[i].getNum().equals(num)){
					System.out.print("예금액: ");
					addBalance = scanner.nextInt();
					Account[i].setBalance(addBalance);
				}
			}
			
		}
		else if(select == 4){
			System.out.println("----------");
			System.out.println("    출금   ");
			System.out.println("----------");
			System.out.print("계좌번호: ");
			num = scanner.next();
			for(int i=0; i<index; i++) {
				if(Account[i].getNum().equals(num)){
					System.out.print("출금액: ");
					withdraw = scanner.nextInt();
					Account[i].withdraw(withdraw);
				}
			}
		}
		else if(select == 5){
			System.out.println("프로그램 종료");
			applicationOn = false;
			}		
		}
	}
}
