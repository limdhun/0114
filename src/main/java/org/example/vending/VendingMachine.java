package org.example.vending;

public class VendingMachine {

    private int iaCount;    //인스턴스 변수는 항상 private
    private int teaCount;
    private int milkCount;

    public VendingMachine(){
//        this.iaCount = 10;
//        this.teaCount = 5;
//        this.milkCount = 20;
        this(10,5,7); //생성자 함수 호출
    }

    public VendingMachine(int iaCount, int teaCount, int milkCount) {
        this.iaCount = iaCount;
        this.teaCount = teaCount;
        this.milkCount = milkCount;
    }

    //로직 위주의 클래스. 메소드 먼저 생성.
    //UI가 아닌 이상, sout println은 거의 안함. UI에서만 함.
    //Test 작업 할 때는 테스트 라이브러리 사용. 아직은 안배움
    public String makeIA(){
        return "Ice Americano " + --this.iaCount;
    }
    public String makeTea(){
        return "Grean Tea " + --this.teaCount;
    }
    public String makeMilkCoffee(){
        return "Milk Coffee " + --this.milkCount;
    }





}
