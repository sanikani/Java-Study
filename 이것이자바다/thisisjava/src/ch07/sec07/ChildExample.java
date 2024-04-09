package ch07.sec07;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3()호출불가

	}

}
