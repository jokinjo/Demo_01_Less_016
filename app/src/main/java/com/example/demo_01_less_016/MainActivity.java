package com.example.demo_01_less_016;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String text = "";

    public void buttonIsClicked(View buttonView) {
        TextView txt = findViewById(R.id.txt);
        text = txt.getText().toString();

        Log.i(TAG, "buttonIsClicked: txt is " + text);
    }

}
