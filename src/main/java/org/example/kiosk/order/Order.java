package org.example.kiosk.order;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
public class Order {
    private int ono; //주문 번호
    private ArrayList<OrderItem> orderItemList; //주문 번호

    public Order(){
        orderItemList = new ArrayList<>();
    }

    //OrderItem을 계속 추가할 수 있게 해야 함.
    public void addOrderItem(OrderItem newItem){
        orderItemList.add(newItem);
    }




}
