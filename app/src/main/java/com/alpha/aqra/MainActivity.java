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

    private int length = 0;
    Intent i;
    BackSound stat;
    String status="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(stat.player.getCurrentPosition() == 0){
            stat.player.start();
        }
    }


    @Override
    protected  void onPause(){
        super.onPause();
        if(i != null){

        }else
            stat.player.pause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        stat.player.seekTo(stat.player.getCurrentPosition());
        stat.player.start();
    }

    @Override
    public void onBackPressed() {
        exit();
    }

    public void onButtonHomeClick(View v) {
        if (v.getId() == R.id.informasi) {
             i = new Intent(MainActivity.this, Informasi.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        } else if (v.getId() == R.id.pengaturan) {
             i = new Intent(MainActivity.this, Pengaturan.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        } else if (v.getId() == R.id.pelafalan) {
            stat.player.stop();
            stat.player.release();
             i = new Intent(MainActivity.this, Pelafalan.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        } else if (v.getId() == R.id.menu_latihan) {
            stat.player.stop();
            stat.player.release();
             i = new Intent(MainActivity.this, latihanPelafalan.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        } else if (v.getId() == R.id.metodeIqro) {
            stat.player.stop();
            stat.player.release();
             i = new Intent(MainActivity.this, MetodeIqro.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }
    }

    private void exit() {
        ExitDialog exitDialog = new ExitDialog(this);
        exitDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        exitDialog.show();
    }
}
