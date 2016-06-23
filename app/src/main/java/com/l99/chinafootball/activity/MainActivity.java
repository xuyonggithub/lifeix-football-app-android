package com.l99.chinafootball.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.l99.chinafootball.R;
import com.l99.chinafootball.eventBus.FirstEvent;
import com.l99.chinafootball.fragment.ContentFragment;
import com.l99.chinafootball.fragment.LeftMenuFragment;

import de.greenrobot.event.EventBus;

public class MainActivity extends SlidingFragmentActivity
{
    private LinearLayout linearLayout;
    private ImageButton imageButton;
    private FrameLayout frameLayout;
    private TextView title;

    public static final String LEFTMENU_TAG = "leftmenu_tag";
    public static final String  MAIN_TAG = "main_tag";

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.ll_activity_main);
        imageButton = (ImageButton) findViewById(R.id.ib_activity_main);
        frameLayout = (FrameLayout) findViewById(R.id.fl_activity_main);
        title = (TextView) findViewById(R.id.title_activity_main);

        //注册EventBus
        EventBus.getDefault().register(this);

        setBehindContentView(R.layout.left_menu);
        // configure the SlidingMenu
        final SlidingMenu slidingMenu = getSlidingMenu();
        slidingMenu.setMode(SlidingMenu.LEFT);
        // 设置触摸屏幕的模式
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
//        menu.setShadowWidthRes(R.dimen.shadow_width);
//        menu.setShadowDrawable(R.drawable.shadow);

        // 设置滑动菜单视图的宽度
        slidingMenu.setBehindOffset((int) (getWindowManager().getDefaultDisplay().getWidth()*0.4));
        slidingMenu.setFadeDegree(0.35f);
        initFragment();
//        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        // 设置渐入渐出效果的值


        //首先请求数据，数据请求成功后，加载数据，旋转进度条消失

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slidingMenu.toggle();
            }
        });

    }

    private void initFragment() {
        //1.得到FragmentManager
        FragmentManager fm = getSupportFragmentManager();
        //2.开启事务
        FragmentTransaction ft = fm.beginTransaction();

        //3.替换Fragment
        ft.replace(R.id.fl_leftmenu,new LeftMenuFragment(), LEFTMENU_TAG);
        ft.replace(R.id.fl_activity_main, new ContentFragment(), MAIN_TAG);

        //4.事务提交
        ft.commit();
    }

    /**
     * 得到左侧菜单
     * @return
     */
    public LeftMenuFragment getLeftMenuFragment() {
        FragmentManager fm = getSupportFragmentManager();
        LeftMenuFragment leftMenuFragment = (LeftMenuFragment) fm.findFragmentByTag(LEFTMENU_TAG);
        return leftMenuFragment;
    }

    /**
     得到正文Fragment
     */
    public ContentFragment getContentFragment() {
        FragmentManager fm = getSupportFragmentManager();
        ContentFragment contentFragment = (ContentFragment) fm.findFragmentByTag(MAIN_TAG);
        return contentFragment;
    }

    //接收到 选中的 类别名
    public void onEventMainThread(FirstEvent event) {

        String msg = event.getMsg();
        Log.e("接收到选中的页面：", msg);
        title.setText(msg);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

}
