package com.l99.chinafootball.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.l99.chinafootball.R;
import com.l99.chinafootball.utils.MenuItem;

import java.util.ArrayList;
import java.util.List;

import io.swagger.client.model.Menu;

/**
 * Created by lifeix-101 on 2016/6/22.
 */
public class RightMenuCategoryAdapter extends BaseAdapter {

    private List<Menu> menuList = new ArrayList<Menu>();

    public RightMenuCategoryAdapter() {
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

    public void setData(List<Menu> data) {
        menuList.clear();
        menuList.addAll(data);
    }

    public void addItem(Menu menu, int position) {
        menuList.add(position, menu);
    }

    public void addItem(Menu menu) {
        menuList.add(menu);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null) {
            viewHolder = new ViewHolder();
            convertView = View.inflate(parent.getContext(), R.layout.item_left_menu,null);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.img_item_left_menu);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.catagory_item_left_menu);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Menu item = menuList.get(position);
        if(item instanceof MenuItem)
            Glide.with(parent.getContext()).load(((MenuItem) item).drawableId).into(viewHolder.imageView);
        else
            Glide.with(parent.getContext()).load(item.getIconUrl()).into(viewHolder.imageView);

        viewHolder.textView.setText(menuList.get(position).getName());

        return convertView;
    }


    class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
