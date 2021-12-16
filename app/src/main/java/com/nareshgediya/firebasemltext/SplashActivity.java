package com.nareshgediya.firebasemltext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView tv = findViewById(R.id.tv);


        Animation a = AnimationUtils.loadAnimation(this, R.anim.ani);
        a.reset();
        tv.clearAnimation();
        tv.startAnimation(a);


      Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Write whatever to want to do after delay specified (3 sec)
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
             overridePendingTransition(R.anim.bottomin,R.anim.bottomout);
             finish();
            }
        }, 3000);


    }
}