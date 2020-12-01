package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
    	if("음악".equals(str)){
            playMusic();
        }else if(str.equals("통화")){
            super.execute(str);
        }else if(str.equals("앱")) {
        	startApp();
        }
    }
 
    //메소드작성
    public void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    //메소드작성
    public void startApp() {
    	System.out.println("앱 실행");
    }
    
    
}
