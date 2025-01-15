package org.example;

import org.example.card.Card;
import org.example.card.CardDeck;
import org.example.kiosk.KioskUI;
import org.example.lots.LotsUI;
import org.example.vending.Scores;
import org.example.vending.VM2;
import org.example.vending.VendingMachine;
import org.example.vending.VendingUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KioskUI ui = new KioskUI();
        ui.startOrder();



        }


//        VendingMachine vm = new VendingMachine(20,5,5);
//        VendingUI ui = new VendingUI(vm);
//        ui.use();

//        System.out.println(VM2.INSTANCE.hello());
//        System.out.println(VM2.NAMPO);
//  ==================================================================
//        ArrayList<String> list = new ArrayList<>();
//        list.add("꽝");
//        list.add("꽝");
//        list.add("당첨");
//
//        Collections.shuffle(list);
//
//        System.out.println(list);
//        //remove(0)
//        System.out.println(list.remove(0));
//        System.out.println(list.remove(0));
//        System.out.println(list.remove(0));


//        LotsUI ui = new LotsUI();
//        ui.startGame();
//        Scanner scanner = new Scanner(System.in);
//        Card userCard = CardDeck.INSTANCE.getOne();
//        Card comCard = CardDeck.INSTANCE.getOne();
//
//        System.out.println(userCard);
//        System.out.println(comCard);
//        System.out.println("다시 뽑으려면 1, 종료는 2");
//        while(true) {
//            int oper = Integer.parseInt(scanner.nextLine());
//
//            if(1 == oper){
//                userCard = CardDeck.INSTANCE.getOne();
//                comCard = CardDeck.INSTANCE.getOne();
//                System.out.println("\n" + userCard);
//                System.out.println(comCard);
//            }
//            else if(2 == oper){
//                break;
//            }
//            System.out.println("다시 뽑으려면 1, 종료는 2");
//        }
//    }
}