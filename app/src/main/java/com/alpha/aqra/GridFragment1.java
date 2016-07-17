package com.alpha.aqra;

/**
 * Created by alphaenciel on 6/19/2016.
 */

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

@SuppressLint("ValidFragment")
public class GridFragment1 extends Fragment {

    private GridView mGridView;
    private GridAdapter1 mGridAdapter1;
    GridItems1[] GridItems1 = {};
    private Activity activity;
    IqroTitle iqroTitle;
    SoundIqro1 soundIqro1;
    MediaPlayer so;
    Context context;


    public GridFragment1(GridItems1[] GridItems1, Activity activity) {
        this.GridItems1 = GridItems1;
        this.activity = activity;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.grid1, container, false);
        mGridView = (GridView) view.findViewById(R.id.gridView);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (activity != null) {
        //so = MediaPlayer.create(context,R.raw.slide1_1);
            mGridAdapter1 = new GridAdapter1(activity, GridItems1);
            if (mGridView != null) {
                mGridView.setAdapter(mGridAdapter1);
            }

            mGridView.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView parent, View view,
                                        int position, long id) {
                   onGridItemClick((GridView) parent, view, position, id);
                    //if(position==1){so.start();}
                    //if(position==1)soundIqro1.play(context, R.raw.slide1_1);
                }
            });
        }
    }

    public void onGridItemClick(GridView g, View v, int position, long id) {
        if (GridItems1[position].title=="1"){soundIqro1.sound_ba.start();}
        else if (GridItems1[position].title=="2"){soundIqro1.sound_a.start();}
        else if (GridItems1[position].title=="3"){soundIqro1.sound_ba.start();}
        else if (GridItems1[position].title=="4"){soundIqro1.sound_a.start();}
        else if (GridItems1[position].title=="5"){soundIqro1.sound_ba.start();}
        else if (GridItems1[position].title=="6"){soundIqro1.sound_ta.start();}
        else if (GridItems1[position].title=="7"){soundIqro1.sound_a.start();}
        else if (GridItems1[position].title=="8"){soundIqro1.sound_ba.start();}
        else if (GridItems1[position].title=="9"){soundIqro1.sound_ta.start();}
        else if (GridItems1[position].title=="10"){soundIqro1.sound_a.start();}
        else if (GridItems1[position].title=="11"){soundIqro1.sound_ta.start();}
        else if (GridItems1[position].title=="12"){soundIqro1.sound_tsa.start();}
        else if (GridItems1[position].title=="13"){soundIqro1.sound_ta.start();}
        else if (GridItems1[position].title=="14"){soundIqro1.sound_ba.start();}
        else if (GridItems1[position].title=="15"){soundIqro1.sound_ta.start();}
        else if (GridItems1[position].title=="16"){soundIqro1.sound_ha.start();}
        else if (GridItems1[position].title=="17"){soundIqro1.sound_za.start();}
        else if (GridItems1[position].title=="18"){soundIqro1.sound_a.start();}
        else if (GridItems1[position].title=="19"){soundIqro1.sound_za.start();}
        else if (GridItems1[position].title=="20"){soundIqro1.sound_tsa.start();}
        else if (GridItems1[position].title=="21"){soundIqro1.sound_za.start();}
        else if (GridItems1[position].title=="22"){soundIqro1.sound_tsa.start();}
        else if (GridItems1[position].title=="23"){soundIqro1.sound_ha.start();}
        else if (GridItems1[position].title=="24"){soundIqro1.sound_a.start();}
        else if (GridItems1[position].title=="25"){soundIqro1.sound_za.start();}
        else if (GridItems1[position].title=="26"){soundIqro1.sound_tsa.start();}
        else if (GridItems1[position].title=="27"){soundIqro1.sound_ho.start();}
        else if (GridItems1[position].title=="28"){soundIqro1.sound_a.start();}
        else if (GridItems1[position].title=="29"){soundIqro1.sound_a.start();}
        else if (GridItems1[position].title=="30"){soundIqro1.sound_ha.start();}
        else if (GridItems1[position].title=="31"){soundIqro1.sound_tsa.start();}
        else if (GridItems1[position].title=="32"){soundIqro1.sound_ha.start();}
        else if (GridItems1[position].title=="33"){soundIqro1.sound_ho.start();}
        else if (GridItems1[position].title=="34"){soundIqro1.sound_ha.start();}
        else if (GridItems1[position].title=="35"){soundIqro1.sound_ho.start();}
        else if (GridItems1[position].title=="36"){soundIqro1.sound_da.start();}
        else if (GridItems1[position].title=="37"){soundIqro1.sound_ro.start();}
        else if (GridItems1[position].title=="38"){soundIqro1.sound_jai.start();}
        else if (GridItems1[position].title=="39"){soundIqro1.sound_ho.start();}
        else if (GridItems1[position].title=="40"){soundIqro1.sound_da.start();}
        else if (GridItems1[position].title=="41"){soundIqro1.sound_dza.start();}
        else if (GridItems1[position].title=="42"){soundIqro1.sound_sa.start();}
        else if (GridItems1[position].title=="43"){soundIqro1.sound_a.start();}
        else if (GridItems1[position].title=="44"){soundIqro1.sound_ro.start();}
        else if (GridItems1[position].title=="45"){soundIqro1.sound_jai.start();}
        else if (GridItems1[position].title=="46"){soundIqro1.sound_sya.start();}
        else if (GridItems1[position].title=="47"){soundIqro1.sound_jai.start();}
        else if (GridItems1[position].title=="48"){soundIqro1.sound_sya.start();}
        else if (GridItems1[position].title=="49"){soundIqro1.sound_sa.start();}
        else if (GridItems1[position].title=="50"){soundIqro1.sound_sa.start();}
        else if (GridItems1[position].title=="51"){soundIqro1.sound_syo.start();}
        else if (GridItems1[position].title=="52"){soundIqro1.sound_sa.start();}
        else if (GridItems1[position].title=="53"){soundIqro1.sound_jai.start();}
        else if (GridItems1[position].title=="54"){soundIqro1.sound_syo.start();}
        else if (GridItems1[position].title=="55"){soundIqro1.sound_syo.start();}
        else if (GridItems1[position].title=="56"){soundIqro1.sound_tho.start();}
        else if (GridItems1[position].title=="57"){soundIqro1.sound_to.start();}
        else if (GridItems1[position].title=="58"){soundIqro1.sound_ro.start();}
        else if (GridItems1[position].title=="59"){soundIqro1.sound_ha.start();}
        else if (GridItems1[position].title=="60"){soundIqro1.sound_syo.start();}
        else if (GridItems1[position].title=="61"){soundIqro1.sound_a.start();}
        else if (GridItems1[position].title=="62"){soundIqro1.sound_dho.start();}
        else if (GridItems1[position].title=="63"){soundIqro1.sound_to.start();}
        else if (GridItems1[position].title=="64"){soundIqro1.sound_ba.start();}
        else if (GridItems1[position].title=="65"){soundIqro1.sound_dho.start();}
        else if (GridItems1[position].title=="66"){soundIqro1.sound_to.start();}
        else if (GridItems1[position].title=="67"){soundIqro1.sound_ain.start();}
        else if (GridItems1[position].title=="68"){soundIqro1.sound_dho.start();}
        else if (GridItems1[position].title=="69"){soundIqro1.sound_da.start();}
        else if (GridItems1[position].title=="70"){soundIqro1.sound_gho.start();}
        else if (GridItems1[position].title=="71"){soundIqro1.sound_fa.start();}
        else if (GridItems1[position].title=="72"){soundIqro1.sound_gho.start();}
        else if (GridItems1[position].title=="73"){soundIqro1.sound_tho.start();}
        else if (GridItems1[position].title=="74"){soundIqro1.sound_qo.start();}
        else if (GridItems1[position].title=="75"){soundIqro1.sound_fa.start();}
        else if (GridItems1[position].title=="76"){soundIqro1.sound_qo.start();}
        else if (GridItems1[position].title=="77"){soundIqro1.sound_ka.start();}
        else if (GridItems1[position].title=="78"){soundIqro1.sound_ho.start();}
        else if (GridItems1[position].title=="79"){soundIqro1.sound_fa.start();}
        else if (GridItems1[position].title=="80"){soundIqro1.sound_ka.start();}
        else if (GridItems1[position].title=="81"){soundIqro1.sound_ma.start();}
        else if (GridItems1[position].title=="82"){soundIqro1.sound_gho.start();}
        else if (GridItems1[position].title=="83"){soundIqro1.sound_la.start();}
        else if (GridItems1[position].title=="84"){soundIqro1.sound_na.start();}
        else if (GridItems1[position].title=="85"){soundIqro1.sound_qo.start();}
        else if (GridItems1[position].title=="86"){soundIqro1.sound_ya.start();}
        else if (GridItems1[position].title=="87"){soundIqro1.sound_tho.start();}
        else if (GridItems1[position].title=="88"){soundIqro1.sound_da.start();}
        else if (GridItems1[position].title=="89"){soundIqro1.sound_za.start();}
        else if (GridItems1[position].title=="90"){soundIqro1.sound_kha.start();}
        /*
        Toast.makeText(
                activity,
                "Position Clicked: - " + position + " & " + "Text is: - "
                        + GridItems1[position].title, Toast.LENGTH_LONG).show();
        Log.e("TAG", "POSITION CLICKED " + position);
        */
        //iqroTitle.setTitle("1");
    }

}
