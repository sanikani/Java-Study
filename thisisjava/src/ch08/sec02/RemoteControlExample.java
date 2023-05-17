package ch08.sec02;

public class RemoteControlExample {
	public static void main(String args[]) {
		RemoteControl rc;
		rc = new Televison();
		rc.turnOn();
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio = rc;
		rc.turnOn();
	}

}
