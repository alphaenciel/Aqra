package com.alpha.aqra;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by alphaenciel on 7/1/2016.
 */
public class SoundIqro2 {

    public static float volume;

    public static float getVolume() {
        return volume;
    }

    public static void setVolume(float volume) {
        float log1= (float) (1-(Math.log(100-volume)/Math.log(100)));
        SoundIqro2.volume = log1;
    }

    public static MediaPlayer sound_baa,sound_baata,sound_baba,sound_badza,sound_baro,sound_batsa,sound_bawa,sound_jaitsa,sound_kana,sound_saain
            ,sound_taa,sound_taata,sound_tada,sound_tadza,sound_tajai,sound_taro,sound_tata,sound_tokha,sound_tsatsa,sound_zama
            ,sound_badaro,sound_badzana,sound_banana,sound_banaro,sound_banata,sound_dzakhaba,sound_dzaroha,sound_nabaa,sound_nabaalif
            ,sound_nababa,sound_nabadza,sound_nabata,sound_nadzaro,sound_nanana,sound_naroain,sound_nataba,sound_natana,sound_nawafa
            ,sound_robana,sound_tabana,sound_tatsaba,sound_tsabata,sound_wanaa,sound_wanadza,sound_ataya,sound_atsatsa,sound_ayata,sound_bayana
            ,sound_danaya,sound_fataya,sound_nabaya,sound_nadhoro,sound_najaila,sound_robaya,sound_rojaiqo,sound_ronaya,sound_sayala,sound_tsanaa
            ,sound_wanada,sound_yaaba,sound_yabaro,sound_yadana,sound_yadaya,sound_yanaro,sound_yasaro,sound_yayaya;
    public static void SoundPlayer1(Context ctx, int raw_id){sound_baa = MediaPlayer.create(ctx, raw_id);sound_baa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer2(Context ctx,int raw_id){sound_baata = MediaPlayer.create(ctx, raw_id);sound_baata.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer3(Context ctx,int raw_id){sound_baba = MediaPlayer.create(ctx, raw_id);sound_baba.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer4(Context ctx,int raw_id){sound_badza = MediaPlayer.create(ctx, raw_id);sound_badza.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer5(Context ctx,int raw_id){sound_baro = MediaPlayer.create(ctx, raw_id);sound_baro.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer6(Context ctx,int raw_id){sound_batsa = MediaPlayer.create(ctx, raw_id);sound_batsa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer7(Context ctx,int raw_id){sound_bawa = MediaPlayer.create(ctx, raw_id);sound_bawa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer8(Context ctx,int raw_id){sound_jaitsa = MediaPlayer.create(ctx, raw_id);sound_jaitsa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer9(Context ctx,int raw_id){sound_kana = MediaPlayer.create(ctx, raw_id);sound_kana.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer10(Context ctx,int raw_id){sound_saain = MediaPlayer.create(ctx, raw_id);sound_saain.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer11(Context ctx,int raw_id){sound_taa = MediaPlayer.create(ctx, raw_id);sound_taa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer12(Context ctx,int raw_id){sound_taata = MediaPlayer.create(ctx, raw_id);sound_taata.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer13(Context ctx,int raw_id){sound_tada = MediaPlayer.create(ctx, raw_id);sound_tada.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer14(Context ctx,int raw_id){sound_tadza = MediaPlayer.create(ctx, raw_id);sound_tadza.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer15(Context ctx,int raw_id){sound_tajai = MediaPlayer.create(ctx, raw_id);sound_tajai.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer16(Context ctx,int raw_id){sound_taro = MediaPlayer.create(ctx, raw_id);sound_taro.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer17(Context ctx,int raw_id){sound_tata = MediaPlayer.create(ctx, raw_id);sound_tata.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer18(Context ctx,int raw_id){sound_tokha = MediaPlayer.create(ctx, raw_id);sound_tokha.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer19(Context ctx,int raw_id){sound_tsatsa = MediaPlayer.create(ctx, raw_id);sound_tsatsa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer20(Context ctx,int raw_id){sound_zama = MediaPlayer.create(ctx, raw_id);sound_zama.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer21(Context ctx,int raw_id){sound_badaro = MediaPlayer.create(ctx, raw_id);sound_badaro.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer22(Context ctx,int raw_id){sound_badzana = MediaPlayer.create(ctx, raw_id);sound_badzana.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer23(Context ctx,int raw_id){sound_banana = MediaPlayer.create(ctx, raw_id);sound_banana.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer24(Context ctx,int raw_id){sound_banaro = MediaPlayer.create(ctx, raw_id);sound_banaro.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer25(Context ctx,int raw_id){sound_banata = MediaPlayer.create(ctx, raw_id);sound_banata.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer26(Context ctx,int raw_id){sound_dzakhaba = MediaPlayer.create(ctx, raw_id);sound_dzakhaba.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer27(Context ctx,int raw_id){sound_dzaroha = MediaPlayer.create(ctx, raw_id);sound_dzaroha.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer28(Context ctx,int raw_id){sound_nabaa = MediaPlayer.create(ctx, raw_id);sound_nabaa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer29(Context ctx,int raw_id){sound_nabaalif = MediaPlayer.create(ctx, raw_id);sound_nabaalif.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer30(Context ctx,int raw_id){sound_nababa = MediaPlayer.create(ctx, raw_id);sound_nababa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer31(Context ctx, int raw_id){sound_nabadza = MediaPlayer.create(ctx, raw_id);sound_nabadza.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer32(Context ctx,int raw_id){sound_nabata = MediaPlayer.create(ctx, raw_id);sound_nabata.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer33(Context ctx,int raw_id){sound_nadzaro = MediaPlayer.create(ctx, raw_id);sound_nadzaro.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer34(Context ctx,int raw_id){sound_nanana = MediaPlayer.create(ctx, raw_id);sound_nanana.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer35(Context ctx,int raw_id){sound_naroain = MediaPlayer.create(ctx, raw_id);sound_naroain.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer36(Context ctx,int raw_id){sound_nataba = MediaPlayer.create(ctx, raw_id);sound_nataba.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer37(Context ctx,int raw_id){sound_natana = MediaPlayer.create(ctx, raw_id);sound_natana.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer38(Context ctx,int raw_id){sound_nawafa = MediaPlayer.create(ctx, raw_id);sound_nawafa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer39(Context ctx,int raw_id){sound_robana = MediaPlayer.create(ctx, raw_id);sound_robana.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer40(Context ctx,int raw_id){sound_tabana = MediaPlayer.create(ctx, raw_id);sound_tabana.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer41(Context ctx, int raw_id){sound_tatsaba = MediaPlayer.create(ctx, raw_id);sound_tatsaba.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer42(Context ctx,int raw_id){sound_tsabata = MediaPlayer.create(ctx, raw_id);sound_tsabata.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer43(Context ctx,int raw_id){sound_wanaa = MediaPlayer.create(ctx, raw_id);sound_wanaa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer44(Context ctx,int raw_id){sound_wanadza = MediaPlayer.create(ctx, raw_id);sound_wanadza.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer45(Context ctx,int raw_id){sound_ataya = MediaPlayer.create(ctx, raw_id);sound_ataya.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer46(Context ctx,int raw_id){sound_atsatsa = MediaPlayer.create(ctx, raw_id);sound_atsatsa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer47(Context ctx,int raw_id){sound_ayata = MediaPlayer.create(ctx, raw_id);sound_ayata.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer48(Context ctx,int raw_id){sound_bayana = MediaPlayer.create(ctx, raw_id);sound_bayana.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer49(Context ctx,int raw_id){sound_danaya = MediaPlayer.create(ctx, raw_id);sound_danaya.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer50(Context ctx,int raw_id){sound_fataya = MediaPlayer.create(ctx, raw_id);sound_fataya.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer51(Context ctx, int raw_id){sound_nabaya = MediaPlayer.create(ctx, raw_id);sound_nabaya.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer52(Context ctx,int raw_id){sound_nadhoro = MediaPlayer.create(ctx, raw_id);sound_nadhoro.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer53(Context ctx,int raw_id){sound_najaila = MediaPlayer.create(ctx, raw_id);sound_najaila.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer54(Context ctx,int raw_id){sound_robaya = MediaPlayer.create(ctx, raw_id);sound_robaya.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer55(Context ctx,int raw_id){sound_rojaiqo = MediaPlayer.create(ctx, raw_id);sound_rojaiqo.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer56(Context ctx,int raw_id){sound_ronaya = MediaPlayer.create(ctx, raw_id);sound_ronaya.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer57(Context ctx,int raw_id){sound_sayala = MediaPlayer.create(ctx, raw_id);sound_sayala.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer58(Context ctx,int raw_id){sound_tsanaa = MediaPlayer.create(ctx, raw_id);sound_tsanaa.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer59(Context ctx,int raw_id){sound_wanada = MediaPlayer.create(ctx, raw_id);sound_wanada.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer60(Context ctx,int raw_id){sound_yaaba = MediaPlayer.create(ctx, raw_id);sound_yaaba.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer61(Context ctx, int raw_id){sound_yabaro = MediaPlayer.create(ctx, raw_id);sound_yabaro.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer62(Context ctx,int raw_id){sound_yadana = MediaPlayer.create(ctx, raw_id);sound_yadana.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer63(Context ctx,int raw_id){sound_yadaya = MediaPlayer.create(ctx, raw_id);sound_yadaya.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer64(Context ctx,int raw_id){sound_yanaro = MediaPlayer.create(ctx, raw_id);sound_yanaro.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer65(Context ctx,int raw_id){sound_yasaro = MediaPlayer.create(ctx, raw_id);sound_yasaro.setVolume(getVolume(), getVolume());}
    public static void SoundPlayer66(Context ctx,int raw_id){sound_yayaya = MediaPlayer.create(ctx, raw_id);sound_yayaya.setVolume(getVolume(), getVolume());}

}
