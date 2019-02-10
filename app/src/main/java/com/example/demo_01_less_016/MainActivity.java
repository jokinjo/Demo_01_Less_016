package com.example.demo_01_less_016;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_mastery);
    }

//    CharSequence textN;
//    CharSequence textP;
//    String msg;
//    Integer intCount = 0;
//    Integer resId = 0;
//    Integer caseNo = 0;
//    Context mContext = MainActivity.this;
//
////    ImageView imgView = null;   // WHY cannot these two lines be above the method scope?
////    imgView = (ImageView) findViewById(R.id.imgView);
//
//    public void buttonIsClicked(View buttonView) {
//
//        ImageView imgView = null;   // WHY cannot these two lines be above the method scope?
//        imgView = (ImageView) findViewById(R.id.imgView);
//
//        caseNo = intCount++ % 3;
//
//        switch (caseNo) {
//            case 0: resId = (R.drawable.lion);  break;
//            case 1: resId = (R.drawable.tiger);  break;
//            case 2: resId = (R.drawable.bear);  break;
//            default: Toast.makeText(mContext, "caseNo > 2", Toast.LENGTH_SHORT).show();
//        }
//        imgView.setImageResource(resId);
//    }

}
