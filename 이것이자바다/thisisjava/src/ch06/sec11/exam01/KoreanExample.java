package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("123234-123123", "sani");
		
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		//Final 필드 값 변경 불가
		
		//비 final 필드인 name은 값 변경 가능
		k1.name = "kani";

	}

}
