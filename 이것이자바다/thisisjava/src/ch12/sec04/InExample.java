package ch12.sec04;

import java.io.IOException;

public class InExample {

	public static void main(String[] args) throws IOException{
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			//Enter 키를 읽지 않았을 경우에만 실행
			if(keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) {
					speed++;
				}else if(keyCode == 50) {
					speed--;
				}else if(keyCode == 51) {
					break;
				}
				System.out.println("-------------------------------------");
				System.out.println("1. speed up | 2. speed down | 3. stop");
				System.out.println("-------------------------------------");
				System.out.println("Speed="+speed);
				System.out.println("Select: ");
			}
			keyCode = System.in.read();
			
		}
		
		System.out.println("Quit");

	}

}
