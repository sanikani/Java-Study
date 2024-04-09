package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("JSP");
		set.add("JDBC");
		set.add("java");
		set.add("Spring");
		
		int size = set.size();
		System.out.println("총 개수: " + size);

	}

}
