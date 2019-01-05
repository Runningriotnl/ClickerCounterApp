package com.pkorver.clickercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView counterValue;
    int counter = 0; // Counter starts at 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterValue = (TextView) findViewById(R.id.value);

    }

    public void countIncrease(View view) {
        // On each click the counter will increase 1 point
        counter++;
        counterValue.setText(Integer.toString(counter));
    }

    public void countDecrease(View v) {
        // On each click remove 1 point from counter
        counter--;
        counterValue.setText(Integer.toString(counter));
    }

    //Does not do what I want it to do yet
    public boolean onTouch(MotionEvent e) {
        counter++;
        counterValue.setText(Integer.toString(counter));
        return true;
    }
}
