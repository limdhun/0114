package org.example.vending;

import java.util.Scanner;

public class VendingUI {
    //메서드들간 공유할만한
    Scanner scanner = new Scanner(System.in);
    //협력자와 조력자. 자판기를 내가 계속 쓸거니까 여기서 자판기 인스턴스 변수 선언
    private VendingMachine vendingMachine;

    public VendingUI(VendingMachine vm){
        this.scanner = new Scanner(System.in);
        this.vendingMachine = vm;
    }
    //String str = scanner.nextLine();

        public void use () {
            while (true) {


                System.out.println("1.아아 2.티 3.밀크커피 4.종료");
                String oper = this.scanner.nextLine();

                switch (oper) {
                    case "1":
                        System.out.println(vendingMachine.makeIA());
                        break;
                    case "2":
                        System.out.println(vendingMachine.makeTea());
                        break;
                    case "3":
                        System.out.println(vendingMachine.makeMilkCoffee());
                        break;
                    case "4":
                        System.out.println("종료합니다.");
                        return;

                }
            }




    }
    //자판기는 내가 만든게 아니라, 누가 만든걸 내가 쓰는거임 -> 생성자를 통한 의존성 주입
}
