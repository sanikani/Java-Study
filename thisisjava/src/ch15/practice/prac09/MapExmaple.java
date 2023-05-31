package ch15.practice.prac09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapExmaple {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> s : set ) {
			if(s.getValue()>maxScore) {
				maxScore = s.getValue();
				name = s.getKey();
			}
			totalScore += s.getValue();
		}
		
		System.out.println("평균 점수: " + totalScore/3);
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 아이디: " + name);
	}

}
