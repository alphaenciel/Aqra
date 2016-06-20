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

        Toast.makeText(
                activity,
                "Position Clicked: - " + position + " & " + "Text is: - "
                        + GridItems2[position].title, Toast.LENGTH_LONG).show();
        Log.e("TAG", "POSITION CLICKED " + position);
    }
}
