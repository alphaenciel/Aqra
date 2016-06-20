package com.alpha.aqra;

/**
 * Created by alphaenciel on 6/20/2016.
 */
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Plan2Iqro1 extends AppCompatActivity {

    MediaPlayer sound;
    BackSound stat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan2_iqro1);
    }

    public void onBackPressed() {
        Intent i = new Intent(Plan2Iqro1.this,MetodeIqro.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();

    }


    public void OnClickIqro1(View v){
        if(v.getId() == R.id.btn_home_iqro1) {
            Intent i = new Intent(Plan2Iqro1.this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
            //stat.setStatus("");
        }
    }
    public void OnClickBtnS1H1(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_1);sound.start();}
    public void OnClickBtnS1H2(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_2);sound.start();}
    public void OnClickBtnS1H3(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_3);sound.start();}
    public void OnClickBtnS1H4(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_4);sound.start();}
    public void OnClickBtnS1H5(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_5);sound.start();}
    public void OnClickBtnS1H6(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_6);sound.start();}
    public void OnClickBtnS1H7(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_7);sound.start();}
    public void OnClickBtnS1H8(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_8);sound.start();}
    public void OnClickBtnS1H9(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_9);sound.start();}
    public void OnClickBtnS1H10(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_10);sound.start();}
    public void OnClickBtnS1H11(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_11);sound.start();}
    public void OnClickBtnS1H12(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_12);sound.start();}
    public void OnClickBtnS1H13(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_13);sound.start();}
    public void OnClickBtnS1H14(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_14);sound.start();}
    public void OnClickBtnS1H15(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_15);sound.start();}
    public void OnClickBtnS1H16(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_16);sound.start();}
    public void OnClickBtnS1H17(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_17);sound.start();}
    public void OnClickBtnS1H18(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_18);sound.start();}
    public void OnClickBtnS1H19(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_19);sound.start();}
    public void OnClickBtnS1H20(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_20);sound.start();}
    public void OnClickBtnS1H21(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_21);sound.start();}
    public void OnClickBtnS1H22(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_22);sound.start();}
    public void OnClickBtnS1H23(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_23);sound.start();}
    public void OnClickBtnS1H24(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_24);sound.start();}
    public void OnClickBtnS1H25(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_25);sound.start();}
    public void OnClickBtnS1H26(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_26);sound.start();}
    public void OnClickBtnS1H27(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_27);sound.start();}
    public void OnClickBtnS1H28(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_28);sound.start();}
    public void OnClickBtnS1H29(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_29);sound.start();}
    public void OnClickBtnS1H30(View v){sound = MediaPlayer.create(this,R.raw.slide1_1_30);sound.start();}

}
