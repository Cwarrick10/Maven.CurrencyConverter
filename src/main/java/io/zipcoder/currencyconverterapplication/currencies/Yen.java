package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Yen implements ConvertableCurrency {
    CurrencyType yen = CurrencyType.YEN;

    public CurrencyType getType(){
        return yen;
    }
}
