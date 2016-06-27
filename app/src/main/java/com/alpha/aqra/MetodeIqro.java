package com.alpha.aqra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MetodeIqro extends AppCompatActivity {

    BackSound stat;
    SoundIqro1 SI1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_iqro);
    }

    public void onCLickIqro(View v){
        if(v.getId() == R.id.btn_iqro1){
            stat.SoundPlayer(this,R.raw.intro);
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
            Intent i = new Intent(MetodeIqro.this,MetodeIqro1.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }else if(v.getId() == R.id.btn_iqro2){
            stat.SoundPlayer(this,R.raw.intro);
            Intent i = new Intent(MetodeIqro.this,Plan2Iqro2.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }else if(v.getId() == R.id.btn_home_iqro){
            stat.SoundPlayer(this,R.raw.intro);
            Intent i = new Intent(MetodeIqro.this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
            //stat.setStatus("");
        }
    }

    @Override
    public void onBackPressed() {

        Intent i = new Intent(MetodeIqro.this,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}
