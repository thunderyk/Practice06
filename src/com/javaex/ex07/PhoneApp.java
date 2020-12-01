package com.javaex.ex07;

public class PhoneApp {

    public static void main(String[] args) {

        Phone phone = new SmartPhone();
        phone.execute("앱");
        phone.execute("음악");
        phone.execute("통화");
        //super 에 super로 올라가서 통화기능 시작이 나옴.
        //super 한번으로 조상으로 바로 가는게 아니라 바로 위 부모로 올라감
        
    }


}
