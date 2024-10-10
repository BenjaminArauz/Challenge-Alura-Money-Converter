package com.aluracursos.moneyconverter.models;

import java.util.Map;

public class MoneyConverter {
    private String base_code;
    private Map<String, Float> conversion_rates;

    public String getBaseCode() {
        return base_code;
    }

    public Map<String, Float> getConversionRates() {
        return conversion_rates;
    }
}
