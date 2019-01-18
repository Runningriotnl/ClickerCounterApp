package com.pkorver.clickercounter;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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

    public void countReset(View view) {
        // Ask for confirmation
        createDialog();
    }

    private void createDialog() {
        // Dialog to ask for confirmation on reset
        AlertDialog.Builder resetDialog = new AlertDialog.Builder(this);
        resetDialog.setMessage("Are you sure you want to reset the counter?");
        // No cancel button, just yes or no
        resetDialog.setCancelable(false);
        resetDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Resets the counter to 0 if positive
                counter = 0;
                counterValue.setText(Integer.toString(counter));
            }
        });

        resetDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        resetDialog.create().show();

    }

    //Increases count if screen is touched
    public void screenTapped(View view) {
        counter++;
        counterValue.setText(Integer.toString(counter));
    }

    public void goToChallenge(View view) {
        Intent intent = new Intent(MainActivity.this, TenSecondClickerActivity.class);
        startActivity(intent);

    }
}
