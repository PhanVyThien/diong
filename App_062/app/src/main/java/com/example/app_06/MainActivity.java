package com.example.app_06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    int dem=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hahi);
        final ImageButton ib=(ImageButton)findViewById(R.id.imgMain);
        Animation fadin=AnimationUtils.loadAnimation(this,R.anim.fadein);
        ib.startAnimation(fadin);

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dem=(dem+1)%3;
                switch (dem){
                    case 0:
                        ib.setImageResource(R.drawable.ic_launcher_background);
                        break;
                    case 1:
                        ib.setImageResource(R.drawable.lasao);
                        break;
                    case 2:
                        ib.setImageResource(R.drawable.hinh);
                        break;
                }
            }
        });





    }
}