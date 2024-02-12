package com.teachmeskills.lesson9.task_3.domain.card;

import com.teachmeskills.lesson9.task_3.constant.ICommissionConst;
import com.teachmeskills.lesson9.task_3.constant.ICurrencyCodeConst;
import com.teachmeskills.lesson9.task_3.constant.ILimitConst;

public final class BelCard extends BaseCard {
    public BelCard(){
        this.currencyCode = ICurrencyCodeConst.BYN_CURRENCY_CODE;
        this.commissionPercentage = ICommissionConst.BEL_CARD_COMMISSION;
    }

    @Override
    public double getTransferLimit() {
        return ILimitConst.BEL_CARD_LIMIT;
    }
}
