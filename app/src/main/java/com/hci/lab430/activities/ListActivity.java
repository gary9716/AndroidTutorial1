package com.hci.lab430.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.hci.lab430.adapter.CustomizedArrayAdapter;
import com.hci.lab430.model.CalendarTime;
import com.hci.lab430.model.TestData;
import com.hci.lab430.testnewfeatures.R;

import java.util.ArrayList;

/**
 * Created by lab430 on 15/9/22.
 */
public class ListActivity extends AppCompatActivity {

    ArrayList<CalendarTime> calendarItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set up testing data
        calendarItems = new ArrayList<>();
        for(int i = 0;i < TestData.weekDays.length;i++) {
            CalendarTime item = new CalendarTime(
                    TestData.weekDays[i],
                    TestData.dates[i]);
            calendarItems.add(item);
        }

        setupView();

    }

    private void setupView() {
        setContentView(R.layout.complex_listview_activity);
        ListView listView = (ListView)findViewById(R.id.CalendarListView);
        CustomizedArrayAdapter adapter = new CustomizedArrayAdapter(
                this,
                R.layout.list_item_view,
                calendarItems);
        listView.setAdapter(adapter);
    }
}
