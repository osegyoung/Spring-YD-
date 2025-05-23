package com.yedam.app.di;

public class AppleSpeaker implements Speaker {
    public AppleSpeaker() {
        System.out.println("===> AppleSpeaker");
    }    
    public void volumeUp() {
        System.out.println("AppleSpeaker volumeUp.");
    }
    public void volumeDown() {
        System.out.println("AppleSpeaker volumeDown.");
    }
}
