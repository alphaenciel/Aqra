package com.alpha.aqra;

import android.app.Activity;
import android.app.Dialog;
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

    int musicIntValue=0, iqroIntValue=0;

    BackSound stat;
    SoundIqro1 iqro1;
    SoundIqro2 iqro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences spmusic = getSharedPreferences("music_prefs", Activity.MODE_PRIVATE);
        musicIntValue = spmusic.getInt("music_int_key",-1);
        if(musicIntValue == -1){
            SharedPreferences.Editor editor = spmusic.edit();
            editor.putInt("music_int_key",99);
            editor.commit();
        }

        SharedPreferences spiqro = getSharedPreferences("iqro_prefs", Activity.MODE_PRIVATE);
        iqroIntValue = spiqro.getInt("iqro_int_key", -1);
        if(iqroIntValue == -1){
            SharedPreferences.Editor editor = spiqro.edit();
            editor.putInt("iqro_int_key",99);
            editor.commit();
        }

        stat.setCurrVolume(musicIntValue);
        iqro1.setVolume(iqroIntValue);
        iqro2.setVolume(iqroIntValue);
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
