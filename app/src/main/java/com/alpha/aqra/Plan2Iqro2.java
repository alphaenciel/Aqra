package com.alpha.aqra;

/**
 * Created by alphaenciel on 6/20/2016.
 */
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Plan2Iqro2 extends AppCompatActivity {

    BackSound stat;
    MediaPlayer sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan2_iqro2);
    }

    public void onBackPressed() {
        Intent i = new Intent(Plan2Iqro2.this,MetodeIqro.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();

    }

    public void OnCLickIqro2(View v){
        if(v.getId() == R.id.btn_home_iqro2){
            Intent i = new Intent(Plan2Iqro2.this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
            //stat.setStatus("");
        }
    }
    /**
    public void OnClickBtnS2H1(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_1);sound.start();}
    public void OnClickBtnS2H2(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_2);sound.start();}
    public void OnClickBtnS2H3(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_3);sound.start();}
    public void OnClickBtnS2H4(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_4);sound.start();}
    public void OnClickBtnS2H5(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_5);sound.start();}
    public void OnClickBtnS2H6(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_6);sound.start();}
    public void OnClickBtnS2H7(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_7);sound.start();}
    public void OnClickBtnS2H8(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_8);sound.start();}
    public void OnClickBtnS2H9(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_9);sound.start();}
    public void OnClickBtnS2H10(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_10);sound.start();}
    public void OnClickBtnS2H11(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_11);sound.start();}
    public void OnClickBtnS2H12(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_12);sound.start();}
    public void OnClickBtnS2H13(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_13);sound.start();}
    public void OnClickBtnS2H14(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_14);sound.start();}
    public void OnClickBtnS2H15(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_15);sound.start();}
    public void OnClickBtnS2H16(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_16);sound.start();}
    public void OnClickBtnS2H17(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_17);sound.start();}
    public void OnClickBtnS2H18(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_18);sound.start();}
    public void OnClickBtnS2H19(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_19);sound.start();}
    public void OnClickBtnS2H20(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_20);sound.start();}
    public void OnClickBtnS2H21(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_21);sound.start();}
    public void OnClickBtnS2H22(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_22);sound.start();}
    public void OnClickBtnS2H23(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_23);sound.start();}
    public void OnClickBtnS2H24(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_24);sound.start();}
    public void OnClickBtnS2H25(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_25);sound.start();}
    public void OnClickBtnS2H26(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_26);sound.start();}
    public void OnClickBtnS2H27(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_27);sound.start();}
    public void OnClickBtnS2H28(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_28);sound.start();}
     **/
}