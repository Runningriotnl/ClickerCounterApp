package com.pkorver.clickercounter;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TenSecondClickerActivity extends AppCompatActivity {

    TextView counterValue;
    TextView countDownTimer;
    TextView highScore;
    int highScoreInt = 0;
    int counter = 0; // Counter starts at 0
    long timeLeft = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten_second_clicker);

        counterValue = (TextView) findViewById(R.id.value);
        countDownTimer = (TextView) findViewById(R.id.countDown);
        highScore = (TextView) findViewById(R.id.highScore);
    }


    public void screenTapped(View view) {
        if(timeLeft > 0)
        counter++;
        counterValue.setText(Integer.toString(counter));
    }

    //Declare timer
    CountDownTimer cTimer = null;

    //start timer function
    public void startTimer(View view) {
        counter = 0;
        counterValue.setText("0");
        cTimer = new CountDownTimer(10000, 1000) {
            public void onTick(long millisUntilFinished) {
                countDownTimer.setText(Long.toString(millisUntilFinished / 1000));
                timeLeft = millisUntilFinished;
            }
            public void onFinish() {
                countDownTimer.setText("0");
                timeLeft = 0;
                if(counter > highScoreInt){
                    highScore.setText("High Score :" + Integer.toString(counter));
                    highScoreInt = counter;
                }
            }
        };
        cTimer.start();
    }


    //cancel timer
    void cancelTimer() {
        if(cTimer!=null)
            cTimer.cancel();
    }

}
