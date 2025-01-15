package org.example.kiosk;

import org.example.kiosk.menu.Menu;
import org.example.kiosk.menu.MenuService;
import org.example.kiosk.order.Order;
import org.example.kiosk.order.OrderItem;
import org.example.kiosk.order.OrderService;

import java.util.ArrayList;
import java.util.Scanner;

public class KioskUI {

    public void startOrder() {
        while(true) {
            greeting();
            makeOrder();
            thanks();//this가 생략된 것
        }
    }

    private void greeting(){
        System.out.println("안녕하세요!");
    }

    private void makeOrder(){
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        while (true) {

            ArrayList<Menu> menus = MenuService.INSTANCE.getList();
            menus.forEach(m -> System.out.println(m));

            System.out.println("메뉴번호를 입력하세요");
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println("수량을 입력하세요");
            int qty = Integer.parseInt(scanner.nextLine());

            OrderItem orderItem = OrderItem.builder().menuNo(num).qty(qty).build();
            System.out.println("주문을 계속 하시겠습니까? y/n");
            String oper = scanner.nextLine();
            if (oper.equals("n")) {
                break;
            }
        }

        int num = OrderService.INSTANCE.addOrder(order);
    }

    private void thanks(){
        System.out.println("안녕히가세요!");
    }


}
