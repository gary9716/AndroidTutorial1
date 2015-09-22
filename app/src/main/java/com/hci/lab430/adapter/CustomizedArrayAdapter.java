package com.hci.lab430.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.hci.lab430.model.CalendarTime;
import com.hci.lab430.view.CalendarListRowView;

import java.util.List;

/**
 * Created by lab430 on 15/9/22.
 */
public class CustomizedArrayAdapter extends ArrayAdapter<CalendarTime> {

    public CustomizedArrayAdapter(Context context, int listItemRes, List<CalendarTime> items) {
        super(context, listItemRes, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CalendarTime item = getItem(position);

        //only generate object at first time.
        //reuse them after generated
        if(convertView == null) {
            convertView = new CalendarListRowView(parent.getContext());
        }

        CalendarListRowView itemView = (CalendarListRowView)convertView;
        itemView.setDate(item.getDate());
        itemView.setWeekDay(item.getWeekDay());

        return convertView;
    }
}
