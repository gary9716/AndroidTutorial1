package com.hci.lab430.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hci.lab430.model.ProjectConfig;
import com.hci.lab430.testnewfeatures.R;

/**
 * Created by lab430 on 15/9/22.
 */
public class TestActivity extends AppCompatActivity {

    public final static String debug_tag = TestActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Log.d(debug_tag,"onCreate ," + debug_tag);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(debug_tag, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(debug_tag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(debug_tag, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(debug_tag, "onStop");
    }

}
