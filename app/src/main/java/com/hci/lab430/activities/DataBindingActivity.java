package com.hci.lab430.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import com.hci.lab430.model.ObservableUser1;
import com.hci.lab430.testnewfeatures.R;
import com.hci.lab430.testnewfeatures.databinding.MainActivityBinding;

public class DataBindingActivity extends AppCompatActivity {

    public final static String debugTag = "mainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //This is a new feature proposed in Google I/O 2015
        //Data Binding Mechanism can make the application seem more clear
        //More concentrate on business logic
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        final ObservableUser1 user = new ObservableUser1("test","qq");
        binding.setUserA(user);
        binding.firstNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
                Log.d(debugTag, "before:" + charSequence.toString() + ",s:" + start + ",c:" + count + ",a:" + after);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                Log.d(debugTag, "onText:" + charSequence.toString() + ",s:" + start + ",b:" + before + ",c:" + count);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Log.d(debugTag, "after:" + editable.toString());
                user.setFirstName(editable.toString());
            }
        });
    }

}
