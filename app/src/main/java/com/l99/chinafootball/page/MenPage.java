package com.l99.chinafootball.page;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.l99.chinafootball.base.BasePage;
import com.l99.chinafootball.utils.LogUtil;

/**
 * Created by lifeix-101 on 2016/6/21.
 * 男足页面
 */
public class MenPage extends BasePage {

    public MenPage(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        LogUtil.e("中国男足 初始化页面");
        TextView textView = new TextView(context);
        textView.setText("中国男足");
        textView.setTextSize(25);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    @Override
    public void initData() {
        LogUtil.e("中国男足 初始化数据");
    }
}
