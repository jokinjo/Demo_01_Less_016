package com.example.demo_01_less_016;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String textN = "";
    String textP = "";

    public void buttonIsClicked(View buttonView) {
        TextView edtName = findViewById(R.id.edtName);
        textN = edtName.getText().toString();

        EditText edtPhone = findViewById(R.id.edtPhone);
        textP = edtPhone.getText().toString();

        Log.i(TAG, "buttonIsClicked - Name is: " + textN + "  Phone is: " + textP);
    }

}
