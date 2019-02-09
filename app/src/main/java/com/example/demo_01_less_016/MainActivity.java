package com.example.demo_01_less_016;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonIsClicked(View buttonView) {
        String text = "";
        EditText edtName = findViewById(R.id.edtName);
        text = edtName.getText().toString();

        Log.i(TAG, "buttonIsClicked: Name is " + text);
    }

}
