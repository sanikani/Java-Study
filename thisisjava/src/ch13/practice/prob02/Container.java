package ch13.practice.prob02;

public class Container<T, X> {
	private T key;
	private X value;
	
	public void set(T key, X value) {
		this.key = key;
		this.value = value;
	}
	
	public T getKey() {
		return key;
	}
	
	public X getValue() {
		return value;
	}
	
}
