package com.alpha.aqra;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Informasi extends AppCompatActivity {

    TextView info;
    //BackSound backSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);
    }

    @Override
    public void onBackPressed() {

    }

    public void onButtonInformasiClick(View v){
        if(v.getId() == R.id.back_informasi){
            Intent i = new Intent(Informasi.this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            finish();
        }
    }
}
