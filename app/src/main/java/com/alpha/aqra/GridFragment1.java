package com.alpha.aqra;

/**
 * Created by alphaenciel on 6/19/2016.
 */

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
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

            mGridAdapter1 = new GridAdapter1(activity, GridItems1);
            if (mGridView != null) {
                mGridView.setAdapter(mGridAdapter1);
            }

            mGridView.setOnItemClickListener(new OnItemClickListener() {
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
                        + GridItems1[position].title, Toast.LENGTH_LONG).show();
        Log.e("TAG", "POSITION CLICKED " + position);
    }
}
