package com.hci.lab430.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hci.lab430.testnewfeatures.R;

/**
 * Created by lab430 on 15/9/22.
 */
public class CalendarListRowView extends RelativeLayout {

    private TextView weekDay_textView;
    private TextView date_textView;

    public CalendarListRowView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.list_item_view, this, true);

        weekDay_textView = (TextView)findViewById(R.id.weekDay);
        date_textView = (TextView)findViewById(R.id.date);
    }

    public void setWeekDay(String weekDay) {
        weekDay_textView.setText(weekDay);
    }

    public void setDate(String date) {
        date_textView.setText(date);
    }

}
