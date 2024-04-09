package ch08.sec05;

public class Audio implements RemoteControl{
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio ON");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio OFF");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 AUDIO 볼륨 : " + volume);
	}
	private int memoryVolume;

	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}

}
