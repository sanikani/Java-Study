package ch09.sec03.exam02;

public class A {
	public static class B{
		int field1 = 1;
		
		static int field2 =2;
		
		B(){
			System.out.println("B생성자 실행");
		}
		
		void method1() {
			System.out.println("B method1실행");
		}
		
		static void method2() {
			System.out.println("B method2실행");
		}
	}

}
