package com.alpha.aqra;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class latihanPelafalan extends AppCompatActivity {

    private int btn_id=0;
    ProgressBar progress;
    ImageView selectedImg,status;
    ImageButton rekam, selected;
    TextView txtTemp;
    String tmpStr="";
    BackSound stat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_pelafalan);
        rekam=(ImageButton)findViewById(R.id.latihan_btnRekam);
        selectedImg=(ImageView)findViewById(R.id.hasil_rekam);
        selected=(ImageButton) findViewById(R.id.latihan_tempSelected);
        progress = (ProgressBar)findViewById(R.id.progressBar);
        status = (ImageView)findViewById((R.id.latihan_status));
        txtTemp=(TextView)findViewById(R.id.textView2);
        progress.setProgress(0);
        progress.setMax(100);
    }

    public void OnButtonPelafalanBack(View v){
        //stat.setStatus("");
        stat.SoundPlayer(this,R.raw.intro);
        Intent i = new Intent(latihanPelafalan.this,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }

    public void onBackPressed() {
        stat.SoundPlayer(this,R.raw.intro);
        Intent i = new Intent(latihanPelafalan.this,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }

    public void onClickLatihanRecord(View v){
        if(checkNetwork()){
            rekam.setBackgroundResource(R.drawable.btn_rekam_on);
            promptSpeechInput();
        }else{
            Toast.makeText(latihanPelafalan.this, "Koneksi internet tidak tersedia", Toast.LENGTH_LONG).show();
            rekam.setBackgroundResource(R.drawable.btn_rekam_off);
        }
    }

    private void promptSpeechInput(){
        Intent voicerecogize = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        voicerecogize.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getClass().getPackage().getName());
        voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        voicerecogize.putExtra(RecognizerIntent.EXTRA_LANGUAGE,"in_ID");
        voicerecogize.putExtra("android.speech.extra.EXTRA_ADDITIONAL_LANGUAGES", new String[]{});
        try{
            startActivityForResult(voicerecogize, 100);
        }catch(ActivityNotFoundException a){
            Toast.makeText(latihanPelafalan.this, "Sorry your device not support speech recognizition", Toast.LENGTH_LONG).show();
        }
    }

    public boolean checkNetwork(){
        boolean connected;
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            connected = true;
        }
        else
            connected = false;
        return connected;
    }

    public void onActivityResult(int resultCode, int requestCode, Intent intent) {
        if(resultCode == 100 && requestCode == RESULT_OK)
        {
            ArrayList<String> results = intent.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            tmpStr = results.get(0);
            txtTemp.setText(tmpStr);

            if(btn_id == R.id.latihan_alif && tmpStr.equalsIgnoreCase("Alif")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.a_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_alif);
                selected.setBackgroundResource(R.drawable.a_02);
            }else if(btn_id == R.id.latihan_ba && tmpStr.equalsIgnoreCase("Mbak")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ba_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ba);
                selected.setBackgroundResource(R.drawable.ba_02);
            }else if (btn_id == R.id.latihan_ta &&tmpStr.equalsIgnoreCase("Tak")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ta_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ta);
                selected.setBackgroundResource(R.drawable.ta_02);
            }else if (btn_id == R.id.latihan_tsa &&tmpStr.equalsIgnoreCase("Sa")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.tsa_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_tsa);
                selected.setBackgroundResource(R.drawable.tsa_02);
            }else if (btn_id == R.id.latihan_ja &&tmpStr.equalsIgnoreCase("Game")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ja_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ja);
                selected.setBackgroundResource(R.drawable.ja_02);
            }else if (btn_id == R.id.latihan_ha && (tmpStr.equalsIgnoreCase("hack") || tmpStr.equalsIgnoreCase("h"))){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ha_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ha);
                selected.setBackgroundResource(R.drawable.ha_02);
            }else if (btn_id == R.id.latihan_ha && (tmpStr.equalsIgnoreCase("coc") || tmpStr.equalsIgnoreCase("ho"))){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.kho_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_kho);
                selected.setBackgroundResource(R.drawable.kho_02);
            }else if (btn_id == R.id.latihan_da && tmpStr.equalsIgnoreCase("dal")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.da_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_da);
                selected.setBackgroundResource(R.drawable.da_02);
            }else if (btn_id == R.id.latihan_dza && tmpStr.equalsIgnoreCase("zal")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.dza_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_dza);
                selected.setBackgroundResource(R.drawable.dza_02);
            }else if (btn_id == R.id.latihan_ro && tmpStr.equalsIgnoreCase("rock")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ro_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ro);
                selected.setBackgroundResource(R.drawable.ro_02);
            }else if (btn_id == R.id.latihan_za && tmpStr.equalsIgnoreCase("jay")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.za_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_za);
                selected.setBackgroundResource(R.drawable.za_02);
            }else if (btn_id == R.id.latihan_sa && tmpStr.equalsIgnoreCase("sin")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.sa_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_sa);
                selected.setBackgroundResource(R.drawable.sa_02);
            }else if (btn_id == R.id.latihan_sya && (tmpStr.equalsIgnoreCase("sin") || tmpStr.equalsIgnoreCase("send"))){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.sya_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_sya);
                selected.setBackgroundResource(R.drawable.sya_02);
            }else if (btn_id == R.id.latihan_sho && tmpStr.equalsIgnoreCase("set")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.syo_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_sho);
                selected.setBackgroundResource(R.drawable.syo_02);
            }else if (btn_id == R.id.latihan_dho && tmpStr.equalsIgnoreCase("dot")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.dho_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_dho);
                selected.setBackgroundResource(R.drawable.dho_02);
            }else if (btn_id == R.id.latihan_to && tmpStr.equalsIgnoreCase("talk")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.tho_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_to);
                selected.setBackgroundResource(R.drawable.tho_02);
            }else if (btn_id == R.id.latihan_zo && (tmpStr.equalsIgnoreCase("jo") || tmpStr.equalsIgnoreCase("jok"))){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.zho_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_zo);
                selected.setBackgroundResource(R.drawable.zho_02);
            }else if (btn_id == R.id.latihan_ain && tmpStr.equalsIgnoreCase("i'm")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ain_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ain);
                selected.setBackgroundResource(R.drawable.ain_02);
            }else if (btn_id == R.id.latihan_gho && (tmpStr.equalsIgnoreCase("going") || tmpStr.equalsIgnoreCase("goyang"))){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.gho_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_gho);
                selected.setBackgroundResource(R.drawable.gho_02);
            }else if (btn_id == R.id.latihan_fa && (tmpStr.equalsIgnoreCase("va") || tmpStr.equalsIgnoreCase("sa"))){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.fa_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_fa);
                selected.setBackgroundResource(R.drawable.fa_02);
            }else if (btn_id == R.id.latihan_qo && tmpStr.equalsIgnoreCase("coffe")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.qo_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_qo);
                selected.setBackgroundResource(R.drawable.qo_02);
            }else if (btn_id == R.id.latihan_ka && tmpStr.equalsIgnoreCase("cafe")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ka_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ka);
                selected.setBackgroundResource(R.drawable.ka_02);
            }else if (btn_id == R.id.latihan_la && tmpStr.equalsIgnoreCase("lam")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.la_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_la);
                selected.setBackgroundResource(R.drawable.la_02);
            }else if (btn_id == R.id.latihan_ma && tmpStr.equalsIgnoreCase("meme")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ma_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ma);
                selected.setBackgroundResource(R.drawable.ma_02);
            }else if (btn_id == R.id.latihan_na && (tmpStr.equalsIgnoreCase("nun") || tmpStr.equalsIgnoreCase("non"))){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.na_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_na);
                selected.setBackgroundResource(R.drawable.na_02);
            }else if (btn_id == R.id.latihan_wa && (tmpStr.equalsIgnoreCase("waw") || tmpStr.equalsIgnoreCase("wow"))){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.wa_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_wa);
                selected.setBackgroundResource(R.drawable.wa_02);
            }else if (btn_id == R.id.latihan_haq && (tmpStr.equalsIgnoreCase("h") || tmpStr.equalsIgnoreCase("ha"))){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.haq_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_haq);
                selected.setBackgroundResource(R.drawable.haq_02);
            }else if (btn_id == R.id.latihan_ya && tmpStr.equalsIgnoreCase("ya")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ya_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ya);
                selected.setBackgroundResource(R.drawable.ya_02);
            }else
                voiceFailed();
            /*if (tmpStr.equalsIgnoreCase("Alif")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.a_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_alif);
                selected.setBackgroundResource(R.drawable.a_02);
            else if (tmpStr.equalsIgnoreCase("za")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.za_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_za);
                selected.setBackgroundResource(R.drawable.za_02);
            }else if (tmpStr.equalsIgnoreCase("shock")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.syo_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_sho);
                selected.setBackgroundResource(R.drawable.syo_02);
            }else if (tmpStr.equalsIgnoreCase("do")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.dho_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_dho);
                selected.setBackgroundResource(R.drawable.dho_02);
            }else if (tmpStr.equalsIgnoreCase("i'm")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ain_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ain);
                selected.setBackgroundResource(R.drawable.ain_02);
            }else if (tmpStr.equalsIgnoreCase("go")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.gho_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_gho);
                selected.setBackgroundResource(R.drawable.gho_02);
            }else if (tmpStr.equalsIgnoreCase("fac")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.fa_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_fa);
                selected.setBackgroundResource(R.drawable.fa_02);
            }else if (tmpStr.equalsIgnoreCase("kak")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.qo_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_qo);
                selected.setBackgroundResource(R.drawable.qo_02);
            }else if (tmpStr.equalsIgnoreCase("la")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.la_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_la);
                selected.setBackgroundResource(R.drawable.la_02);
            }else if (tmpStr.equalsIgnoreCase("ma")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ma_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ma);
                selected.setBackgroundResource(R.drawable.ma_02);
            }else if (tmpStr.equalsIgnoreCase("na")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.na_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_na);
                selected.setBackgroundResource(R.drawable.na_02);
            }else if (tmpStr.equalsIgnoreCase("wa")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.wa_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_wa);
                selected.setBackgroundResource(R.drawable.wa_02);
            }else if (tmpStr.equalsIgnoreCase("ya")){
                voiceSuccess();
                selectedImg.setBackgroundResource(R.drawable.ya_03);
                selectedBeforeHijayah();
                selected = (ImageButton)findViewById(R.id.latihan_ya);
                selected.setBackgroundResource(R.drawable.ya_02);
            }else{
                int n = new Random().nextInt(30);
                progress.setProgress(n);
                status.setBackgroundResource(R.drawable.ket_voice_tidak_berhasil);
            }*/
            rekam.setBackgroundResource(R.drawable.btn_rekam_off);
        }else {
            rekam.setBackgroundResource(R.drawable.btn_rekam_off);
        }
        super.onActivityResult(resultCode, requestCode, intent);
    }

    public void voiceSuccess(){
        int low = 80;
        int high = 100;
        int n = new Random().nextInt(high-low)+low;
        progress.setProgress(n);
        status.setBackgroundResource(R.drawable.ket_voice_berhasil);
    }
    public void voiceFailed(){
        int low = 1;
        int high = 45;
        int n = new Random().nextInt(high-low)+low;
        progress.setProgress(n);
        status.setBackgroundResource(R.drawable.ket_voice_tidak_berhasil);
    }

    public void selectedBeforeHijayah(){

        if (selected.getId() == R.id.latihan_alif){
            selected.setBackgroundResource(R.drawable.hijayah_putih_a);
        }else if (selected.getId() == R.id.latihan_ba){
            selected.setBackgroundResource(R.drawable.hijayah_putih_ba);
        }else if (selected.getId() == R.id.latihan_ta){
            selected.setBackgroundResource(R.drawable.hijayah_putih_ta);
        }else if (selected.getId() == R.id.latihan_ha){
            selected.setBackgroundResource(R.drawable.hijayah_putih_ha);
        }else if (selected.getId() == R.id.latihan_kho){
            selected.setBackgroundResource(R.drawable.hijayah_putih_kho);
        }else if (selected.getId() == R.id.latihan_da){
            selected.setBackgroundResource(R.drawable.hijayah_putih_da);
        }else if (selected.getId() == R.id.latihan_ro){
            selected.setBackgroundResource(R.drawable.hijayah_putih_ro);
        }else if (selected.getId() == R.id.latihan_za){
            selected.setBackgroundResource(R.drawable.hijayah_putih_za);
        }else if (selected.getId() == R.id.latihan_sho){
            selected.setBackgroundResource(R.drawable.hijayah_putih_syo);
        }else if (selected.getId() == R.id.latihan_dho){
            selected.setBackgroundResource(R.drawable.hijayah_putih_dho);
        }else if (selected.getId() == R.id.latihan_ain){
            selected.setBackgroundResource(R.drawable.hijayah_putih_ain);
        }else if (selected.getId() == R.id.latihan_gho){
            selected.setBackgroundResource(R.drawable.hijayah_putih_gho);
        }else if (selected.getId() == R.id.latihan_fa){
            selected.setBackgroundResource(R.drawable.hijayah_putih_fa);
        }else if (selected.getId() == R.id.latihan_qo){
            selected.setBackgroundResource(R.drawable.hijayah_putih_qo);
        }else if (selected.getId() == R.id.latihan_la){
            selected.setBackgroundResource(R.drawable.hijayah_putih_la);
        }else if (selected.getId() == R.id.latihan_ma){
            selected.setBackgroundResource(R.drawable.hijayah_putih_ma);
        }else if (selected.getId() == R.id.latihan_na){
            selected.setBackgroundResource(R.drawable.hijayah_putih_na);
        }else if (selected.getId() == R.id.latihan_wa){
            selected.setBackgroundResource(R.drawable.hijayah_putih_wa);
        }else if (selected.getId() == R.id.latihan_ya){
            selected.setBackgroundResource(R.drawable.hijayah_putih_ya);
        }else {

        }
    }

    public void OnButtonPelafalanClick(View v){
        btn_id = v.getId();
        promptSpeechInput();
    }
}
