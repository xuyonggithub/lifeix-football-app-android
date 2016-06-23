package com.l99.chinafootball.fragment;

import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.l99.chinafootball.R;
import com.l99.chinafootball.activity.MainActivity;
import com.l99.chinafootball.adapter.LeftMenuListViewAdapter;
import com.l99.chinafootball.base.BaseFragment;
import com.l99.chinafootball.eventBus.FirstEvent;
import com.l99.chinafootball.utils.LogUtil;
import com.l99.chinafootball.utils.Url;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import de.greenrobot.event.EventBus;
import io.swagger.client.ApiException;
import io.swagger.client.api.MenuApi;
import io.swagger.client.model.Menu;

/**
 * Created by lifeix-101 on 2016/6/22.
 */
public class LeftMenuFragment extends BaseFragment {

    private static final int SUCCESS = 1;
    private ListView mListView;

    private LeftMenuListViewAdapter adapter;

    /**
     * 被点击的item的位置
     */
    private int selectPosition;
    private List<Menu> menuList;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case SUCCESS:
                    menuList = (List<Menu>) msg.obj;
                    adapter = new LeftMenuListViewAdapter(context, menuList,selectPosition);
                    mListView.setAdapter(adapter);
//                    MainActivity mainActivity = (MainActivity) context;
//                    ContentFragment contentFragment = mainActivity.getContentFragment();
//                    contentFragment.initData(menuList);
                    break;
            }
        }
    };

    @Override
    public View initView() {
        LogUtil.e("左侧侧滑菜单初始化页面");
        View view = View.inflate(context, R.layout.leftmenu_fragment,null);
        mListView = (ListView) view.findViewById(R.id.lv_leftmenu_fragment);
        mListView.setDividerHeight(0);
        //防止在低版本按下的时候变色
        mListView.setCacheColorHint(Color.TRANSPARENT);
        //设置把选择某条的时候，没有任何颜色变化
        mListView.setSelector(android.R.color.transparent);

        MainActivity mainActivity = (MainActivity) context;
        mainActivity.getSlidingMenu();

        //设置点击事件
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //1.点击的这一条变成高亮显示
                selectPosition = position;
                adapter.setSelectPosition(selectPosition);
                Toast.makeText(context, "选中的位置："+selectPosition, Toast.LENGTH_SHORT).show();
                //2.左侧菜单收起来
                MainActivity mainActivity = (MainActivity) context;
                mainActivity.getSlidingMenu().toggle();//关-->开；开-->关

                //3.切换到对应的页面
                switchPager(selectPosition);
                //发广播 通知 title 改变
                EventBus.getDefault().post(new FirstEvent(menuList.get(selectPosition).getName()));
            }
        });
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        LogUtil.e("左侧侧滑 初始化数据");
//        //请求左侧 侧滑 数据
//        HttpUtils.getDataByGET("http://192.168.50.154:8000/football/category/menus/app?key=visitor");

//        ApiInvoker.initializeInstance();
        new Thread(){
            @Override
            public void run() {
                MenuApi menuApi = null;
                try {
                    menuApi = new MenuApi();
                    menuApi.setBasePath(Url.COMMEN_URL);
                    List<Menu> menuList = menuApi.getMenuList("visitor", "app");
                    LogUtil.e(menuList.toString());
                    Message message = new Message();
                    message.obj = menuList;
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

    /**
     * 切换到对应的页面
     * @param selectPosition
     */
    private void switchPager(int selectPosition) {
        MainActivity mainActivity = (MainActivity) context;
        ContentFragment contentFragment =  mainActivity.getContentFragment();
        contentFragment.switchPager(selectPosition);
    }

}
