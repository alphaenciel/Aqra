package com.alpha.aqra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MetodeIqro extends AppCompatActivity {

    BackSound stat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_iqro);
    }

    public void onCLickIqro(View v){
        if(v.getId() == R.id.btn_iqro1){
            Intent i = new Intent(MetodeIqro.this,Plan2Iqro1.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }else if(v.getId() == R.id.btn_iqro2){
            Intent i = new Intent(MetodeIqro.this,Plan2Iqro2.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
        }else if(v.getId() == R.id.btn_home_iqro){
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
