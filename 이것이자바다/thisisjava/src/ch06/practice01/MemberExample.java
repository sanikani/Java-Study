package ch06.practice01;

public class MemberExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("login");
			memberService.logout("hong");
		}else {
			System.out.println("check id or password");
		}

	}

}
