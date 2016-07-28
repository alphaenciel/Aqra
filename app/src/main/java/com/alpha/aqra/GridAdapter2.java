package com.alpha.aqra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by alphaenciel on 6/20/2016.
 */
public class GridAdapter2 extends BaseAdapter {

    Context context;

    public class ViewHolder {
        public ImageView imageView;
        public TextView textTitle;
    }

    private GridItems2[] items;
    private LayoutInflater mInflater;

    public GridAdapter2(Context context, GridItems2[] locations) {

        mInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = context;
        items = locations;

    }

    public GridItems2[] getItems() {
        return items;
    }

    public void setItems(GridItems2[] items) {
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

    public void setItemsList(GridItems2[] locations) {
        this.items = locations;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        ViewHolder viewHolder;

        if (view == null) {

            view = mInflater.inflate(R.layout.custom2, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) view
                    .findViewById(R.id.grid_item_image2);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        GridItems2 gridItems = items[position];
        setCatImage(position, viewHolder, gridItems.title);
        return view;
    }

    private void setCatImage(int pos, ViewHolder viewHolder, String catTitle) {
        if(catTitle=="1"){viewHolder.imageView.setImageResource(R.drawable.is_2_bawa);}
        if(catTitle=="2"){viewHolder.imageView.setImageResource(R.drawable.is_2_baro);}
        if(catTitle=="3"){viewHolder.imageView.setImageResource(R.drawable.is_2_taro);}
        if(catTitle=="4"){viewHolder.imageView.setImageResource(R.drawable.is_2_tata);}
        if(catTitle=="5"){viewHolder.imageView.setImageResource(R.drawable.is_2_tadza);}
        if(catTitle=="6"){viewHolder.imageView.setImageResource(R.drawable.is_2_taro);}
        if(catTitle=="7"){viewHolder.imageView.setImageResource(R.drawable.is_2_badza);}
        if(catTitle=="8"){viewHolder.imageView.setImageResource(R.drawable.is_2_baba);}
        if(catTitle=="9"){viewHolder.imageView.setImageResource(R.drawable.is_2_jaitsa);}
        if(catTitle=="10"){viewHolder.imageView.setImageResource(R.drawable.is_2_tsatsa);}
        if(catTitle=="11"){viewHolder.imageView.setImageResource(R.drawable.is_2_tadza);}
        if(catTitle=="12"){viewHolder.imageView.setImageResource(R.drawable.is_2_batsa);}
        if(catTitle=="13"){viewHolder.imageView.setImageResource(R.drawable.is_2_baro);}
        if(catTitle=="14"){viewHolder.imageView.setImageResource(R.drawable.is_2_badza);}
        if(catTitle=="15"){viewHolder.imageView.setImageResource(R.drawable.is_2_tada);}
        if(catTitle=="16"){viewHolder.imageView.setImageResource(R.drawable.is_2_taro);}
        if(catTitle=="17"){viewHolder.imageView.setImageResource(R.drawable.is_2_taata);}
        if(catTitle=="18"){viewHolder.imageView.setImageResource(R.drawable.is_2_taa);}
        if(catTitle=="19"){viewHolder.imageView.setImageResource(R.drawable.is_2_baata);}
        if(catTitle=="20"){viewHolder.imageView.setImageResource(R.drawable.is_2_baa);}
        if(catTitle=="21"){viewHolder.imageView.setImageResource(R.drawable.is_2_jaitsa);}
        if(catTitle=="22"){viewHolder.imageView.setImageResource(R.drawable.is_2_baa);}
        if(catTitle=="23"){viewHolder.imageView.setImageResource(R.drawable.is_2_badza);}
        if(catTitle=="24"){viewHolder.imageView.setImageResource(R.drawable.is_2_taa);}
        if(catTitle=="25"){viewHolder.imageView.setImageResource(R.drawable.is_2_syaa);}
        if(catTitle=="26"){viewHolder.imageView.setImageResource(R.drawable.is_2_kana);}
        if(catTitle=="27"){viewHolder.imageView.setImageResource(R.drawable.is_2_zama);}
        if(catTitle=="28"){viewHolder.imageView.setImageResource(R.drawable.is_2_tokha);}
        if(catTitle=="29"){viewHolder.imageView.setImageResource(R.drawable.is_2_banana);}
        if(catTitle=="30"){viewHolder.imageView.setImageResource(R.drawable.is_2_nababa);}
        if(catTitle=="31"){viewHolder.imageView.setImageResource(R.drawable.is_2_natana);}
        if(catTitle=="32"){viewHolder.imageView.setImageResource(R.drawable.is_2_nanana);}
        if(catTitle=="33"){viewHolder.imageView.setImageResource(R.drawable.is_2_nataba);}
        if(catTitle=="34"){viewHolder.imageView.setImageResource(R.drawable.is_2_tabana);}
        if(catTitle=="35"){viewHolder.imageView.setImageResource(R.drawable.is_2_banata);}
        if(catTitle=="36"){viewHolder.imageView.setImageResource(R.drawable.is_2_nabata);}
        if(catTitle=="37"){viewHolder.imageView.setImageResource(R.drawable.is_2_nabadza);}
        if(catTitle=="38"){viewHolder.imageView.setImageResource(R.drawable.is_2_badzana);}
        if(catTitle=="39"){viewHolder.imageView.setImageResource(R.drawable.is_2_banaro);}
        if(catTitle=="40"){viewHolder.imageView.setImageResource(R.drawable.is_2_robana);}
        if(catTitle=="41"){viewHolder.imageView.setImageResource(R.drawable.is_2_wanadza);}
        if(catTitle=="42"){viewHolder.imageView.setImageResource(R.drawable.is_2_dzakhaba);}
        if(catTitle=="43"){viewHolder.imageView.setImageResource(R.drawable.is_2_nadzaro);}
        if(catTitle=="44"){viewHolder.imageView.setImageResource(R.drawable.is_2_badaro);}
        if(catTitle=="45"){viewHolder.imageView.setImageResource(R.drawable.is_2_dzakhaba);}
        if(catTitle=="46"){viewHolder.imageView.setImageResource(R.drawable.is_2_badaro);}
        if(catTitle=="47"){viewHolder.imageView.setImageResource(R.drawable.is_2_wanadza);}
        if(catTitle=="48"){viewHolder.imageView.setImageResource(R.drawable.is_2_nadzaro);}
        if(catTitle=="49"){viewHolder.imageView.setImageResource(R.drawable.is_2_nabaa);}
        if(catTitle=="50"){viewHolder.imageView.setImageResource(R.drawable.is_2_nabaalif);}
        if(catTitle=="51"){viewHolder.imageView.setImageResource(R.drawable.is_2_naroain);}
        if(catTitle=="52"){viewHolder.imageView.setImageResource(R.drawable.is_2_dzaroha);}
        if(catTitle=="53"){viewHolder.imageView.setImageResource(R.drawable.is_2_nawafa);}
        if(catTitle=="54"){viewHolder.imageView.setImageResource(R.drawable.is_2_wanaa);}
        if(catTitle=="55"){viewHolder.imageView.setImageResource(R.drawable.is_2_tasyaba);}
        if(catTitle=="56"){viewHolder.imageView.setImageResource(R.drawable.is_2_syabata);}
        if(catTitle=="57"){viewHolder.imageView.setImageResource(R.drawable.is_2_yanaro);}
        if(catTitle=="58"){viewHolder.imageView.setImageResource(R.drawable.is_2_ronaro);}
        if(catTitle=="59"){viewHolder.imageView.setImageResource(R.drawable.is_2_yabaro);}
        if(catTitle=="60"){viewHolder.imageView.setImageResource(R.drawable.is_2_robaya);}
        if(catTitle=="61"){viewHolder.imageView.setImageResource(R.drawable.is_2_danaro);}
        if(catTitle=="62"){viewHolder.imageView.setImageResource(R.drawable.is_2_yadana);}
        if(catTitle=="63"){viewHolder.imageView.setImageResource(R.drawable.is_2_nabaya);}
        if(catTitle=="64"){viewHolder.imageView.setImageResource(R.drawable.is_2_bayana);}
        if(catTitle=="65"){viewHolder.imageView.setImageResource(R.drawable.is_2_yadaya);}
        if(catTitle=="66"){viewHolder.imageView.setImageResource(R.drawable.is_2_nadzaro);}
        if(catTitle=="67"){viewHolder.imageView.setImageResource(R.drawable.is_2_najaila);}
        if(catTitle=="68"){viewHolder.imageView.setImageResource(R.drawable.is_2_dzakhaba);}
        if(catTitle=="69"){viewHolder.imageView.setImageResource(R.drawable.is_2_bayana);}
        if(catTitle=="70"){viewHolder.imageView.setImageResource(R.drawable.is_2_yabaro);}
        if(catTitle=="71"){viewHolder.imageView.setImageResource(R.drawable.is_2_danaro);}
        if(catTitle=="72"){viewHolder.imageView.setImageResource(R.drawable.is_2_yadana);}
        if(catTitle=="73"){viewHolder.imageView.setImageResource(R.drawable.is_2_ayata);}
        if(catTitle=="74"){viewHolder.imageView.setImageResource(R.drawable.is_2_yaaba);}
        if(catTitle=="75"){viewHolder.imageView.setImageResource(R.drawable.is_2_syanaa);}
        if(catTitle=="76"){viewHolder.imageView.setImageResource(R.drawable.is_2_asyasya);}
        if(catTitle=="77"){viewHolder.imageView.setImageResource(R.drawable.is_2_wanada);}
        if(catTitle=="78"){viewHolder.imageView.setImageResource(R.drawable.is_2_ataro);}
        if(catTitle=="79"){viewHolder.imageView.setImageResource(R.drawable.is_2_nathoro);}
        if(catTitle=="80"){viewHolder.imageView.setImageResource(R.drawable.is_2_rodzakho);}
        if(catTitle=="81"){viewHolder.imageView.setImageResource(R.drawable.is_2_yasaro);}
        if(catTitle=="82"){viewHolder.imageView.setImageResource(R.drawable.is_2_sayala);}
        if(catTitle=="83"){viewHolder.imageView.setImageResource(R.drawable.is_2_fataro);}
        if(catTitle=="84"){viewHolder.imageView.setImageResource(R.drawable.is_2_yayaro);}
    }
}
