package com.pkorver.clickercounter;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TenSecondClickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten_second_clicker);
    }

    TextView countDown = findViewById(R.id.countDown);

    CountDownTimer tenSecTimer = new CountDownTimer(10000, 1000) {

        public void onTick(long millisUntilFinished) {
            countDown.setText("seconds remaining: " + millisUntilFinished / 1000);
        }
        TextView textView = findViewById(R.id.countDown);

        public void onFinish() {
            countDown.setText("done!");
        }
    }.start();

}
