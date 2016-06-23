package com.l99.chinafootball.page;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.l99.chinafootball.R;
import com.l99.chinafootball.base.BasePage;
import com.l99.chinafootball.utils.CacheUtils;
import com.l99.chinafootball.utils.LogUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import io.swagger.client.ApiException;
import io.swagger.client.api.MenuApi;
import io.swagger.client.api.WemediaTopApi;
import io.swagger.client.model.Post;

/**
 * Created by lifeix-101 on 2016/6/21.
 * 12强赛事页面
 */
public class CompetitionPage extends BasePage {

    private static final int SUCCESS = 1;

    private List<String> categoryIds;
    /**
     * 上拉刷新的控件
     */
    private PullToRefreshListView mPullRefreshListView;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case SUCCESS:
                    //数据请求成功 加载 轮播图
//                    List<Post> visitor = (List<Post>) msg.obj;
//                    for (int i=0 ; i< visitor.size();i++){
//                        LogUtil.e(visitor.get(i).getTitle());
//                    }
                    break;
            }
        }
    };

    public CompetitionPage(Context context) {
        super(context);
        categoryIds = new ArrayList<>();
    }

    @Override
    public View initView() {
        LogUtil.e("12强赛页面 初始化页面");

        initData();

        View view = View.inflate(context, R.layout.competition_page,null);
        mPullRefreshListView = (PullToRefreshListView) view.findViewById(R.id.pull_refresh_list_competition_page);
        mPullRefreshListView.setMode(PullToRefreshBase.Mode.BOTH);
        View headView=View.inflate(context, R.layout.competition_page_head_view, null);

        ListView lv = mPullRefreshListView.getRefreshableView();
        lv.addHeaderView(headView);

        /**
         * 刷新时 是否允许可以滑动
         */
        mPullRefreshListView.setScrollingWhileRefreshingEnabled(false);

        mPullRefreshListView.setOnLastItemVisibleListener(new PullToRefreshBase.OnLastItemVisibleListener() {
            @Override
            public void onLastItemVisible() {
                Toast.makeText(context, "已经到了最后一条数据", Toast.LENGTH_SHORT).show();
            }
        });

        /**
         *   打开应用 自动刷新
         */
        //	mPullRefreshListView.setRefreshing(true);
        // 初始化数据
        // 设置适配器
//        mAdapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1, mListItems);
//        mPullRefreshListView.setAdapter(mAdapter);
        mPullRefreshListView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                String label = "刚刚";
                // 更新显示的label
                refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);
                //这里写下拉刷新的任务
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                //这里写上拉加载更多的任务

            }
        });
        return view;
    }

    @Override
    public void initData() {
        boolean competitionPageIsInitData = CacheUtils.getBoolean(context, "CompetitionPageIsInitData");
        if(!competitionPageIsInitData) {
            LogUtil.e("12强赛页面 初始化数据");
            //未初始化数据 联网加载数据
            //保存请求状态
            CacheUtils.putBoolean(context,"CompetitionPageIsInitData",true);
        }
        new Thread(){
            @Override
            public void run() {
                WemediaTopApi wemediaTopApi = null;
                MenuApi menuApi = null;

                try {
//                    menuApi = new MenuApi();
////                    menuApi.setBasePath(Url.COMMEN_URL);
//                    List<Menu> menuList = menuApi.getMenuList("visitor", "app");
//                    for (int i=0; i<menuList.size() ; i++){
//                        categoryIds.add(menuList.get(i).getId());
//                        Log.e("test", "menuList中categoryIds：" + categoryIds.get(i));
//                    }
//
//                    Log.e("test","menuList中categoryIds的个数："+categoryIds.size());

                    //获取 每个类目 的 头部轮播图
                    wemediaTopApi = new WemediaTopApi();
//                    wemediaTopApi.setBasePath(Url.COMMEN_URL);
//                    List<Post> visitor = wemediaTopApi.getTopPosts("visitor", Arrays.asList(menuList.get(0).getId()));
                    List<Post> visitor = wemediaTopApi.getTopPosts("visitor", Arrays.asList("referee"));

                    Log.e("test","每个类目 的 头部轮播图："+visitor.toString());
                    LogUtil.e(visitor.toString());

                    Message message = new Message();
                    message.obj = visitor;
                    message.what = SUCCESS;

                    //数据解析成功
                    handler.sendMessage(message);
                } catch (TimeoutException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ApiException e) {
                    e.printStackTrace();
                }

            }
        }.start();
    }

}
