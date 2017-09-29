package com.example.administrator.countdowntimerbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CountDownTimerButton countDownTimerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countDownTimerButton = (CountDownTimerButton) findViewById(R.id.btn);
        countDownTimerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimerButton.startCountDown();
            }
        });
    }
}
