package com.l99.chinafootball.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.l99.chinafootball.R;

import java.util.List;

import io.swagger.client.model.Menu;

/**
 * Created by lifeix-101 on 2016/6/22.
 */
public class LeftMenuListViewAdapter extends BaseAdapter {

    private Context context;
    private List<Menu> menuList;
    private int selectPosition;

    public LeftMenuListViewAdapter(Context context, List<Menu> menuList, int selectPosition) {
        this.context = context;
        this.menuList = menuList;
        this.selectPosition = selectPosition;
    }

    @Override
    public int getCount() {
        return menuList.size();
    }

    @Override
    public Object getItem(int position) {
        return menuList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null) {
            viewHolder = new ViewHolder();
            convertView = View.inflate(context, R.layout.item_left_menu,null);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.img_item_left_menu);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.catagory_item_left_menu);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Glide.with(context).load(menuList.get(position).getIconUrl()).into(viewHolder.imageView);
        if(selectPosition == position) {
            viewHolder.textView.setTextColor(context.getResources().getColor(R.color.red));
        }else {
            viewHolder.textView.setTextColor(context.getResources().getColor(R.color.dark_gray));
        }
        viewHolder.textView.setText(menuList.get(position).getName());

        return convertView;
    }

    public void setSelectPosition(int selectPosition) {
        this.selectPosition = selectPosition;
        notifyDataSetChanged();
    }

    class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
