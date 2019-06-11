package com.example.ieconomy.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created on 07.06.2019.
 *
 * @authot Julia Savicheva
 */
public class MoneyView extends TextView {

    public MoneyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setMoney(100500);
    }

    public void setMoney(Integer moneyCount) {
        setText(Html.fromHtml(moneyCount.toString()), TextView.BufferType.SPANNABLE);
    }

}
