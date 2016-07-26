package com.alpha.aqra;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Pelafalan extends AppCompatActivity {

    ImageView selectedImg;
    ImageView hijayahBesar;
    ImageButton btn_auto,btn_sound;
    ImageButton arrowL, arrowR;
    BackSound stat;
    SoundIqro1 sp;

    Handler h = new Handler();
    int delay = 1000; //milliseconds
    int stop = 0;
    int autoClicked = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelafalan);
        hijayahBesar = (ImageView) findViewById(R.id.pelafalan_hijayah);
        selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_a);
        btn_auto=(ImageButton)findViewById(R.id.pelafalan_btn_automatic);
        btn_sound=(ImageButton)findViewById(R.id.pelafalan_btn_sound);
        arrowL=(ImageButton)findViewById(R.id.pelafalan_arrowL);
        arrowR=(ImageButton)findViewById(R.id.pelafalan_arrowR);
        selectedImg.setBackgroundResource(R.drawable.hijayah_orange_a);
        sp.sound_a.start();

        arrowR.setVisibility(View.GONE);
    }

    @Override
    public void onBackPressed() {

        SharedPreferences spiqro = getSharedPreferences("iqro_prefs", Activity.MODE_PRIVATE);
        SharedPreferences sptemp = getSharedPreferences("temp_sound_prefs", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor1 = spiqro.edit();
        editor1.putInt("iqro_int_key",sptemp.getInt("music_temp_int_key", -1));
        editor1.commit();
        stat.SoundPlayer(this,R.raw.intro);
        Intent i = new Intent(Pelafalan.this,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
        //stat.setStatus("");
        sp.sound_a.stop();sp.sound_a.release();
        sp.sound_ain.stop();sp.sound_ain.release();
        sp.sound_ba.stop();sp.sound_ba.release();
        sp.sound_da.stop();sp.sound_da.release();
        sp.sound_dho.stop();sp.sound_dho.release();
        sp.sound_dza.stop();sp.sound_dza.release();
        sp.sound_fa.stop();sp.sound_fa.release();
        sp.sound_gho.stop();sp.sound_gho.release();
        sp.sound_ha.stop();sp.sound_ha.release();
        sp.sound_ho.stop();sp.sound_ho.release();
        sp.sound_jai.stop();sp.sound_jai.release();
        sp.sound_ka.stop();sp.sound_ka.release();
        sp.sound_kha.stop();sp.sound_kha.release();
        sp.sound_la.stop();sp.sound_la.release();
        sp.sound_ma.stop();sp.sound_ma.release();
        sp.sound_na.stop();sp.sound_na.release();
        sp.sound_qo.stop();sp.sound_qo.release();
        sp.sound_ro.stop();sp.sound_ro.release();
        sp.sound_sa.stop();sp.sound_sa.release();
        sp.sound_sya.stop();sp.sound_sya.release();
        sp.sound_syo.stop();sp.sound_syo.release();
        sp.sound_ta.stop();sp.sound_ta.release();
        sp.sound_tho.stop();sp.sound_tho.release();
        sp.sound_to.stop();sp.sound_to.release();
        sp.sound_tsa.stop();sp.sound_tsa.release();
        sp.sound_ya.stop();sp.sound_ya.release();
        sp.sound_za.stop();sp.sound_za.release();
        sp.sound_wa.stop();sp.sound_wa.release();
    }
    public void OnButtonPelafalanBack(View v){
        if(v.getId() == R.id.pelafalan_btn_home){
            SharedPreferences spiqro = getSharedPreferences("iqro_prefs", Activity.MODE_PRIVATE);
            SharedPreferences sptemp = getSharedPreferences("temp_sound_prefs", Activity.MODE_PRIVATE);
            SharedPreferences.Editor editor1 = spiqro.edit();
            editor1.putInt("iqro_int_key",sptemp.getInt("music_temp_int_key", -1));
            editor1.commit();
            stat.SoundPlayer(this,R.raw.intro);
            Intent i = new Intent(Pelafalan.this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
            //stat.setStatus("");
            sp.sound_a.stop();sp.sound_a.release();
            sp.sound_ain.stop();sp.sound_ain.release();
            sp.sound_ba.stop();sp.sound_ba.release();
            sp.sound_da.stop();sp.sound_da.release();
            sp.sound_dho.stop();sp.sound_dho.release();
            sp.sound_dza.stop();sp.sound_dza.release();
            sp.sound_fa.stop();sp.sound_fa.release();
            sp.sound_gho.stop();sp.sound_gho.release();
            sp.sound_ha.stop();sp.sound_ha.release();
            sp.sound_ho.stop();sp.sound_ho.release();
            sp.sound_jai.stop();sp.sound_jai.release();
            sp.sound_ka.stop();sp.sound_ka.release();
            sp.sound_kha.stop();sp.sound_kha.release();
            sp.sound_la.stop();sp.sound_la.release();
            sp.sound_ma.stop();sp.sound_ma.release();
            sp.sound_na.stop();sp.sound_na.release();
            sp.sound_qo.stop();sp.sound_qo.release();
            sp.sound_ro.stop();sp.sound_ro.release();
            sp.sound_sa.stop();sp.sound_sa.release();
            sp.sound_sya.stop();sp.sound_sya.release();
            sp.sound_syo.stop();sp.sound_syo.release();
            sp.sound_ta.stop();sp.sound_ta.release();
            sp.sound_tho.stop();sp.sound_tho.release();
            sp.sound_to.stop();sp.sound_to.release();
            sp.sound_tsa.stop();sp.sound_tsa.release();
            sp.sound_ya.stop();sp.sound_ya.release();
            sp.sound_za.stop();sp.sound_za.release();
            sp.sound_wa.stop();sp.sound_wa.release();
        }else if(v.getId() == R.id.pelafalan_btn_sound){
            SharedPreferences spiqro = getSharedPreferences("iqro_prefs", Activity.MODE_PRIVATE);
            int iqroIntValue = spiqro.getInt("iqro_int_key", -1);
            SharedPreferences sptemp = getSharedPreferences("temp_sound_prefs", Activity.MODE_PRIVATE);
            if(iqroIntValue > 1 ){
                btn_sound.setBackgroundResource(R.drawable.btn_mute);
                SharedPreferences.Editor editor = sptemp.edit();
                editor.putInt("music_temp_int_key", iqroIntValue);
                editor.commit();
                SharedPreferences.Editor editor1 = spiqro.edit();
                editor1.putInt("iqro_int_key",1);
                editor1.commit();
            }
            else if(iqroIntValue <= 1 ){
                SharedPreferences.Editor editor1 = spiqro.edit();
                editor1.putInt("iqro_int_key",sptemp.getInt("music_temp_int_key", -1));
                editor1.commit();
                btn_sound.setBackgroundResource(R.drawable.btn_sound);
            }
            iqroIntValue = spiqro.getInt("iqro_int_key", -1);
            float log1= (float) (1-(Math.log(100-iqroIntValue)/Math.log(100)));
            sp = new SoundIqro1();
            sp.setVolumeMute(log1);
            /*sp.sound_a.setVolume(log1,log1);
            sp.sound_ain.setVolume(log1,log1);
            sp.sound_ba.setVolume(log1,log1);
            sp.sound_da.setVolume(log1,log1);
            sp.sound_dho.setVolume(log1,log1);
            sp.sound_dza.setVolume(log1,log1);
            sp.sound_fa.setVolume(log1,log1);
            sp.sound_gho.setVolume(log1,log1);
            sp.sound_ha.setVolume(log1,log1);
            sp.sound_ho.setVolume(log1,log1);
            sp.sound_jai.setVolume(log1,log1);
            sp.sound_ka.setVolume(log1,log1);
            sp.sound_kha.setVolume(log1,log1);
            sp.sound_la.setVolume(log1,log1);
            sp.sound_ma.setVolume(log1,log1);
            sp.sound_na.setVolume(log1,log1);
            sp.sound_qo.setVolume(log1,log1);
            sp.sound_ro.setVolume(log1,log1);
            sp.sound_sa.setVolume(log1,log1);
            sp.sound_sya.setVolume(log1,log1);
            sp.sound_syo.setVolume(log1,log1);
            sp.sound_ta.setVolume(log1,log1);
            sp.sound_tho.setVolume(log1,log1);
            sp.sound_to.setVolume(log1,log1);
            sp.sound_tsa.setVolume(log1,log1);
            sp.sound_ya.setVolume(log1,log1);
            sp.sound_za.setVolume(log1,log1);
            sp.sound_wa.setVolume(log1,log1);*/
        }

    }

    public void onCLickAutoPelafalan(View v){
        if (autoClicked == 0){
            btn_auto.setBackgroundResource(R.drawable.btn_automatic_on);
            autoClicked = 1;
            h.postDelayed(new Runnable(){
                public void run(){
                    //do something
                    goingLeft();
                    h.postDelayed(this, delay);
                }
            }, delay);
        }else{
            btn_auto.setBackgroundResource(R.drawable.btn_automatic);
            autoClicked = 0;
            h.removeCallbacksAndMessages(null);
        }
    }

    public void OnButtonPelafalanArrowRightClick(View v){
        if(autoClicked != 0){
            btn_auto.setBackgroundResource(R.drawable.btn_automatic);
            autoClicked = 0;
            h.removeCallbacksAndMessages(null);
        }
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ba){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ba);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_a);
            selectedImg.setBackgroundResource(R.drawable.a_02);
            hijayahBesar.setBackgroundResource(R.drawable.a_03);
            arrowR.setVisibility(View.GONE);
            sp.sound_a.start();
        }else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ta){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ta);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ba);
            selectedImg.setBackgroundResource(R.drawable.ba_02);
            hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            sp.sound_ba.start();
        }else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_tsa){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_tsa);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ta);
            selectedImg.setBackgroundResource(R.drawable.ta_02);
            hijayahBesar.setBackgroundResource(R.drawable.ta_03);
            sp.sound_ta.start();
        }else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ja){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ja);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_tsa);
            selectedImg.setBackgroundResource(R.drawable.tsa_02);
            hijayahBesar.setBackgroundResource(R.drawable.tsa_03);
            sp.sound_tsa.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ha){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ha);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ja);
            selectedImg.setBackgroundResource(R.drawable.ja_02);
            hijayahBesar.setBackgroundResource(R.drawable.ja_03);
            sp.sound_za.start();
        } else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_kho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_kho);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ha);
            selectedImg.setBackgroundResource(R.drawable.ha_02);
            hijayahBesar.setBackgroundResource(R.drawable.ha_03);
            sp.sound_ha.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_da){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_da);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_kho);
            selectedImg.setBackgroundResource(R.drawable.kho_02);
            hijayahBesar.setBackgroundResource(R.drawable.kho_03);
            sp.sound_ho.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_dza){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_dza);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_da);
            selectedImg.setBackgroundResource(R.drawable.da_02);
            hijayahBesar.setBackgroundResource(R.drawable.da_03);
            sp.sound_da.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ro){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ro);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_dza);
            selectedImg.setBackgroundResource(R.drawable.dza_02);
            hijayahBesar.setBackgroundResource(R.drawable.dza_03);
            sp.sound_dza.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_za){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_za);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ro);
            selectedImg.setBackgroundResource(R.drawable.ro_02);
            hijayahBesar.setBackgroundResource(R.drawable.ro_03);
            sp.sound_ro.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_sa){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_sa);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_za);
            selectedImg.setBackgroundResource(R.drawable.za_02);
            hijayahBesar.setBackgroundResource(R.drawable.za_03);
            sp.sound_jai.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_sya){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_sya);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_sa);
            selectedImg.setBackgroundResource(R.drawable.sa_02);
            hijayahBesar.setBackgroundResource(R.drawable.sa_03);
            sp.sound_sa.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_sho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_syo);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_sya);
            selectedImg.setBackgroundResource(R.drawable.sya_02);
            hijayahBesar.setBackgroundResource(R.drawable.sya_03);
            sp.sound_sya.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_dho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_dho);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_sho);
            selectedImg.setBackgroundResource(R.drawable.syo_02);
            hijayahBesar.setBackgroundResource(R.drawable.syo_03);
            sp.sound_syo.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_tho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_tho);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_dho);
            selectedImg.setBackgroundResource(R.drawable.dho_02);
            hijayahBesar.setBackgroundResource(R.drawable.dho_03);
            sp.sound_dho.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_zho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_zho);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_tho);
            selectedImg.setBackgroundResource(R.drawable.tho_02);
            hijayahBesar.setBackgroundResource(R.drawable.tho_03);
            sp.sound_to.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ain){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ain);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_zho);
            selectedImg.setBackgroundResource(R.drawable.zho_02);
            hijayahBesar.setBackgroundResource(R.drawable.zho_03);
            sp.sound_tho.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_gho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_gho);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ain);
            selectedImg.setBackgroundResource(R.drawable.ain_02);
            hijayahBesar.setBackgroundResource(R.drawable.ain_03);
            sp.sound_ain.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_fa){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_fa);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_gho);
            selectedImg.setBackgroundResource(R.drawable.gho_02);
            hijayahBesar.setBackgroundResource(R.drawable.gho_03);
            sp.sound_gho.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_qo){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_qo);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_fa);
            selectedImg.setBackgroundResource(R.drawable.fa_02);
            hijayahBesar.setBackgroundResource(R.drawable.fa_03);
            sp.sound_fa.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ka){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ka);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_qo);
            selectedImg.setBackgroundResource(R.drawable.qo_02);
            hijayahBesar.setBackgroundResource(R.drawable.qo_03);
            sp.sound_qo.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_la){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_la);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ka);
            selectedImg.setBackgroundResource(R.drawable.ka_02);
            hijayahBesar.setBackgroundResource(R.drawable.ka_03);
            sp.sound_ka.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ma){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ma);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_la);
            selectedImg.setBackgroundResource(R.drawable.la_02);
            hijayahBesar.setBackgroundResource(R.drawable.la_03);
            sp.sound_la.start();
        }else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_na){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_na);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ma);
            selectedImg.setBackgroundResource(R.drawable.ma_02);
            hijayahBesar.setBackgroundResource(R.drawable.ma_03);
            sp.sound_ma.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_wa){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_wa);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_na);
            selectedImg.setBackgroundResource(R.drawable.na_02);
            hijayahBesar.setBackgroundResource(R.drawable.na_03);
            sp.sound_na.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_haq){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_haq);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_wa);
            selectedImg.setBackgroundResource(R.drawable.wa_02);
            hijayahBesar.setBackgroundResource(R.drawable.wa_03);
            sp.sound_wa.start();
        }else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ya){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ya);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_haq);
            selectedImg.setBackgroundResource(R.drawable.haq_02);
            hijayahBesar.setBackgroundResource(R.drawable.haq_03);
            arrowL.setVisibility(View.VISIBLE);
            sp.sound_kha.start();
        }
    }

    public void OnButtonPelafalanArrowLeftClick(View v){
        if(autoClicked != 0){
            btn_auto.setBackgroundResource(R.drawable.btn_automatic);
            autoClicked = 0;
            h.removeCallbacksAndMessages(null);
        }
        goingLeft();
    }

    public void goingLeft(){
        if(selectedImg.getId() == R.id.pelafalan_hijayah_a){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_a);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ba);
            selectedImg.setBackgroundResource(R.drawable.ba_02);
            hijayahBesar.setBackgroundResource(R.drawable.ba_03);
            arrowR.setVisibility(View.VISIBLE);
            sp.sound_ba.start();
        }else if(selectedImg.getId() == R.id.pelafalan_hijayah_ba){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ba);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ta);
            selectedImg.setBackgroundResource(R.drawable.ta_02);
            hijayahBesar.setBackgroundResource(R.drawable.ta_03);
            sp.sound_ta.start();
        }else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ta){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ta);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_tsa);
            selectedImg.setBackgroundResource(R.drawable.tsa_02);
            hijayahBesar.setBackgroundResource(R.drawable.tsa_03);
            sp.sound_tsa.start();
        }else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_tsa){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_tsa);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ja);
            selectedImg.setBackgroundResource(R.drawable.ja_02);
            hijayahBesar.setBackgroundResource(R.drawable.ja_03);
            sp.sound_za.start();
        }else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ja){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ja);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ha);
            selectedImg.setBackgroundResource(R.drawable.ha_02);
            hijayahBesar.setBackgroundResource(R.drawable.ha_03);
            sp.sound_ha.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ha){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ha);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_kho);
            selectedImg.setBackgroundResource(R.drawable.kho_02);
            hijayahBesar.setBackgroundResource(R.drawable.kho_03);
            sp.sound_ho.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_kho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_kho);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_da);
            selectedImg.setBackgroundResource(R.drawable.da_02);
            hijayahBesar.setBackgroundResource(R.drawable.da_03);
            sp.sound_da.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_da){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_da);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_dza);
            selectedImg.setBackgroundResource(R.drawable.dza_02);
            hijayahBesar.setBackgroundResource(R.drawable.dza_03);
            sp.sound_dza.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_dza){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_dza);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ro);
            selectedImg.setBackgroundResource(R.drawable.ro_02);
            hijayahBesar.setBackgroundResource(R.drawable.ro_03);
            sp.sound_ro.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ro){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ro);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_za);
            selectedImg.setBackgroundResource(R.drawable.za_02);
            hijayahBesar.setBackgroundResource(R.drawable.za_03);
            sp.sound_jai.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_za){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_za);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_sa);
            selectedImg.setBackgroundResource(R.drawable.sa_02);
            hijayahBesar.setBackgroundResource(R.drawable.sa_03);
            sp.sound_sa.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_sa){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_sa);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_sya);
            selectedImg.setBackgroundResource(R.drawable.sya_02);
            hijayahBesar.setBackgroundResource(R.drawable.sya_03);
            sp.sound_sya.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_sya){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_sya);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_sho);
            selectedImg.setBackgroundResource(R.drawable.syo_02);
            hijayahBesar.setBackgroundResource(R.drawable.syo_03);
            sp.sound_syo.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_sho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_syo);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_dho);
            selectedImg.setBackgroundResource(R.drawable.dho_02);
            hijayahBesar.setBackgroundResource(R.drawable.dho_03);
            sp.sound_dho.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_dho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_dho);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_tho);
            selectedImg.setBackgroundResource(R.drawable.tho_02);
            hijayahBesar.setBackgroundResource(R.drawable.tho_03);
            sp.sound_to.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_tho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_tho);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_zho);
            selectedImg.setBackgroundResource(R.drawable.zho_02);
            hijayahBesar.setBackgroundResource(R.drawable.zho_03);
            sp.sound_tho.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_zho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_zho);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ain);
            selectedImg.setBackgroundResource(R.drawable.ain_02);
            hijayahBesar.setBackgroundResource(R.drawable.ain_03);
            sp.sound_ain.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ain){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ain);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_gho);
            selectedImg.setBackgroundResource(R.drawable.gho_02);
            hijayahBesar.setBackgroundResource(R.drawable.gho_03);
            sp.sound_gho.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_gho){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_gho);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_fa);
            selectedImg.setBackgroundResource(R.drawable.fa_02);
            hijayahBesar.setBackgroundResource(R.drawable.fa_03);
            sp.sound_fa.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_fa){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_fa);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_qo);
            selectedImg.setBackgroundResource(R.drawable.qo_02);
            hijayahBesar.setBackgroundResource(R.drawable.qo_03);
            sp.sound_qo.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_qo){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_qo);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ka);
            selectedImg.setBackgroundResource(R.drawable.ka_02);
            hijayahBesar.setBackgroundResource(R.drawable.ka_03);
            sp.sound_ka.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ka){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ka);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_la);
            selectedImg.setBackgroundResource(R.drawable.la_02);
            hijayahBesar.setBackgroundResource(R.drawable.la_03);
            sp.sound_la.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_la){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_la);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ma);
            selectedImg.setBackgroundResource(R.drawable.ma_02);
            hijayahBesar.setBackgroundResource(R.drawable.ma_03);
            sp.sound_ma.start();
        }else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_ma){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_ma);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_na);
            selectedImg.setBackgroundResource(R.drawable.na_02);
            hijayahBesar.setBackgroundResource(R.drawable.na_03);
            sp.sound_na.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_na){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_na);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_wa);
            selectedImg.setBackgroundResource(R.drawable.wa_02);
            hijayahBesar.setBackgroundResource(R.drawable.wa_03);
            sp.sound_wa.start();
        }
        else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_wa){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_wa);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_haq);
            selectedImg.setBackgroundResource(R.drawable.haq_02);
            hijayahBesar.setBackgroundResource(R.drawable.haq_03);
            sp.sound_kha.start();
        }else
        if(selectedImg.getId() == R.id.pelafalan_hijayah_haq){
            selectedImg.setBackgroundResource(R.drawable.hijayah_putih_haq);
            selectedImg=(ImageView)findViewById(R.id.pelafalan_hijayah_ya);
            selectedImg.setBackgroundResource(R.drawable.ya_02);
            hijayahBesar.setBackgroundResource(R.drawable.ya_03);
            arrowL.setVisibility(View.GONE);
            sp.sound_ya.start();
        }

        h.removeCallbacksAndMessages(null);
    }

}
