package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;
public class Ringgit implements ConvertableCurrency {
    CurrencyType ring = CurrencyType.RINGGIT;

    @Override
    public CurrencyType getType() {
        return ring;
    }
}
