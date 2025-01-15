package org.example.kiosk.order;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@ToString
@Setter
public class Order {
    private int ono; //주문 번호라는건 주문을 완료한 후 생성되는것. 즉, 주문 번호는 나중에 만들어짐.

    private ArrayList<OrderItem> orderItemList; //주문 번호

    public Order(){
        orderItemList = new ArrayList<>();
    }

    //OrderItem을 계속 추가할 수 있게 해야 함.
    public void addOrderItem(OrderItem newItem){
        orderItemList.add(newItem);
    }




}
