package org.example.kiosk.menu;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;

@Log4j2
public enum MenuService {

    //주어진 메뉴 데이터들을 제공하는 기능
    //CRUD (Create Read Update Delete)
    //Menu데이터는 늘 보관중. Menu데이터를 핸들링하기 위해 존재하는게 메뉴서비스 클래스

    INSTANCE;
    private ArrayList<Menu> menus;

    //초기화
    private MenuService(){
        this.menus = new ArrayList<>();
        menus.add(new Menu(1,"Americano",3000));
        menus.add(new Menu(2,"Latte",3500));
        menus.add(new Menu(3,"Cappuccino",4000));
        menus.add(new Menu(4,"Espresso",2500));
        //생성자에서는 log 사용 불가. method에서 찍기

    }

    public ArrayList<Menu> getList(){
        //단계 순
//        log.trace("trace-------------");
//        log.debug("debug-------------");
//        log.info("info-------------");
//        log.warn("warn-------------");
//        log.error("error-------------");
//        log.fatal("fatal-------------");
    // trace, debug, info는 개발자레벨이 보는 로그. info를 제일 많이 씀
    // 운영 단계에서는 warn ~ fatal를 가장 많이 씀.

        log.info("getList....called");
        log.info(menus);

        return menus;
    }


    
}
