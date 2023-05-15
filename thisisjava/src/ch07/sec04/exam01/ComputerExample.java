package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		Computer mycom = new Computer();
		Calculator mycal = new Calculator();
		System.out.println("Circle Area: "+ mycal.areaCircle(r));
		System.out.println();
		System.out.println("Circle Area: "+ mycom.areaCircle(r));

	}

}
