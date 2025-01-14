package org.example.card;

import java.util.ArrayList;
import java.util.Collections;

public enum CardDeck {
    INSTANCE;
    private ArrayList<Card> cards;

    private CardDeck(){
        this.cards = new ArrayList<>();

        for (int i = 1 ; i <= 52; i++){
            //int odd = (int)Math.floor(i / 13.0);//내림
            cards.add(new Card(CardPattern.CLO, i));
        }
        Collections.shuffle(cards);

    }
    //카드 덱 = 서비스
    public Card getOne(){
        Card card = cards.remove(0);
        return card;
    }


}
