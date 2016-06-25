package com.alpha.aqra;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;

public class Pengaturan extends AppCompatActivity {

    private SeekBar mediaVlmSeekBar;
    private AudioManager audioManager;

    public  int maxVolume=0;
    public int curVolume=0;

    //BackSound backSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        setContentView(R.layout.activity_pengaturan);
        mediaVlmSeekBar = (SeekBar)findViewById(R.id.seekBar1);
        initControls();
    }

    public void onButtonPengaturanClick(View v){
        if(v.getId() == R.id.back_pengaturan) {
            Intent i = new Intent(Pengaturan.this, MainActivity.class);
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
        maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        mediaVlmSeekBar.setMax(maxVolume);
        mediaVlmSeekBar.setProgress(curVolume);
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
                        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,
                                arg1, 0);
                    }
                });



/*
        //int originalVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

//Return the handle to a system-level service - 'AUDIO'.
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//Find the seekbar 1
        mediaVlmSeekBar = (SeekBar) findViewById(R.id.seekBar1);
//Set the max range(Volume in this case) of seekbar
//for Media player volume
        mediaVlmSeekBar.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
//Set the progress with current Media Volume
        mediaVlmSeekBar.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));


        try {
            //Listener to receive changes to the SeekBar1's progress level
            mediaVlmSeekBar
                    .setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                        public void onStopTrackingTouch(SeekBar arg0) {
                        }

                        public void onStartTrackingTouch(SeekBar arg0) {
                        }
                        //When progress level of seekbar1 is changed
                        public void onProgressChanged(SeekBar arg0,
                                                      int progress, boolean arg2) {
                            audioManager.setStreamVolume(
                                    AudioManager.STREAM_MUSIC, progress, 0);
                        }
                    });

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
