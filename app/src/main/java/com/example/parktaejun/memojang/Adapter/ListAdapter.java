package com.example.parktaejun.memojang.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.parktaejun.memojang.Data.Data;
import com.example.parktaejun.memojang.R;

import java.util.ArrayList;

/**
 * Created by parktaejun on 2017. 7. 31..
 */

public class ListAdapter extends BaseAdapter{

    private ArrayList<Data> listViewItemList = new ArrayList<Data>() ;

    public ListAdapter(){

    }

    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return listViewItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final int pos = i;
        final Context context = viewGroup.getContext();

        // "item_list" Layout을 inflate하여 viewGroup 참조 획득.
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater)
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_list, viewGroup, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        ImageView image = (ImageView) view.findViewById(R.id.image) ;
        TextView title = (TextView) view.findViewById(R.id.title) ;
        TextView content = (TextView) view.findViewById(R.id.content) ;

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득
        Data listViewItem = listViewItemList.get(i);

        // 아이템 내 각 위젯에 데이터 반영
        image.setImageDrawable(listViewItem.getImage());
        title.setText(listViewItem.getTitle());
        content.setText(listViewItem.getContent());

        return view;
    }

    public void addItem(Drawable image, String title, String content) {
        Data item = new Data();

        item.setImage(image);
        item.setTitle(title);
        item.setContent(content);

        listViewItemList.add(item);
    }
}
