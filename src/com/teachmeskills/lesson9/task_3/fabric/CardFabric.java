package com.teachmeskills.lesson9.task_3.fabric;

import com.teachmeskills.lesson9.task_3.card.BaseCard;
import com.teachmeskills.lesson9.task_3.card.BelCard;
import com.teachmeskills.lesson9.task_3.card.MasterCard;
import com.teachmeskills.lesson9.task_3.card.VisaCard;

public class CardFabric {

    public static BaseCard[] createCards(){

        BaseCard bel1 = new BelCard("1111 0928 2378 2373", 115.53, 843, 1);
        BaseCard bel2 = new BelCard("1111 8663 9357 3258", 4.3, 249, 1);
        BaseCard master1 = new MasterCard("2222 8756 1585 1585",28, 147, 2);
        BaseCard visa1 = new VisaCard("3333 1586 1586 1975", 494,040,3);

        BaseCard[] cards = new BaseCard[4];
        cards[0] = bel1;
        cards[1] = bel2;
        cards[2] = master1;
        cards[3] = visa1;
        return cards;
    }
}
