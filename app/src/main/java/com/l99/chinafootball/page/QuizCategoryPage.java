package com.l99.chinafootball.page;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.l99.chinafootball.base.BasePage;
import com.l99.chinafootball.utils.LogUtil;

/**
 * Created by lifeix-101 on 2016/6/21.
 * 规则测试列表列表页面
 */
public class QuizCategoryPage extends BasePage {

    public QuizCategoryPage(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        LogUtil.e("规则测试 初始化页面");
        TextView textView = new TextView(context);
        textView.setText("规则测试");
        textView.setTextSize(25);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    @Override
    public void initData() {
        LogUtil.e("规则测试 初始化数据");
    }
}
