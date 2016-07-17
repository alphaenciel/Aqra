package com.alpha.aqra;

import android.content.Intent;
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
    ImageButton btn_auto;
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
        selectedImg.setBackgroundResource(R.drawable.hijayah_orange_a);
        sp.sound_a.start();
    }

    @Override
    public void onBackPressed() {
        stat.SoundPlayer(this,R.raw.intro);
        Intent i = new Intent(Pelafalan.this,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
        //stat.setStatus("");
    }
    public void OnButtonPelafalanBack(View v){
        stat.SoundPlayer(this,R.raw.intro);
        Intent i = new Intent(Pelafalan.this,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
        //stat.setStatus("");
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
            sp.sound_ya.start();
        }

        h.removeCallbacksAndMessages(null);
    }

}
