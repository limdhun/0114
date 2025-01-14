package org.example.lots;

import java.util.Scanner;

public class LotsUI {

    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("뽑기 : Enter");
            scanner.nextLine();

            String note = LotsBox.INSTANCE.getNext();//객체를 하나만 만들어 씀 -> 싱글턴 패턴
            System.out.println(note);

            if (note.equals("당첨")){
                break;
            }
        }
    }

}
