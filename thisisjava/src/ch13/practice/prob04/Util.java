package ch13.practice.prob04;

public class Util {
	public static <K,V> V getValue(Pair<K, V> pair, K key) {
		if(pair.getKey().equals(key)){
			return pair.getValue();
		}
		return null;
	}
}
