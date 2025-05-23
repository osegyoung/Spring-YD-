package com.yedam.app.di;

public class LgTV implements TV {
	
	private Speaker speaker; //NullPointerError 

	
	public LgTV(Speaker speaker) { // 인수가 하나인 생성자 , speaker를 초기화 시켜주는 생성자
		super();
		this.speaker = speaker;
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public LgTV() { // 기본 생성자
        System.out.println("===> LgTV");
    }

    public void powerOn() {
        System.out.println("LgTV powerOn.");
    }
    public void powerOff() {
        System.out.println("LgTV powerOff.");
    }
    public void volumeUp() {
    	speaker.volumeUp();
    }
    public void volumeDown() {
    	speaker.volumeDown();
    }
}
