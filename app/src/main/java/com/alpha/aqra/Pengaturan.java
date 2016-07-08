package com.alpha.aqra;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;

public class Pengaturan extends AppCompatActivity {

    private SeekBar mediaVlmSeekBar;
    private AudioManager audioManager;

    public  int maxVolume=0;
    public int curVolume;

    Intent i;

    public int getCurVolume() {
        return curVolume;
    }

    public void setCurVolume(int curVolume) {
        this.curVolume = curVolume;
    }

    BackSound backSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        setContentView(R.layout.activity_pengaturan);
        mediaVlmSeekBar = (SeekBar)findViewById(R.id.seekBar1);
        initControls();
    }

    @Override
    protected  void onPause(){
        super.onPause();
        if(i != null){

        }else
            backSound.player.pause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        backSound.player.seekTo(backSound.player.getCurrentPosition());
        backSound.player.start();
    }

    public void onButtonPengaturanClick(View v){
        if(v.getId() == R.id.back_pengaturan) {
            i = new Intent(Pengaturan.this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            finish();
        }
    }
    public void onBackPressed() {

    }

    private void initControls() {
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        maxVolume = 100;
        mediaVlmSeekBar.setMax(maxVolume);
        mediaVlmSeekBar.setProgress(backSound.getCurrVolume());
        mediaVlmSeekBar
                .setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onStopTrackingTouch(SeekBar arg0) {
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar arg0) {

                    }

                    @Override
                    public void onProgressChanged(SeekBar arg0, int arg1,
                                                  boolean arg2) {
                        //audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, arg1, 0);
                        setCurVolume(arg1);
                        float log1=(float)(Math.log(maxVolume-arg1)/Math.log(maxVolume));
                        backSound.player.setVolume(1-log1,1-log1);
                    }
                });

    }
}
