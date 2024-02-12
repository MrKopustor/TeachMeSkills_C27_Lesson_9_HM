package com.teachmeskills.lesson9.task_3.domain.card;

import com.teachmeskills.lesson9.task_3.constant.ICommissionConst;
import com.teachmeskills.lesson9.task_3.constant.ICurrencyCodeConst;
import com.teachmeskills.lesson9.task_3.constant.ILimitConst;

public final class VisaCard extends BaseCard {

    public VisaCard(){
        this.currencyCode = ICurrencyCodeConst.USD_CURRENCY_CODE;
        this.commissionPercentage = ICommissionConst.VISA_CARD_COMMISSION;
    }
    @Override
    public double getTransferLimit() {
        return ILimitConst.VISA_CARD_LIMIT;
    }
}
