package com.example.user.brad07;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private Button left, right;
    private TextView clock;
    private boolean isRunning;
    private int Counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        left = (Button)findViewById(R.id.btnLeft);
        right = (Button)findViewById(R.id.btnRight);
        clock = (TextView)findViewById(R.id.timer);

    }
    public void doLeft(View v){

    }
    public void doRight(View v){
        isRunning = !isRunning;
        right.setText(isRunning?"Stop":"Start");
        left.setText(isRunning?"Lap":"Reset");

        if (isRunning){
            doStart();
        }else{
            doStop();
        }
    }
    private void doStart(){

    }
    private void doStop(){

    }
    private void doReset(){

    }
    private void doLap(){

    }

    private class ClockTask extends TimerTask {
        @Override
        public void run() {
            Counter++;
        }
    }
    private class UIHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            clock.setText("" + Counter);
        }
    }

}
