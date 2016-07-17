package com.alpha.aqra;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by alphaenciel on 6/20/2016.
 */
public class SoundIqro1 {

    public static float volume;

    public static float getVolume() {
        return volume;
    }

    public static void setVolume(float volume) {
        float log1= (float) (1-(Math.log(100-volume)/Math.log(100)));
        SoundIqro1.volume = log1;
    }

    public static MediaPlayer sound_a,sound_ain,sound_ba,sound_da,sound_dho,sound_dza,sound_fa,sound_gho,sound_ha,sound_ho
    ,sound_jai,sound_ka,sound_kha,sound_la,sound_ma,sound_na,sound_qo,sound_ro,sound_sa,sound_sya
            ,sound_syo,sound_ta,sound_tho,sound_to,sound_tsa,sound_ya,sound_za, sound_wa;
    public static void SoundPlayer1(Context ctx,int raw_id){sound_a = MediaPlayer.create(ctx, raw_id);sound_a.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer2(Context ctx,int raw_id){sound_ain = MediaPlayer.create(ctx, raw_id);sound_ain.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer3(Context ctx,int raw_id){sound_ba = MediaPlayer.create(ctx, raw_id);sound_ba.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer4(Context ctx,int raw_id){sound_da = MediaPlayer.create(ctx, raw_id);sound_da.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer5(Context ctx,int raw_id){sound_dho = MediaPlayer.create(ctx, raw_id);sound_dho.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer6(Context ctx,int raw_id){sound_dza = MediaPlayer.create(ctx, raw_id);sound_dza.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer7(Context ctx,int raw_id){sound_fa = MediaPlayer.create(ctx, raw_id);sound_fa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer8(Context ctx,int raw_id){sound_gho = MediaPlayer.create(ctx, raw_id);sound_gho.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer9(Context ctx,int raw_id){sound_ha = MediaPlayer.create(ctx, raw_id);sound_ha.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer10(Context ctx,int raw_id){sound_ho = MediaPlayer.create(ctx, raw_id);sound_ho.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer11(Context ctx,int raw_id){sound_jai = MediaPlayer.create(ctx, raw_id);sound_jai.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer12(Context ctx,int raw_id){sound_ka = MediaPlayer.create(ctx, raw_id);sound_ka.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer13(Context ctx,int raw_id){sound_kha = MediaPlayer.create(ctx, raw_id);sound_kha.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer14(Context ctx,int raw_id){sound_la = MediaPlayer.create(ctx, raw_id);sound_la.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer15(Context ctx,int raw_id){sound_ma = MediaPlayer.create(ctx, raw_id);sound_ma.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer16(Context ctx,int raw_id){sound_na = MediaPlayer.create(ctx, raw_id);sound_na.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer17(Context ctx,int raw_id){sound_qo = MediaPlayer.create(ctx, raw_id);sound_qo.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer18(Context ctx,int raw_id){sound_ro = MediaPlayer.create(ctx, raw_id);sound_ro.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer19(Context ctx,int raw_id){sound_sa = MediaPlayer.create(ctx, raw_id);sound_sa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer20(Context ctx,int raw_id){sound_sya = MediaPlayer.create(ctx, raw_id);sound_sya.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer21(Context ctx,int raw_id){sound_syo = MediaPlayer.create(ctx, raw_id);sound_syo.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer22(Context ctx,int raw_id){sound_ta = MediaPlayer.create(ctx, raw_id);sound_ta.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer23(Context ctx,int raw_id){sound_tho = MediaPlayer.create(ctx, raw_id);sound_tho.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer24(Context ctx,int raw_id){sound_to = MediaPlayer.create(ctx, raw_id);sound_to.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer25(Context ctx,int raw_id){sound_tsa = MediaPlayer.create(ctx, raw_id);sound_tsa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer26(Context ctx,int raw_id){sound_ya = MediaPlayer.create(ctx, raw_id);sound_ya.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer27(Context ctx,int raw_id){sound_za = MediaPlayer.create(ctx, raw_id);sound_za.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer28(Context ctx,int raw_id){sound_wa = MediaPlayer.create(ctx, raw_id);sound_wa.setVolume(getVolume(), getVolume());}

}