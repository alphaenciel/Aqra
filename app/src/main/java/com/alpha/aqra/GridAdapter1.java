package com.alpha.aqra;

/**
 * Created by alphaenciel on 6/19/2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter1 extends BaseAdapter {

    Context context;

    public class ViewHolder {
        public ImageView imageView;
        public TextView textTitle;
    }

    private GridItems1[] items;
    private LayoutInflater mInflater;

    public GridAdapter1(Context context, GridItems1[] locations) {

        mInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
        items = locations;

    }

    public GridItems1[] getItems() {
        return items;
    }

    public void setItems(GridItems1[] items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        if (items != null) {
            return items.length;
        }
        return 0;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public Object getItem(int position) {
        if (items != null && position >= 0 && position < getCount()) {
            return items[position];
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        if (items != null && position >= 0 && position < getCount()) {
            return items[position].id;
        }
        return 0;
    }

    public void setItemsList(GridItems1[] locations) {
        this.items = locations;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        ViewHolder viewHolder;

        if (view == null) {

            view = mInflater.inflate(R.layout.custom1, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) view
                    .findViewById(R.id.grid_item_image);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        GridItems1 gridItems = items[position];
        setCatImage(position, viewHolder, gridItems.title);
        return view;
    }

    private void setCatImage(int pos, ViewHolder viewHolder, String catTitle) {
        if(catTitle=="1"){viewHolder.imageView.setImageResource(R.drawable.is_1_ba);}
        if(catTitle=="2"){viewHolder.imageView.setImageResource(R.drawable.is_1_a);}
        if(catTitle=="3"){viewHolder.imageView.setImageResource(R.drawable.is_1_ba);}
        if(catTitle=="4"){viewHolder.imageView.setImageResource(R.drawable.is_1_a);}
        if(catTitle=="5"){viewHolder.imageView.setImageResource(R.drawable.is_1_ba);}
        if(catTitle=="6"){viewHolder.imageView.setImageResource(R.drawable.is_1_ta);}
        if(catTitle=="7"){viewHolder.imageView.setImageResource(R.drawable.is_1_a);}
        if(catTitle=="8"){viewHolder.imageView.setImageResource(R.drawable.is_1_ba);}
        if(catTitle=="9"){viewHolder.imageView.setImageResource(R.drawable.is_1_ta);}
        if(catTitle=="10"){viewHolder.imageView.setImageResource(R.drawable.is_1_a);}
        if(catTitle=="11"){viewHolder.imageView.setImageResource(R.drawable.is_1_ta);}
        if(catTitle=="12"){viewHolder.imageView.setImageResource(R.drawable.is_1_tsa);}
        if(catTitle=="13"){viewHolder.imageView.setImageResource(R.drawable.is_1_ta);}
        if(catTitle=="14"){viewHolder.imageView.setImageResource(R.drawable.is_1_ba);}
        if(catTitle=="15"){viewHolder.imageView.setImageResource(R.drawable.is_1_ta);}
        if(catTitle=="16"){viewHolder.imageView.setImageResource(R.drawable.is_1_ha);}
        if(catTitle=="17"){viewHolder.imageView.setImageResource(R.drawable.is_1_za);}
        if(catTitle=="18"){viewHolder.imageView.setImageResource(R.drawable.is_1_a);}
        if(catTitle=="19"){viewHolder.imageView.setImageResource(R.drawable.is_1_za);}
        if(catTitle=="20"){viewHolder.imageView.setImageResource(R.drawable.is_1_tsa);}
        if(catTitle=="21"){viewHolder.imageView.setImageResource(R.drawable.is_1_za);}
        if(catTitle=="22"){viewHolder.imageView.setImageResource(R.drawable.is_1_tsa);}
        if(catTitle=="23"){viewHolder.imageView.setImageResource(R.drawable.is_1_ha);}
        if(catTitle=="24"){viewHolder.imageView.setImageResource(R.drawable.is_1_a);}
        if(catTitle=="25"){viewHolder.imageView.setImageResource(R.drawable.is_1_za);}
        if(catTitle=="26"){viewHolder.imageView.setImageResource(R.drawable.is_1_tsa);}
        if(catTitle=="27"){viewHolder.imageView.setImageResource(R.drawable.is_1_ho);}
        if(catTitle=="28"){viewHolder.imageView.setImageResource(R.drawable.is_1_a);}
        if(catTitle=="29"){viewHolder.imageView.setImageResource(R.drawable.is_1_a);}
        if(catTitle=="30"){viewHolder.imageView.setImageResource(R.drawable.is_1_ha);}
        if(catTitle=="31"){viewHolder.imageView.setImageResource(R.drawable.is_1_tsa);}
        if(catTitle=="32"){viewHolder.imageView.setImageResource(R.drawable.is_1_ha);}
        if(catTitle=="33"){viewHolder.imageView.setImageResource(R.drawable.is_1_ho);}
        if(catTitle=="34"){viewHolder.imageView.setImageResource(R.drawable.is_1_ha);}
        if(catTitle=="35"){viewHolder.imageView.setImageResource(R.drawable.is_1_ho);}
        if(catTitle=="36"){viewHolder.imageView.setImageResource(R.drawable.is_1_da);}
        if(catTitle=="37"){viewHolder.imageView.setImageResource(R.drawable.is_1_ro);}
        if(catTitle=="38"){viewHolder.imageView.setImageResource(R.drawable.is_1_jai);}
        if(catTitle=="39"){viewHolder.imageView.setImageResource(R.drawable.is_1_ho);}
        if(catTitle=="40"){viewHolder.imageView.setImageResource(R.drawable.is_1_da);}
        if(catTitle=="41"){viewHolder.imageView.setImageResource(R.drawable.is_1_dza);}
        if(catTitle=="42"){viewHolder.imageView.setImageResource(R.drawable.is_1_sa);}
        if(catTitle=="43"){viewHolder.imageView.setImageResource(R.drawable.is_1_a);}
        if(catTitle=="44"){viewHolder.imageView.setImageResource(R.drawable.is_1_ro);}
        if(catTitle=="45"){viewHolder.imageView.setImageResource(R.drawable.is_1_jai);}
        if(catTitle=="46"){viewHolder.imageView.setImageResource(R.drawable.is_1_sya);}
        if(catTitle=="47"){viewHolder.imageView.setImageResource(R.drawable.is_1_jai);}
        if(catTitle=="48"){viewHolder.imageView.setImageResource(R.drawable.is_1_sya);}
        if(catTitle=="49"){viewHolder.imageView.setImageResource(R.drawable.is_1_sa);}
        if(catTitle=="50"){viewHolder.imageView.setImageResource(R.drawable.is_1_sa);}
        if(catTitle=="51"){viewHolder.imageView.setImageResource(R.drawable.is_1_syo);}
        if(catTitle=="52"){viewHolder.imageView.setImageResource(R.drawable.is_1_sa);}
        if(catTitle=="53"){viewHolder.imageView.setImageResource(R.drawable.is_1_jai);}
        if(catTitle=="54"){viewHolder.imageView.setImageResource(R.drawable.is_1_syo);}
        if(catTitle=="55"){viewHolder.imageView.setImageResource(R.drawable.is_1_syo);}
        if(catTitle=="56"){viewHolder.imageView.setImageResource(R.drawable.is_1_dho);}
        if(catTitle=="57"){viewHolder.imageView.setImageResource(R.drawable.is_1_to);}
        if(catTitle=="58"){viewHolder.imageView.setImageResource(R.drawable.is_1_ro);}
        if(catTitle=="59"){viewHolder.imageView.setImageResource(R.drawable.is_1_ha);}
        if(catTitle=="60"){viewHolder.imageView.setImageResource(R.drawable.is_1_syo);}
        if(catTitle=="61"){viewHolder.imageView.setImageResource(R.drawable.is_1_a);}
        if(catTitle=="62"){viewHolder.imageView.setImageResource(R.drawable.is_1_tho);}
        if(catTitle=="63"){viewHolder.imageView.setImageResource(R.drawable.is_1_to);}
        if(catTitle=="64"){viewHolder.imageView.setImageResource(R.drawable.is_1_ba);}
        if(catTitle=="65"){viewHolder.imageView.setImageResource(R.drawable.is_1_tho);}
        if(catTitle=="66"){viewHolder.imageView.setImageResource(R.drawable.is_1_to);}
        if(catTitle=="67"){viewHolder.imageView.setImageResource(R.drawable.is_1_ain);}
        if(catTitle=="68"){viewHolder.imageView.setImageResource(R.drawable.is_1_tho);}
        if(catTitle=="69"){viewHolder.imageView.setImageResource(R.drawable.is_1_da);}
        if(catTitle=="70"){viewHolder.imageView.setImageResource(R.drawable.is_1_gha);}
        if(catTitle=="71"){viewHolder.imageView.setImageResource(R.drawable.is_1_fa);}
        if(catTitle=="72"){viewHolder.imageView.setImageResource(R.drawable.is_1_gha);}
        if(catTitle=="73"){viewHolder.imageView.setImageResource(R.drawable.is_1_dho);}
        if(catTitle=="74"){viewHolder.imageView.setImageResource(R.drawable.is_1_kho);}
        if(catTitle=="75"){viewHolder.imageView.setImageResource(R.drawable.is_1_fa);}
        if(catTitle=="76"){viewHolder.imageView.setImageResource(R.drawable.is_1_kho);}
        if(catTitle=="77"){viewHolder.imageView.setImageResource(R.drawable.is_1_ka);}
        if(catTitle=="78"){viewHolder.imageView.setImageResource(R.drawable.is_1_ho);}
        if(catTitle=="79"){viewHolder.imageView.setImageResource(R.drawable.is_1_fa);}
        if(catTitle=="80"){viewHolder.imageView.setImageResource(R.drawable.is_1_ka);}
        if(catTitle=="81"){viewHolder.imageView.setImageResource(R.drawable.is_1_ma);}
        if(catTitle=="82"){viewHolder.imageView.setImageResource(R.drawable.is_1_gha);}
        if(catTitle=="83"){viewHolder.imageView.setImageResource(R.drawable.is_1_la);}
        if(catTitle=="84"){viewHolder.imageView.setImageResource(R.drawable.is_1_na);}
        if(catTitle=="85"){viewHolder.imageView.setImageResource(R.drawable.is_1_kho);}
        if(catTitle=="86"){viewHolder.imageView.setImageResource(R.drawable.is_1_ya);}
        if(catTitle=="87"){viewHolder.imageView.setImageResource(R.drawable.is_1_dho);}
        if(catTitle=="88"){viewHolder.imageView.setImageResource(R.drawable.is_1_da);}
        if(catTitle=="89"){viewHolder.imageView.setImageResource(R.drawable.is_1_za);}
        if(catTitle=="90"){viewHolder.imageView.setImageResource(R.drawable.is_1_kha);}
    }
}
