package org.example.kiosk.order;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;

@Log4j2
//주문(Order)에 대한 CRUD 처리하는 존재를 OrderService라 함
public enum OrderService {
    //몇 개나 미리 만들 것인가 결정
    INSTANCE;

    private ArrayList<Order> orders;
    private int idx;

    private OrderService(){
        orders = new ArrayList<>();
    }

    //주문을 받는다(추가한다)
    public int addOrder(Order order){
        log.info(order);
        log.info("current idx : " + idx);
        idx++;
        order.setOno(idx);
        orders.add(order);
        return idx;
    }
}
