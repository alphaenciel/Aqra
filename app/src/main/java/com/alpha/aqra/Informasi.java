package com.alpha.aqra;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Informasi extends AppCompatActivity {

    TextView info;
    Intent i;
    WebView textJust;
    BackSound backSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);
        //textJust=(WebView)findViewById(R.id.webView);
        //.loadUrl("file:///android_asset/textInformasi.html");
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

    @Override
    public void onBackPressed() {

    }

    public void onButtonInformasiClick(View v){
        if(v.getId() == R.id.back_informasi){
            i = new Intent(Informasi.this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            finish();
        }
    }
}
