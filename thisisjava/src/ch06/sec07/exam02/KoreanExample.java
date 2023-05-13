package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("sani", "000405-21312312");
		
		System.out.println("k1.nation: " + k1.nation);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		System.out.println();
		
		Korean k2 = new Korean("kani", "020225-23123123");
		
		System.out.println("k2.nation: " + k2.nation);
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);
		System.out.println();


	}

}
