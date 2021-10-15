package com.example.th2_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button getData = (Button) findViewById(R.id.btnQuab);
        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityA.this, ActivityB.class);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Hellu Android! I am Thiện");
                intent.setAction("android.intent.action.SEND");
                startActivity(intent);
            }
        });
    }
}