package com.cardunion.library;

/**
 * Created by kauserali on 05/05/14.
 */
public enum CreditCardTypeEnum {
    VISA("Visa"),
    MASTER_CARD("MasterCard"),
    AMERICAN_EXPRESS("American Express"),
    DISCOVER("Discover"),
    JCB("JCB"),
    DINERS_CLUB("Diners Club"),
    UNION_PAY("UnionPay"),
    MAESTRO("Maestro"),
    MIR("Mir"),
    RUPAY("RuPay"),
    HIPERCARD("Hipercard"),
    TROY("Troy"),
    VERVE("Verve"),
    HIMYAN("Himyan");

    public final String cartType;

    CreditCardTypeEnum(String cartType) {
        this.cartType = cartType;
    }

    public static String[] creditCardTypes() {
        String types[] = new String[values().length];
        int i = 0;
        for(CreditCardTypeEnum type : values()) {
            types[i] = type.cartType;
            i += 1;
        }
        return types;
    }
}
