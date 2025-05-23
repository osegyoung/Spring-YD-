package com.yedam.app.di;

import org.springframework.context.annotation.Bean;

//자바기반 설정
public class ContextConfigure {
	
	@Bean
	public Speaker speaker() { 
		return new AppleSpeaker(); 
	}

	@Bean // 자바 기반 설정
	public TV tv() { // App.java에 메소드명이랑 같아야 함. 
		LgTV tv = new LgTV(speaker()); // 부모 LgTV tv = new LgTV(speaker()); => 생성자 방식
		//tv.setSpeaker(speaker());
		return tv;
	}
}
