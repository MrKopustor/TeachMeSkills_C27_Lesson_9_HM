package com.teachmeskills.lesson9.task_3.fabric;

import com.teachmeskills.lesson9.task_3.domain.card.BaseCard;
import com.teachmeskills.lesson9.task_3.domain.card.BelCard;
import com.teachmeskills.lesson9.task_3.domain.card.MasterCard;
import com.teachmeskills.lesson9.task_3.domain.card.VisaCard;

public class CardFabric {

    public static BaseCard[] createCards() {

        BaseCard bel1 = new BelCard(
                1111_5235_3525_3255L,
                1,
                412,
                144.4,
                1);
        BaseCard bel2 = new BelCard(
                1111_8663_9357_3258L,
                1,
                249,
                3.3,
                1);
        BaseCard master1 = new MasterCard(
                2222_8756_1585_1585L,
                2,
                147,
                214,
                2);
        BaseCard visa1 = new VisaCard(
                3333_1586_1586_1975L,
                2,
                112,
                2313,
                2);

        BaseCard[] cards = {bel1, bel2, master1, visa1};
        return cards;
    }
}
