package org.example.kiosk.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@ToString
public class OrderItem {
    //메뉴 번호, 수량. 두 개의 데이터로 구성
    private int menuNo;
    private int qty;


}
