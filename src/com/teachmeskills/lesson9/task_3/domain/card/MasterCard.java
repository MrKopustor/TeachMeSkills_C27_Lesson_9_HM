package com.teachmeskills.lesson9.task_3.domain.card;

import com.teachmeskills.lesson9.task_3.constant.ICommissionConst;
import com.teachmeskills.lesson9.task_3.constant.ICurrencyCodeConst;
import com.teachmeskills.lesson9.task_3.constant.ILimitConst;

public final class MasterCard extends BaseCard {
    public MasterCard(){
        this.currencyCode = ICurrencyCodeConst.USD_CURRENCY_CODE;
        this.commissionPercentage = ICommissionConst.MASTER_CARD_COMMISSION;
    }
    @Override
    public double getTransferLimit() {
        return ILimitConst.MASTER_CARD_LIMIT;
    }
}
