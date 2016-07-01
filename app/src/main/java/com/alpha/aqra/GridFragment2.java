package com.alpha.aqra;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by alphaenciel on 6/20/2016.
 */
@SuppressLint("ValidFragment")
public class GridFragment2 extends Fragment {

    private GridView mGridView;
    private GridAdapter2 mGridAdapter2;
    GridItems2[] GridItems2 = {};
    private Activity activity;
    SoundIqro2 soundIqro2;


    public GridFragment2(GridItems2[] GridItems2, Activity activity) {
        this.GridItems2 = GridItems2;
        this.activity = activity;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.grid2, container, false);
        mGridView = (GridView) view.findViewById(R.id.gridView2);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (activity != null) {

            mGridAdapter2 = new GridAdapter2(activity, GridItems2);
            if (mGridView != null) {
                mGridView.setAdapter(mGridAdapter2);
            }

            mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView parent, View view,
                                        int position, long id) {
                    onGridItemClick((GridView) parent, view, position, id);
                }
            });
        }
    }

    public void onGridItemClick(GridView g, View v, int position, long id) {
        if (GridItems2[position].title=="1"){soundIqro2.sound_bawa.start();}
        else if (GridItems2[position].title=="2"){soundIqro2.sound_baro.start();}
        else if (GridItems2[position].title=="3"){soundIqro2.sound_tada.start();}
        else if (GridItems2[position].title=="4"){soundIqro2.sound_tata.start();}
        else if (GridItems2[position].title=="5"){soundIqro2.sound_tajai.start();}
        else if (GridItems2[position].title=="6"){soundIqro2.sound_taro.start();}
        else if (GridItems2[position].title=="7"){soundIqro2.sound_badza.start();}
        else if (GridItems2[position].title=="8"){soundIqro2.sound_baba.start();}
        else if (GridItems2[position].title=="9"){soundIqro2.sound_jaitsa.start();}
        else if (GridItems2[position].title=="10"){soundIqro2.sound_tsatsa.start();}
        else if (GridItems2[position].title=="11"){soundIqro2.sound_tadza.start();}
        else if (GridItems2[position].title=="12"){soundIqro2.sound_batsa.start();}
        else if (GridItems2[position].title=="13"){soundIqro2.sound_baro.start();}
        else if (GridItems2[position].title=="14"){soundIqro2.sound_badza.start();}
        else if (GridItems2[position].title=="15"){soundIqro2.sound_tada.start();}
        else if (GridItems2[position].title=="16"){soundIqro2.sound_taro.start();}
        else if (GridItems2[position].title=="17"){soundIqro2.sound_taata.start();}
        else if (GridItems2[position].title=="18"){soundIqro2.sound_taa.start();}
        else if (GridItems2[position].title=="19"){soundIqro2.sound_baata.start();}
        else if (GridItems2[position].title=="20"){soundIqro2.sound_baa.start();}
        else if (GridItems2[position].title=="21"){soundIqro2.sound_jaitsa.start();}
        else if (GridItems2[position].title=="22"){soundIqro2.sound_baa.start();}
        else if (GridItems2[position].title=="23"){soundIqro2.sound_badza.start();}
        else if (GridItems2[position].title=="24"){soundIqro2.sound_taa.start();}
        else if (GridItems2[position].title=="25"){soundIqro2.sound_saain.start();}
        else if (GridItems2[position].title=="26"){soundIqro2.sound_kana.start();}
        else if (GridItems2[position].title=="27"){soundIqro2.sound_zama.start();}
        else if (GridItems2[position].title=="28"){soundIqro2.sound_tokha.start();}
        else if (GridItems2[position].title=="29"){soundIqro2.sound_banana.start();}
        else if (GridItems2[position].title=="30"){soundIqro2.sound_nababa.start();}
        else if (GridItems2[position].title=="31"){soundIqro2.sound_natana.start();}
        else if (GridItems2[position].title=="32"){soundIqro2.sound_nanana.start();}
        else if (GridItems2[position].title=="33"){soundIqro2.sound_nataba.start();}
        else if (GridItems2[position].title=="34"){soundIqro2.sound_tabana.start();}
        else if (GridItems2[position].title=="35"){soundIqro2.sound_banata.start();}
        else if (GridItems2[position].title=="36"){soundIqro2.sound_nabata.start();}
        else if (GridItems2[position].title=="37"){soundIqro2.sound_nabadza.start();}
        else if (GridItems2[position].title=="38"){soundIqro2.sound_badzana.start();}
        else if (GridItems2[position].title=="39"){soundIqro2.sound_banaro.start();}
        else if (GridItems2[position].title=="40"){soundIqro2.sound_robana.start();}
        else if (GridItems2[position].title=="41"){soundIqro2.sound_wanadza.start();}
        else if (GridItems2[position].title=="42"){soundIqro2.sound_dzakhaba.start();}
        else if (GridItems2[position].title=="43"){soundIqro2.sound_nadzaro.start();}
        else if (GridItems2[position].title=="44"){soundIqro2.sound_badaro.start();}
        else if (GridItems2[position].title=="45"){soundIqro2.sound_dzakhaba.start();}
        else if (GridItems2[position].title=="46"){soundIqro2.sound_badaro.start();}
        else if (GridItems2[position].title=="47"){soundIqro2.sound_wanadza.start();}
        else if (GridItems2[position].title=="48"){soundIqro2.sound_nadzaro.start();}
        else if (GridItems2[position].title=="49"){soundIqro2.sound_nabaa.start();}
        else if (GridItems2[position].title=="50"){soundIqro2.sound_nabaalif.start();}
        else if (GridItems2[position].title=="51"){soundIqro2.sound_naroain.start();}
        else if (GridItems2[position].title=="52"){soundIqro2.sound_dzaroha.start();}
        else if (GridItems2[position].title=="53"){soundIqro2.sound_nawafa.start();}
        else if (GridItems2[position].title=="54"){soundIqro2.sound_wanaa.start();}
        else if (GridItems2[position].title=="55"){soundIqro2.sound_tatsaba.start();}
        else if (GridItems2[position].title=="56"){soundIqro2.sound_tsabata.start();}
        else if (GridItems2[position].title=="57"){soundIqro2.sound_yanaro.start();}
        else if (GridItems2[position].title=="58"){soundIqro2.sound_ronaya.start();}
        else if (GridItems2[position].title=="59"){soundIqro2.sound_yabaro.start();}
        else if (GridItems2[position].title=="60"){soundIqro2.sound_robaya.start();}
        else if (GridItems2[position].title=="61"){soundIqro2.sound_danaya.start();}
        else if (GridItems2[position].title=="62"){soundIqro2.sound_yadana.start();}
        else if (GridItems2[position].title=="63"){soundIqro2.sound_nabaya.start();}
        else if (GridItems2[position].title=="64"){soundIqro2.sound_bayana.start();}
        else if (GridItems2[position].title=="65"){soundIqro2.sound_yadaya.start();}
        else if (GridItems2[position].title=="66"){soundIqro2.sound_nadzaro.start();}
        else if (GridItems2[position].title=="67"){soundIqro2.sound_najaila.start();}
        else if (GridItems2[position].title=="68"){soundIqro2.sound_dzakhaba.start();}
        else if (GridItems2[position].title=="69"){soundIqro2.sound_bayana.start();}
        else if (GridItems2[position].title=="70"){soundIqro2.sound_yabaro.start();}
        else if (GridItems2[position].title=="71"){soundIqro2.sound_danaya.start();}
        else if (GridItems2[position].title=="72"){soundIqro2.sound_yadana.start();}
        else if (GridItems2[position].title=="73"){soundIqro2.sound_ayata.start();}
        else if (GridItems2[position].title=="74"){soundIqro2.sound_yaaba.start();}
        else if (GridItems2[position].title=="75"){soundIqro2.sound_tsanaa.start();}
        else if (GridItems2[position].title=="76"){soundIqro2.sound_atsatsa.start();}
        else if (GridItems2[position].title=="77"){soundIqro2.sound_wanada.start();}
        else if (GridItems2[position].title=="78"){soundIqro2.sound_ataya.start();}
        else if (GridItems2[position].title=="79"){soundIqro2.sound_nadhoro.start();}
        else if (GridItems2[position].title=="80"){soundIqro2.sound_rojaiqo.start();}
        else if (GridItems2[position].title=="81"){soundIqro2.sound_yasaro.start();}
        else if (GridItems2[position].title=="82"){soundIqro2.sound_sayala.start();}
        else if (GridItems2[position].title=="83"){soundIqro2.sound_fataya.start();}
        else if (GridItems2[position].title=="84"){soundIqro2.sound_yayaya.start();}
        Toast.makeText(
                activity,
                "Position Clicked: - " + position + " & " + "Text is: - "
                        + GridItems2[position].title, Toast.LENGTH_LONG).show();
        Log.e("TAG", "POSITION CLICKED " + position);
    }
}
