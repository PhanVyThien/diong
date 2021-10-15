package com.example.app_7;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b3=(Button) findViewById(R.id.btnPM);
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,MainActivity_Table.class);
                startActivity(it);
            }
        });
        Button b7=(Button) findViewById(R.id.btnLL);
        b7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,MainActivity_Span.class);
                startActivity(it);
            }
        });
    }
}