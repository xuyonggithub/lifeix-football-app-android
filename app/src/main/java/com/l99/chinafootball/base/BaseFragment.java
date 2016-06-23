package com.l99.chinafootball.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lifeix-101 on 2016/6/21.
 */
public abstract class BaseFragment extends Fragment {
    /**
     * 上下文
     */
    public Context context;
    private View rootView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context =  getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(rootView == null) {
            rootView = initView();
            initData();
        }
        return rootView;
    }

    /**
     * 由孩子强制实现，实现特定的效果
     * @return
     */
    public abstract  View initView() ;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        initData();
    }

    /**
     * 当孩子需要初始化数据的时候，重新该方法
     */
    public void initData() {

    }


}
