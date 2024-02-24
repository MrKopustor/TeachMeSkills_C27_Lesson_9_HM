package com.teachmeskills.lesson9.task_3.fabric;

import com.teachmeskills.lesson9.task_3.domain.card.BaseCard;
import com.teachmeskills.lesson9.task_3.domain.card.BelCard;
import com.teachmeskills.lesson9.task_3.domain.card.MasterCard;
import com.teachmeskills.lesson9.task_3.domain.card.VisaCard;

/**
 * Class CardFabric
 * Создает cards
 */
public class CardFabric {

    public static BaseCard[] createCards() {

        BaseCard bel1 = new BelCard(
                1111_8663_9357_3258L,
                1,
                249,
                249,
                1);
        BaseCard bel2 = new BelCard(
                1111_5584_9357_5454L,
                2,
                546,
                112,
                1);
        BaseCard master1 = new MasterCard(
                2222_8756_1585_1585L,
                3,
                147,
                147,
                2);
        BaseCard visa1 = new VisaCard(
                3333_1586_1586_1975L,
                4,
                112,
                2313,
                2);

        BaseCard[] cards = {bel1,bel2, master1, visa1};
        return cards;
    }
}
