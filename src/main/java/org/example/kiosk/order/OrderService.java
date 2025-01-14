package org.example.kiosk.order;

import java.util.ArrayList;

//주문(Order)에 대한 CRUD 처리하는 존재를 OrderService라 함
public enum OrderService {
    //몇 개나 미리 만들 것인가 결정
    INSTANCE;

    private ArrayList<Order> orders;
    private OrderService(){
        orders = new ArrayList<>();
    }
    //주문을 받는다(추가한다)
    public void addOrder(Order order){
        orders.add(order);
    }
}
