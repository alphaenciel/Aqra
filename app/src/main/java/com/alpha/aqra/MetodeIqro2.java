package com.alpha.aqra;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MetodeIqro2 extends FragmentActivity {


    public PageIndicator mIndicator;
    private ViewPager awesomePager;
    private PagerAdapter pm;
    BackSound stat;
    SoundIqro2 soundIqro2;

    ArrayList<Category2> codeCategory;

    String deviceNames[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
            "24", "25", "26","27", "28", "29", "30", "31", "32", "33", "34", "35", "36",
            "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49",
            "50", "51", "52","53", "54", "55", "56", "57", "58", "59", "60", "61", "62",
            "63", "64", "65", "66", "67", "68", "69", "70", "71", "72","73", "74", "75", "76", "77", "78", "79", "80", "81",
            "82", "83", "84" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_iqro2);
        awesomePager = (ViewPager) findViewById(R.id.pager2);
        mIndicator = (PageIndicator) findViewById(R.id.pagerIndicator2);

        ArrayList<String> a = new ArrayList<String>();

        Category2 m = new Category2();
        for (int i = 0; i < deviceNames.length; i++) {
            a.add(i, deviceNames[i]);
            m.name = a.get(i);
        }

        codeCategory = new ArrayList<Category2>();
        codeCategory.add(m);

        Iterator<String> it = a.iterator();

        List<GridFragment2> GridFragments = new ArrayList<GridFragment2>();
        it = a.iterator();

        int i = 0;
        while (it.hasNext()) {
            ArrayList<GridItems2> itmLst = new ArrayList<GridItems2>();

            GridItems2 itm = new GridItems2(0, it.next());
            itmLst.add(itm);
            i = i + 1;

            if (it.hasNext()) {GridItems2 itm1 = new GridItems2(1, it.next());itmLst.add(itm1);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm2 = new GridItems2(2, it.next());itmLst.add(itm2);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm3 = new GridItems2(3, it.next());itmLst.add(itm3);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm4 = new GridItems2(4, it.next());itmLst.add(itm4);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm5 = new GridItems2(5, it.next());itmLst.add(itm5);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm6 = new GridItems2(6, it.next());itmLst.add(itm6);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm7 = new GridItems2(7, it.next());itmLst.add(itm7);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm8 = new GridItems2(8, it.next());itmLst.add(itm8);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm9 = new GridItems2(9, it.next());itmLst.add(itm9);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm10 = new GridItems2(10, it.next());itmLst.add(itm10);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm11 = new GridItems2(11, it.next());itmLst.add(itm11);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm12 = new GridItems2(12, it.next());itmLst.add(itm12);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm13 = new GridItems2(13, it.next());itmLst.add(itm13);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm14 = new GridItems2(14, it.next());itmLst.add(itm14);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm15 = new GridItems2(15, it.next());itmLst.add(itm15);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm16 = new GridItems2(16, it.next());itmLst.add(itm16);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm17 = new GridItems2(17, it.next());itmLst.add(itm17);i = i + 1;}
            if (it.hasNext()) {GridItems2 itm18 = new GridItems2(18, it.next());itmLst.add(itm18);i = i + 1;}
            if (it.hasNext()) { GridItems2 itm19 = new GridItems2(19, it.next()); itmLst.add(itm19); i = i + 1;}
            if (it.hasNext()) { GridItems2 itm20 = new GridItems2(20, it.next()); itmLst.add(itm20); i = i + 1;}
            if (it.hasNext()) { GridItems2 itm21 = new GridItems2(21, it.next()); itmLst.add(itm21); i = i + 1;}
            if (it.hasNext()) { GridItems2 itm22 = new GridItems2(22, it.next()); itmLst.add(itm22); i = i + 1;}
            if (it.hasNext()) { GridItems2 itm23 = new GridItems2(23, it.next()); itmLst.add(itm23); i = i + 1;}
            if (it.hasNext()) { GridItems2 itm24 = new GridItems2(24, it.next()); itmLst.add(itm24); i = i + 1;}
            if (it.hasNext()) { GridItems2 itm25 = new GridItems2(25, it.next()); itmLst.add(itm25); i = i + 1;}
            if (it.hasNext()) { GridItems2 itm26 = new GridItems2(26, it.next()); itmLst.add(itm26); i = i + 1;}
            if (it.hasNext()) { GridItems2 itm27 = new GridItems2(27, it.next()); itmLst.add(itm27); i = i + 1;}


            GridItems2[] gp = {};
            GridItems2[] gridPage = itmLst.toArray(gp);
            GridFragments.add(new GridFragment2(gridPage, MetodeIqro2.this));
        }

        pm = new PagerAdapter(getSupportFragmentManager(), GridFragments);
        awesomePager.setAdapter(pm);
        mIndicator.setViewPager(awesomePager);

    }


    private class PagerAdapter extends FragmentStatePagerAdapter {
        private List<GridFragment2> fragments;

        public PagerAdapter(FragmentManager fm, List<GridFragment2> fragments) {
            super(fm);
            this.fragments = fragments;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments.get(position);
        }

        @Override
        public int getCount() {
            return this.fragments.size();
        }
    }
    public void OnClickSlideIqro2(View v){
        if(v.getId() == R.id.btnBackHome2) {
            stat.SoundPlayer(getApplicationContext(),R.raw.intro);
            Intent i = new Intent(MetodeIqro2.this, MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
            finish();
            soundIqro2.sound_baa.stop();soundIqro2.sound_baa.release();
            soundIqro2.sound_baata.stop();soundIqro2.sound_baata.release();
            soundIqro2.sound_baba.stop();soundIqro2.sound_baba.release();
            soundIqro2.sound_badza.stop();soundIqro2.sound_badza.release();
            soundIqro2.sound_baro.stop();soundIqro2.sound_baro.release();
            soundIqro2.sound_batsa.stop();soundIqro2.sound_batsa.release();
            soundIqro2.sound_bawa.stop();soundIqro2.sound_bawa.release();
            soundIqro2.sound_jaitsa.stop();soundIqro2.sound_jaitsa.release();
            soundIqro2.sound_kana.stop();soundIqro2.sound_kana.release();
            soundIqro2.sound_saain.stop();soundIqro2.sound_saain.release();
            soundIqro2.sound_taa.stop();soundIqro2.sound_taa.release();
            soundIqro2.sound_taata.stop();soundIqro2.sound_taata.release();
            soundIqro2.sound_tada.stop();soundIqro2.sound_tada.release();
            soundIqro2.sound_tadza.stop();soundIqro2.sound_tadza.release();
            soundIqro2.sound_tajai.stop();soundIqro2.sound_tajai.release();
            soundIqro2.sound_taro.stop();soundIqro2.sound_taro.release();
            soundIqro2.sound_tata.stop();soundIqro2.sound_tata.release();
            soundIqro2.sound_tokha.stop();soundIqro2.sound_tokha.release();
            soundIqro2.sound_tsatsa.stop();soundIqro2.sound_tsatsa.release();
            soundIqro2.sound_zama.stop();soundIqro2.sound_zama.release();
            soundIqro2.sound_badaro.stop();soundIqro2.sound_badaro.release();
            soundIqro2.sound_badzana.stop();soundIqro2.sound_badzana.release();
            soundIqro2.sound_banana.stop();soundIqro2.sound_banana.release();
            soundIqro2.sound_banaro.stop();soundIqro2.sound_banaro.release();
            soundIqro2.sound_banata.stop();soundIqro2.sound_banata.release();
            soundIqro2.sound_dzakhaba.stop();soundIqro2.sound_dzakhaba.release();
            soundIqro2.sound_dzaroha.stop();soundIqro2.sound_dzaroha.release();
            soundIqro2.sound_nabaa.stop();soundIqro2.sound_nabaa.release();
            soundIqro2.sound_nabaalif.stop();soundIqro2.sound_nabaalif.release();
            soundIqro2.sound_nababa.stop();soundIqro2.sound_nababa.release();
            soundIqro2.sound_nabadza.stop();soundIqro2.sound_nabadza.release();
            soundIqro2.sound_nabata.stop();soundIqro2.sound_nabata.release();
            soundIqro2.sound_nadzaro.stop();soundIqro2.sound_nadzaro.release();
            soundIqro2.sound_nanana.stop();soundIqro2.sound_nanana.release();
            soundIqro2.sound_naroain.stop();soundIqro2.sound_naroain.release();
            soundIqro2.sound_nataba.stop();soundIqro2.sound_nataba.release();
            soundIqro2.sound_natana.stop();soundIqro2.sound_natana.release();
            soundIqro2.sound_nawafa.stop();soundIqro2.sound_nawafa.release();
            soundIqro2.sound_robana.stop();soundIqro2.sound_robana.release();
            soundIqro2.sound_tabana.stop();soundIqro2.sound_tabana.release();
            soundIqro2.sound_tatsaba.stop();soundIqro2.sound_tatsaba.release();
            soundIqro2.sound_tsabata.stop();soundIqro2.sound_tsabata.release();
            soundIqro2.sound_wanaa.stop();soundIqro2.sound_wanaa.release();
            soundIqro2.sound_wanadza.stop();soundIqro2.sound_wanadza.release();
            soundIqro2.sound_ataya.stop();soundIqro2.sound_ataya.release();
            soundIqro2.sound_atsatsa.stop();soundIqro2.sound_atsatsa.release();
            soundIqro2.sound_ayata.stop();soundIqro2.sound_ayata.release();
            soundIqro2.sound_bayana.stop();soundIqro2.sound_bayana.release();
            soundIqro2.sound_danaya.stop();soundIqro2.sound_danaya.release();
            soundIqro2.sound_fataya.stop();soundIqro2.sound_fataya.release();
            soundIqro2.sound_nabaya.stop();soundIqro2.sound_nabaya.release();
            soundIqro2.sound_nadhoro.stop();soundIqro2.sound_nadhoro.release();
            soundIqro2.sound_najaila.stop();soundIqro2.sound_najaila.release();
            soundIqro2.sound_robaya.stop();soundIqro2.sound_robaya.release();
            soundIqro2.sound_rojaiqo.stop();soundIqro2.sound_rojaiqo.release();
            soundIqro2.sound_ronaya.stop();soundIqro2.sound_ronaya.release();
            soundIqro2.sound_sayala.stop();soundIqro2.sound_sayala.release();
            soundIqro2.sound_tsanaa.stop();soundIqro2.sound_tsanaa.release();
            soundIqro2.sound_wanada.stop();soundIqro2.sound_wanada.release();
            soundIqro2.sound_yaaba.stop();soundIqro2.sound_yaaba.release();
            soundIqro2.sound_yabaro.stop();soundIqro2.sound_yabaro.release();
            soundIqro2.sound_yadana.stop();soundIqro2.sound_yadana.release();
            soundIqro2.sound_yanaro.stop();soundIqro2.sound_yanaro.release();
            soundIqro2.sound_yasaro.stop();soundIqro2.sound_yasaro.release();
            soundIqro2.sound_yayaya.stop();soundIqro2.sound_yayaya.release();

        }
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(MetodeIqro2.this,MetodeIqro.class);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
        finish();
        soundIqro2.sound_baa.stop();soundIqro2.sound_baa.release();
        soundIqro2.sound_baata.stop();soundIqro2.sound_baata.release();
        soundIqro2.sound_baba.stop();soundIqro2.sound_baba.release();
        soundIqro2.sound_badza.stop();soundIqro2.sound_badza.release();
        soundIqro2.sound_baro.stop();soundIqro2.sound_baro.release();
        soundIqro2.sound_batsa.stop();soundIqro2.sound_batsa.release();
        soundIqro2.sound_bawa.stop();soundIqro2.sound_bawa.release();
        soundIqro2.sound_jaitsa.stop();soundIqro2.sound_jaitsa.release();
        soundIqro2.sound_kana.stop();soundIqro2.sound_kana.release();
        soundIqro2.sound_saain.stop();soundIqro2.sound_saain.release();
        soundIqro2.sound_taa.stop();soundIqro2.sound_taa.release();
        soundIqro2.sound_taata.stop();soundIqro2.sound_taata.release();
        soundIqro2.sound_tada.stop();soundIqro2.sound_tada.release();
        soundIqro2.sound_tadza.stop();soundIqro2.sound_tadza.release();
        soundIqro2.sound_tajai.stop();soundIqro2.sound_tajai.release();
        soundIqro2.sound_taro.stop();soundIqro2.sound_taro.release();
        soundIqro2.sound_tata.stop();soundIqro2.sound_tata.release();
        soundIqro2.sound_tokha.stop();soundIqro2.sound_tokha.release();
        soundIqro2.sound_tsatsa.stop();soundIqro2.sound_tsatsa.release();
        soundIqro2.sound_zama.stop();soundIqro2.sound_zama.release();
        soundIqro2.sound_badaro.stop();soundIqro2.sound_badaro.release();
        soundIqro2.sound_badzana.stop();soundIqro2.sound_badzana.release();
        soundIqro2.sound_banana.stop();soundIqro2.sound_banana.release();
        soundIqro2.sound_banaro.stop();soundIqro2.sound_banaro.release();
        soundIqro2.sound_banata.stop();soundIqro2.sound_banata.release();
        soundIqro2.sound_dzakhaba.stop();soundIqro2.sound_dzakhaba.release();
        soundIqro2.sound_dzaroha.stop();soundIqro2.sound_dzaroha.release();
        soundIqro2.sound_nabaa.stop();soundIqro2.sound_nabaa.release();
        soundIqro2.sound_nabaalif.stop();soundIqro2.sound_nabaalif.release();
        soundIqro2.sound_nababa.stop();soundIqro2.sound_nababa.release();
        soundIqro2.sound_nabadza.stop();soundIqro2.sound_nabadza.release();
        soundIqro2.sound_nabata.stop();soundIqro2.sound_nabata.release();
        soundIqro2.sound_nadzaro.stop();soundIqro2.sound_nadzaro.release();
        soundIqro2.sound_nanana.stop();soundIqro2.sound_nanana.release();
        soundIqro2.sound_naroain.stop();soundIqro2.sound_naroain.release();
        soundIqro2.sound_nataba.stop();soundIqro2.sound_nataba.release();
        soundIqro2.sound_natana.stop();soundIqro2.sound_natana.release();
        soundIqro2.sound_nawafa.stop();soundIqro2.sound_nawafa.release();
        soundIqro2.sound_robana.stop();soundIqro2.sound_robana.release();
        soundIqro2.sound_tabana.stop();soundIqro2.sound_tabana.release();
        soundIqro2.sound_tatsaba.stop();soundIqro2.sound_tatsaba.release();
        soundIqro2.sound_tsabata.stop();soundIqro2.sound_tsabata.release();
        soundIqro2.sound_wanaa.stop();soundIqro2.sound_wanaa.release();
        soundIqro2.sound_wanadza.stop();soundIqro2.sound_wanadza.release();
        soundIqro2.sound_ataya.stop();soundIqro2.sound_ataya.release();
        soundIqro2.sound_atsatsa.stop();soundIqro2.sound_atsatsa.release();
        soundIqro2.sound_ayata.stop();soundIqro2.sound_ayata.release();
        soundIqro2.sound_bayana.stop();soundIqro2.sound_bayana.release();
        soundIqro2.sound_danaya.stop();soundIqro2.sound_danaya.release();
        soundIqro2.sound_fataya.stop();soundIqro2.sound_fataya.release();
        soundIqro2.sound_nabaya.stop();soundIqro2.sound_nabaya.release();
        soundIqro2.sound_nadhoro.stop();soundIqro2.sound_nadhoro.release();
        soundIqro2.sound_najaila.stop();soundIqro2.sound_najaila.release();
        soundIqro2.sound_robaya.stop();soundIqro2.sound_robaya.release();
        soundIqro2.sound_rojaiqo.stop();soundIqro2.sound_rojaiqo.release();
        soundIqro2.sound_ronaya.stop();soundIqro2.sound_ronaya.release();
        soundIqro2.sound_sayala.stop();soundIqro2.sound_sayala.release();
        soundIqro2.sound_tsanaa.stop();soundIqro2.sound_tsanaa.release();
        soundIqro2.sound_wanada.stop();soundIqro2.sound_wanada.release();
        soundIqro2.sound_yaaba.stop();soundIqro2.sound_yaaba.release();
        soundIqro2.sound_yabaro.stop();soundIqro2.sound_yabaro.release();
        soundIqro2.sound_yadana.stop();soundIqro2.sound_yadana.release();
        soundIqro2.sound_yanaro.stop();soundIqro2.sound_yanaro.release();
        soundIqro2.sound_yasaro.stop();soundIqro2.sound_yasaro.release();
        soundIqro2.sound_yayaya.stop();soundIqro2.sound_yayaya.release();

    }
}