package org.example.kiosk;

import lombok.extern.log4j.Log4j2;
import org.example.kiosk.menu.Menu;
import org.example.kiosk.menu.MenuService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

@Log4j2
public class SampleTests {
    //두 개의 규칙 - void, 파라미터 없어야 함. public으로 만드는게 편함
    @Test
    public void test1(){
        java.util.ArrayList<Menu> menuArrayList = MenuService.INSTANCE.getList();

        //각각의 메뉴에 대해서 이런 함수를 실행하라.
        //f(x) => y (람다 lambda)
        menuArrayList.forEach(m -> log.info(m));
//        Assertions.assertEquals(5, menuArrayList.size());
    }


}