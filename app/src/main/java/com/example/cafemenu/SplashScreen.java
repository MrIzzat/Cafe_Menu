package com.example.cafemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private Animation topLeft,bottomRight;

    private ImageView imgLogo;
    private TextView txtLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        setupViews();

        topLeft= AnimationUtils.loadAnimation(this,R.anim.topleft_animation);
        bottomRight = AnimationUtils.loadAnimation(this,R.anim.bottomright_animation);



        imgLogo.setAnimation(topLeft);
        txtLogo.setAnimation(bottomRight);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);

    }

    private void setupViews() {
        imgLogo = findViewById(R.id.imgLogo);
        txtLogo = findViewById(R.id.txtLogo);
    }
}