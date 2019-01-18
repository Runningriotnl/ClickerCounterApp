package com.pkorver.clickercounter;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TenSecondClickerActivity extends AppCompatActivity {

    TextView counterValue;
    int counter = 0; // Counter starts at 0\


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten_second_clicker);

        counterValue = (TextView) findViewById(R.id.value);
    }

    //TextView countDown = findViewById(R.id.countDown);

//    CountDownTimer tenSecTimer = new CountDownTimer(10000, 1000) {
//        TextView countDown = findViewById(R.id.countDown);
//        public void onTick(long millisUntilFinished) {
//            countDown.setText("seconds remaining: " + millisUntilFinished / 1000);
//        }
//        TextView textView = findViewById(R.id.countDown);
//
//        public void onFinish() {
//            countDown.setText("done!");
//        }
//    }.start();

    public void screenTapped(View view) {
        counter++;
        counterValue.setText(Integer.toString(counter));
    }


}
