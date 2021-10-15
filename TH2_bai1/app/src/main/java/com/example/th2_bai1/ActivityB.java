package com.example.th2_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        TextView txtView = findViewById(R.id.txtView);
        Intent intent = getIntent();
        if(intent!=null){
            String action = intent.getAction();
            String type = intent.getType();
            if((Intent.ACTION_SEND.equals(action)) && ("text/plain".equals(type))){
                txtView.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
            }
            else{
                txtView.setText("intent is null");
            }
        }
    }
}