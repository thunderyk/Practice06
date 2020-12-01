package com.javaex.ex07;

public class MusicPhone extends Phone{
    
    public void execute(String str){
    	//System.out.println("music phone 메서드"); 테스트용 수정한 것 없음
        if("음악".equals(str)){
            playMusic();
        }else{
            super.execute(str);
        }
        
    }
    
    protected void playMusic(){
        System.out.println("Mp3플레이어에서 음악재생");
    }
}
