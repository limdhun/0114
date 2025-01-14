package org.example.kiosk.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


@ToString
@Getter
@AllArgsConstructor
public class Menu {

    private int num;
    private String name;
    private int price;
    //데이터가 변할 일은 거의 없다. 수정할 필요가 없다.
}
