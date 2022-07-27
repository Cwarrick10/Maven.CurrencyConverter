package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
public class SingaporeDollar implements ConvertableCurrency {
     CurrencyType sinDollar = CurrencyType.SINGAPORE_DOLLAR;


    @Override
    public CurrencyType getType() {
        return sinDollar;
    }
}
