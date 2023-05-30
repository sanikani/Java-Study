package ch15.sec05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(83);
		scores.add(73);
		scores.add(86);
		scores.add(93);
		scores.add(23);
		
		for(Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 높은 점수: " + scores.last());
		System.out.println("85점 아래 점수: " + scores.lower(85));
		System.out.println("85점 위의 점수: " + scores.higher(85));
		System.out.println("80점이거나 바로 아래 점수: " + scores.floor(80));
		System.out.println("75점이거나 바로 위의 점수: " + scores.ceiling(75)+ "\n");
		
		//내림차순으로 정렬하기
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for(Integer s : descendingScores) {
			System.out.print(s+ " ");
		}
		System.out.println("\n");
		
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
	}

}
