package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int number=0;
    public void increment(View view){
        number++;
        String formatted = String.format("%04d", number);
        display(formatted);
    }
    public void display(String formatted) {
        TextView scoreView = (TextView) findViewById(R.id.counter);
        scoreView.setText(String.valueOf(formatted));
    }
}