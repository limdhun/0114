package org.example.vending;

//함수와 클래스의 중간 정도 되는 애임. 요즘엔 얘의 중요성이 올라감
//생성자를 만들면 오히려 에러가 남.
//지정된 수 만큼의 객체만 생성한다.

public enum VM2 {
    INSTANCE, SEOMYEON, NAMPO;   //만들 개수만큼 미리 객체 생성
    //enum의 용도는, 내가 처음부터 몇 개를 만들지 정하는것. 
    //상수

    private int count;

    public String hello(){
        return "Hello" + count++;
    }


}
