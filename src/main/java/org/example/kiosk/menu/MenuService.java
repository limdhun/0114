package org.example.kiosk.menu;

import java.util.ArrayList;

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
    }

    public ArrayList<Menu> getList(){
        return menus;
    }


    
}
