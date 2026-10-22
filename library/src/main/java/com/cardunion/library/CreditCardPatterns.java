package com.cardunion.library;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kauserali on 05/05/14.
 */
public class CreditCardPatterns implements CreditCardEditText.CreditCartEditTextInterface {

    private Context mContext;

    public CreditCardPatterns(Context context) {
        mContext = context;
    }

    @Override
    public List<CreditCardEditText.CreditCard> mapOfRegexStringAndImageResourceForCreditCardEditText(CreditCardEditText creditCardEditText) {
        List<CreditCardEditText.CreditCard> listOfPatterns = new ArrayList<CreditCardEditText.CreditCard>();

        CreditCardEditText.CreditCard maestro = new CreditCardEditText.CreditCard("^(5018|5020|5038|5893|6304|6759|6761|6762|6763)[0-9]*$", mContext.getResources().getDrawable(R.drawable.credit_card), CreditCardTypeEnum.MAESTRO.cartType);
        CreditCardEditText.CreditCard amex = new CreditCardEditText.CreditCard("^3[47][0-9]*$", mContext.getResources().getDrawable(R.drawable.amex), CreditCardTypeEnum.AMERICAN_EXPRESS.cartType);
        CreditCardEditText.CreditCard dinersClub = new CreditCardEditText.CreditCard("^3(0[0-5]|09|[689])[0-9]*$", mContext.getResources().getDrawable(R.drawable.credit_card), CreditCardTypeEnum.DINERS_CLUB.cartType);
        CreditCardEditText.CreditCard jcb = new CreditCardEditText.CreditCard("^(35[2-8][0-9]*|2131|1800)[0-9]*$", mContext.getResources().getDrawable(R.drawable.credit_card), CreditCardTypeEnum.JCB.cartType);
        CreditCardEditText.CreditCard hipercard = new CreditCardEditText.CreditCard("^606282[0-9]*$", mContext.getResources().getDrawable(R.drawable.credit_card), CreditCardTypeEnum.HIPERCARD.cartType);
        CreditCardEditText.CreditCard discover = new CreditCardEditText.CreditCard("^(6011|65|64[4-9]|622)[0-9]*$", mContext.getResources().getDrawable(R.drawable.credit_card), CreditCardTypeEnum.DISCOVER.cartType);
        CreditCardEditText.CreditCard mir = new CreditCardEditText.CreditCard("^220[0-4][0-9]*$", mContext.getResources().getDrawable(R.drawable.credit_card), CreditCardTypeEnum.MIR.cartType);
        CreditCardEditText.CreditCard rupay = new CreditCardEditText.CreditCard("^(508|606985|607|608|652[1-2]|8[1-2]|509)[0-9]*$", mContext.getResources().getDrawable(R.drawable.credit_card), CreditCardTypeEnum.RUPAY.cartType);
        CreditCardEditText.CreditCard troy = new CreditCardEditText.CreditCard("^9792[0-9]*$", mContext.getResources().getDrawable(R.drawable.credit_card), CreditCardTypeEnum.TROY.cartType);
        CreditCardEditText.CreditCard verve = new CreditCardEditText.CreditCard("^(506[0-9]|507[8-9]|650[0-9])[0-9]*$", mContext.getResources().getDrawable(R.drawable.credit_card), CreditCardTypeEnum.VERVE.cartType);
        CreditCardEditText.CreditCard mastercard = new CreditCardEditText.CreditCard("^(5[1-5][0-9]*|2[2-7][0-9]*)$", mContext.getResources().getDrawable(R.drawable.mastercard), CreditCardTypeEnum.MASTER_CARD.cartType);
        CreditCardEditText.CreditCard himyan = new CreditCardEditText.CreditCard("^4036[0-9]*$", mContext.getResources().getDrawable(R.drawable.credit_card), CreditCardTypeEnum.HIMYAN.cartType);
        CreditCardEditText.CreditCard visa = new CreditCardEditText.CreditCard("^4[0-9]*$", mContext.getResources().getDrawable(R.drawable.visa), CreditCardTypeEnum.VISA.cartType);
        CreditCardEditText.CreditCard unionPay = new CreditCardEditText.CreditCard("^62[0-9]*$", mContext.getResources().getDrawable(R.drawable.credit_card), CreditCardTypeEnum.UNION_PAY.cartType);

        listOfPatterns.add(maestro);
        listOfPatterns.add(amex);
        listOfPatterns.add(dinersClub);
        listOfPatterns.add(jcb);
        listOfPatterns.add(hipercard);
        listOfPatterns.add(discover);
        listOfPatterns.add(mir);
        listOfPatterns.add(rupay);
        listOfPatterns.add(troy);
        listOfPatterns.add(verve);
        listOfPatterns.add(mastercard);
        listOfPatterns.add(himyan);
        listOfPatterns.add(visa);
        listOfPatterns.add(unionPay);
        return listOfPatterns;
    }
}
