package com.l99.chinafootball.page;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.l99.chinafootball.base.BasePage;

/**
 * Created by lifeix-101 on 2016/6/21.
 * 球员页面
 */
public class PlayerListPage extends BasePage {

    public PlayerListPage(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        TextView textView = new TextView(context);
        textView.setText("球员页面");
        textView.setTextSize(25);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    @Override
    public void initData() {

    }
}
