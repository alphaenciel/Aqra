package com.alpha.aqra;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton i;

    private int length = 0;
    private MediaPlayer backSound;
    BackSound stat;
    String status="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**status=stat.getStatus();
        if(status==""){
            backSound = MediaPlayer.create(getApplicationContext(), R.raw.intro);
            //backSound.setLooping(true);
            backSound.start();
        }**/
        backSound = MediaPlayer.create(getApplicationContext(), R.raw.intro);
        backSound.setLooping(true);
        backSound.start();


    }

    public void pauseMusic()
    {
       if(backSound.isPlaying())
        {
            backSound.pause();
            length=backSound.getCurrentPosition();
        }
    }
    public void resumeMusic()
    {
        if(backSound.isPlaying()==false)
        {
            backSound.seekTo(length);
            backSound.start();
        }
    }

    public void stopMusic()
    {
        backSound.stop();
        backSound.release();
        backSound = null;
    }

    @Override
    public void onBackPressed() {
        exit();
    }

    public void onButtonHomeClick(View v) {
        if (v.getId() == R.id.informasi) {
            pauseMusic();
            Intent i = new Intent(MainActivity.this, Informasi.class);
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            //stat.setStatus("playing");
        } else if (v.getId() == R.id.pengaturan) {
            pauseMusic();
            Intent i = new Intent(MainActivity.this, Pengaturan.class);
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            //stat.setStatus("playing");
        } else if (v.getId() == R.id.pelafalan) {
            stopMusic();
            Intent i = new Intent(MainActivity.this, Pelafalan.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        } else if (v.getId() == R.id.menu_latihan) {
            stopMusic();
            Intent i = new Intent(MainActivity.this, latihanPelafalan.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        } else if (v.getId() == R.id.metodeIqro) {
            stopMusic();
            Intent i = new Intent(MainActivity.this, MetodeIqro.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }
    }

    private void exit() {
        pauseMusic();
        ExitDialog exitDialog = new ExitDialog(this);
        exitDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        exitDialog.show();
    }
}
