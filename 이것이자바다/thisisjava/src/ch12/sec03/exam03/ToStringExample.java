package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("samsung", "android");
		
		String strObj = smartPhone.toString();
		System.out.println(strObj);
		
		System.out.println(smartPhone);

	}

}
