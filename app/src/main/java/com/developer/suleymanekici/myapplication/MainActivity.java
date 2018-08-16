package com.developer.suleymanekici.myapplication;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Kalan Süre: " + l / 1000);
            }

            @Override
            public void onFinish() {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Kalan Süre: 0");
                Toast.makeText(getApplicationContext(),"Süren Doldu!", Toast.LENGTH_LONG).show();
            }
        }.start();
    }
}
