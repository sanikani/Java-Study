package ch12.practice10;

public class StringBuildeExample {

	public static void main(String[] args) {
		String str = "";
		for(int i=1; i<=100; i++) {
			str += i;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			sb.append(i);
		}
		String str1 = new String(sb.toString());
		System.out.println(str);
		System.out.println(str1);
		

	}

}
