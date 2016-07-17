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
    SoundIqro1 SI1;


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
            SI1.SoundPlayer1(this,R.raw.iqro1_a);
            SI1.SoundPlayer2(this,R.raw.iqro1_ain);
            SI1.SoundPlayer3(this,R.raw.iqro1_ba);
            SI1.SoundPlayer4(this,R.raw.iqro1_da);
            SI1.SoundPlayer5(this,R.raw.iqro1_dho);
            SI1.SoundPlayer6(this,R.raw.iqro1_dza);
            SI1.SoundPlayer7(this,R.raw.iqro1_fa);
            SI1.SoundPlayer8(this,R.raw.iqro1_gho);
            SI1.SoundPlayer9(this,R.raw.iqro1_ha);
            SI1.SoundPlayer10(this,R.raw.iqro1_ho);
            SI1.SoundPlayer11(this,R.raw.iqro1_jai);
            SI1.SoundPlayer12(this,R.raw.iqro1_ka);
            SI1.SoundPlayer13(this,R.raw.iqro1_kha);
            SI1.SoundPlayer14(this,R.raw.iqro1_la);
            SI1.SoundPlayer15(this,R.raw.iqro1_ma);
            SI1.SoundPlayer16(this,R.raw.iqro1_na);
            SI1.SoundPlayer17(this,R.raw.iqro1_qo);
            SI1.SoundPlayer18(this,R.raw.iqro1_ro);
            SI1.SoundPlayer19(this,R.raw.iqro1_sa);
            SI1.SoundPlayer20(this,R.raw.iqro1_sya);
            SI1.SoundPlayer21(this,R.raw.iqro1_syo);
            SI1.SoundPlayer22(this,R.raw.iqro1_ta);
            SI1.SoundPlayer23(this,R.raw.iqro1_tho);
            SI1.SoundPlayer24(this,R.raw.iqro1_to);
            SI1.SoundPlayer25(this,R.raw.iqro1_tsa);
            SI1.SoundPlayer26(this,R.raw.iqro1_ya);
            SI1.SoundPlayer27(this,R.raw.iqro1_za);
            SI1.SoundPlayer28(this,R.raw.sp_26);
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
