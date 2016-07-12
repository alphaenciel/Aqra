package com.alpha.aqra;

import android.app.Activity;
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
    private SeekBar iqroVlmSeekBar;

    public  int maxVolume=0;
    public int curMusicVolume;
    public int curIqroVolume;

    Intent i;
    SoundIqro1 iqro1;
    SoundIqro2 iqro2;

    public int getCurMusicVolume() {
        return curMusicVolume;
    }

    public void setCurMusicVolume(int curVolume) {

        this.curMusicVolume = curVolume;
    }

    public int getCurIqroVolume() {
        return curIqroVolume;
    }

    public void setCurIqroVolume(int curIqroVolume) {
        this.curIqroVolume = curIqroVolume;
    }

    BackSound backSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        setContentView(R.layout.activity_pengaturan);
        mediaVlmSeekBar = (SeekBar)findViewById(R.id.seekBar1);
        iqroVlmSeekBar = (SeekBar)findViewById(R.id.seekBar2);
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
            setCurMusicVolume(mediaVlmSeekBar.getProgress());
            SharedPreferences sp = getSharedPreferences("music_prefs", Activity.MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("music_int_key", getCurMusicVolume());
            editor.commit();

            setCurIqroVolume(iqroVlmSeekBar.getProgress());
            SharedPreferences spiqro = getSharedPreferences("iqro_prefs", Activity.MODE_PRIVATE);
            SharedPreferences.Editor editor1 = spiqro.edit();
            editor1.putInt("iqro_int_key", getCurIqroVolume());
            editor1.commit();
            iqro1.setVolume(getCurIqroVolume());
            iqro2.setVolume(getCurIqroVolume());

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
        SharedPreferences spmusic = getSharedPreferences("music_prefs", Activity.MODE_PRIVATE);
        int musicIntValue = spmusic.getInt("music_int_key", -1);

        SharedPreferences spiqro = getSharedPreferences("iqro_prefs", Activity.MODE_PRIVATE);
        int iqroIntValue = spiqro.getInt("iqro_int_key", -1);

        maxVolume = 100;

        mediaVlmSeekBar.setMax(maxVolume);
        iqroVlmSeekBar.setMax(maxVolume);

        mediaVlmSeekBar.setProgress(musicIntValue);
        iqroVlmSeekBar.setProgress(iqroIntValue);
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
                        float log1=(float)(Math.log(maxVolume-arg1)/Math.log(maxVolume));
                        backSound.player.setVolume(1-log1,1-log1);
                    }
                });
    }
}
