package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("Same singleton object");
		}else {
			System.out.println("different singeton object");
		}

	}

}
