package com.yedam.app.di;

public class SamsungTV implements TV {
	
	private Speaker speaker; //NullPointerError 
	
	
	public SamsungTV(Speaker speaker) {// 인수가 하나인 생성자
		super();
		this.speaker = speaker;
	}


	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}


	public SamsungTV() { // 기본 생성자
		System.out.println("===> SamsungTV");
	}


	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}

	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
