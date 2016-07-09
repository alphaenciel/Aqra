package com.alpha.aqra;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class IntroActivity extends AppCompatActivity {

    //Set Lama waktu splash screen
    private static int splashInterval = 4000;
    private ImageView intro;

    BackSound stat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences sp = getSharedPreferences("your_prefs", Activity.MODE_PRIVATE);
        int myIntValue = sp.getInt("your_int_key", -1);
        stat.setCurrVolume(myIntValue);
        stat.SoundPlayer(this,R.raw.intro);
        setContentView(R.layout.activity_intro);

        intro = (ImageView) findViewById(R.id.logo);

        intro.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) intro.getBackground()).start();
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //TODO Auto-generated method stub
                Intent i = new Intent(IntroActivity.this,MainActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();

                //Jeda Selesai Splash Screen
                this.finish();
            }

            private void finish(){

            }
        },splashInterval);
    }
}
