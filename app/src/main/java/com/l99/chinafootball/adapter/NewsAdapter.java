package com.l99.chinafootball.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.l99.chinafootball.R;

import java.util.ArrayList;
import java.util.logging.Logger;

import io.swagger.client.model.Menu;
import io.swagger.client.model.News;

/**
 * Created by xuyong on 16/6/27.
 */
public class NewsAdapter extends RecyclerView.Adapter{

    private ArrayList<Menu> mData = new ArrayList<Menu>();

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item_layout, null);
        return new NewsHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        NewsHolder viewHolder = (NewsHolder) holder;
        Menu menu = mData.get(position);
        Glide.with(((NewsHolder) holder).mNewsThumb.getContext()).load(menu.getIconUrl()).into(viewHolder.mNewsThumb);
        viewHolder.mNewsTitle.setText(menu.getName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setmData(ArrayList<Menu> d) {
        mData.clear();
        mData.addAll(d);
    }


    public class NewsHolder extends  RecyclerView.ViewHolder {

        public ImageView mNewsThumb;
        public TextView mNewsTitle;

        public NewsHolder(View itemView) {
            super(itemView);
            mNewsThumb = (ImageView) itemView.findViewById(R.id.iv_news_thumb);
            mNewsTitle = (TextView) itemView.findViewById(R.id.tv_news_title);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    com.orhanobut.logger.Logger.e("RecycleView " + getAdapterPosition());
                }
            });
        }
    }
}
