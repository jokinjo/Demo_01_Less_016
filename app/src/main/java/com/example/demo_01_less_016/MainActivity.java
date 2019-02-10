package com.example.demo_01_less_016;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    CharSequence textN;
    CharSequence textP;
    String msg;

    public void buttonIsClicked(View buttonView) {
        TextView edtName = findViewById(R.id.edtName);
        textN = edtName.getText().toString();

        EditText edtPhone = findViewById(R.id.edtPhone);
        textP = edtPhone.getText();


        Context context = MainActivity.this;
        Toast toastN = null;
        Toast toastP = null;

        toastN = toastN.makeText(context, textN, Toast.LENGTH_SHORT);
        toastN.setGravity(Gravity.TOP, 0, 700);       //yOffset = [(420dpi / 1920px) * 5.5in]^-1 * 420dpi * yInches_to_offset
        toastN.show();

        toastP = toastP.makeText(context, textP, Toast.LENGTH_SHORT);
        toastP.setGravity(Gravity.TOP, 0, 875);
        toastP.show();

    }

}
