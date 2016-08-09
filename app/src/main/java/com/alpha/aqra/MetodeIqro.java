package com.alpha.aqra;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MetodeIqro extends AppCompatActivity {

    BackSound stat;
    SoundIqro1 SI1;
    SoundIqro2 SI2;


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
            SI2.SoundPlayer1(this,R.raw.iqro2_baa);
            SI2.SoundPlayer2(this,R.raw.iqro2_baata);
            SI2.SoundPlayer3(this,R.raw.iqro2_baba);
            SI2.SoundPlayer4(this,R.raw.iqro2_badza);
            SI2.SoundPlayer5(this,R.raw.iqro2_baro);
            SI2.SoundPlayer6(this,R.raw.iqro2_batsa);
            SI2.SoundPlayer7(this,R.raw.iqro2_bawa);
            SI2.SoundPlayer8(this,R.raw.iqro2_jaitsa);
            SI2.SoundPlayer9(this,R.raw.iqro2_kana);
            SI2.SoundPlayer10(this,R.raw.iqro2_saain);
            SI2.SoundPlayer11(this,R.raw.iqro2_taa);
            SI2.SoundPlayer12(this,R.raw.iqro2_taata);
            SI2.SoundPlayer13(this,R.raw.iqro2_tada);
            SI2.SoundPlayer14(this,R.raw.iqro2_tadza);
            SI2.SoundPlayer15(this,R.raw.iqro2_tajai);
            SI2.SoundPlayer16(this,R.raw.iqro2_taro);
            SI2.SoundPlayer17(this,R.raw.iqro2_tata);
            SI2.SoundPlayer18(this,R.raw.iqro2_tokha);
            SI2.SoundPlayer19(this,R.raw.iqro2_tsatsa);
            SI2.SoundPlayer20(this,R.raw.iqro2_zama);
            SI2.SoundPlayer21(this,R.raw.iqro2_badaro);
            SI2.SoundPlayer22(this,R.raw.iqro2_badzana);
            SI2.SoundPlayer23(this,R.raw.iqro2_banana);
            SI2.SoundPlayer24(this,R.raw.iqro2_banaro);
            SI2.SoundPlayer25(this,R.raw.iqro2_banata);
            SI2.SoundPlayer26(this,R.raw.iqro2_dzakhaba);
            SI2.SoundPlayer27(this,R.raw.iqro2_dzaroha);
            SI2.SoundPlayer28(this,R.raw.iqro2_nabaa);
            SI2.SoundPlayer29(this,R.raw.iqro2_nabaalif);
            SI2.SoundPlayer30(this,R.raw.iqro2_nababa);
            SI2.SoundPlayer31(this,R.raw.iqro2_nabadza);
            SI2.SoundPlayer32(this,R.raw.iqro2_nabata);
            SI2.SoundPlayer33(this,R.raw.iqro2_nadzaro);
            SI2.SoundPlayer34(this,R.raw.iqro2_nanana);
            SI2.SoundPlayer35(this,R.raw.iqro2_naroain);
            SI2.SoundPlayer36(this,R.raw.iqro2_nataba);
            SI2.SoundPlayer37(this,R.raw.iqro2_natana);
            SI2.SoundPlayer38(this,R.raw.iqro2_nawafa);
            SI2.SoundPlayer39(this,R.raw.iqro2_robana);
            SI2.SoundPlayer40(this,R.raw.iqro2_tabana);
            SI2.SoundPlayer41(this,R.raw.iqro2_tatsaba);
            SI2.SoundPlayer42(this,R.raw.iqro2_tsabata);
            SI2.SoundPlayer43(this,R.raw.iqro2_wanaa);
            SI2.SoundPlayer44(this,R.raw.iqro2_wanadza);
            SI2.SoundPlayer45(this,R.raw.iqro2_ataya);
            SI2.SoundPlayer46(this,R.raw.iqro2_atsatsa);
            SI2.SoundPlayer47(this,R.raw.iqro2_ayata);
            SI2.SoundPlayer48(this,R.raw.iqro2_bayana);
            SI2.SoundPlayer49(this,R.raw.iqro2_danaya);
            SI2.SoundPlayer50(this,R.raw.iqro2_fataya);
            SI2.SoundPlayer51(this,R.raw.iqro2_nabaya);
            SI2.SoundPlayer52(this,R.raw.iqro2_nadhoro);
            SI2.SoundPlayer53(this,R.raw.iqro2_najaila);
            SI2.SoundPlayer54(this,R.raw.iqro2_robaya);
            SI2.SoundPlayer55(this,R.raw.iqro2_rojaiqo);
            SI2.SoundPlayer56(this,R.raw.iqro2_ronaya);
            SI2.SoundPlayer57(this,R.raw.iqro2_sayala);
            SI2.SoundPlayer58(this,R.raw.iqro2_tsanaa);
            SI2.SoundPlayer59(this,R.raw.iqro2_wanada);
            SI2.SoundPlayer60(this,R.raw.iqro2_yaaba);
            SI2.SoundPlayer61(this,R.raw.iqro2_yabaro);
            SI2.SoundPlayer62(this,R.raw.iqro2_yadana);
            SI2.SoundPlayer63(this,R.raw.iqro2_yadaya);
            SI2.SoundPlayer64(this,R.raw.iqro2_yanaro);
            SI2.SoundPlayer65(this,R.raw.iqro2_yasaro);
            SI2.SoundPlayer66(this,R.raw.iqro2_yayaya);
            Intent i = new Intent(MetodeIqro.this,MetodeIqro2.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }else if(v.getId() == R.id.btn_home_iqro){
            SharedPreferences spmusic = getSharedPreferences("music_prefs", Activity.MODE_PRIVATE);
            int musicIntValue=0;
            musicIntValue = spmusic.getInt("music_int_key",-1);
            stat.setCurrVolume(musicIntValue);
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
        stat.SoundPlayer(this,R.raw.intro);
        Intent i = new Intent(MetodeIqro.this,MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
    }
}
