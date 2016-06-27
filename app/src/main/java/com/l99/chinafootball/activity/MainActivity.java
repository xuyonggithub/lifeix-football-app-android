package com.l99.chinafootball.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.l99.chinafootball.R;
import com.l99.chinafootball.fragment.MenuLeftFragment;
import com.l99.chinafootball.utils.Url;
import com.nineoldandroids.view.ViewHelper;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.api.MenuApi;
import io.swagger.client.model.Menu;

public class MainActivity extends FragmentActivity {
    private DrawerLayout mDrawerLayout;
    List<Menu> mMenuData;
    private MenuLeftFragment mLeftMenu;
    private Handler mHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_new_main);

        mHandler = new Handler();

        initView();
        initEvents();
        loadMenuData();

    }

    private void loadMenuData() {
        MenuApi menuApi = null;
        try {
            menuApi = new MenuApi();
            menuApi.setBasePath(Url.COMMEN_URL);
            menuApi.getMenuListAsync(new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    try {
                        Log.i("async", response);
                        mMenuData = (List<Menu>) ApiInvoker.deserialize(response, "array", Menu.class);
                        //mLeftMenu.setData(mMenuData);
                        mLeftMenu.addData(mMenuData.get(0), 0);
                    } catch (ApiException e) {
                        e.printStackTrace();
                    }
                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {

                }
            },"visitor", "app");

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

    public void OpenRightMenu(View view)
    {
        mDrawerLayout.openDrawer(Gravity.RIGHT);
        mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED,
                Gravity.RIGHT);
    }

    private void initEvents()
    {
        mDrawerLayout.setDrawerListener(new DrawerLayout.DrawerListener()
        {
            @Override
            public void onDrawerStateChanged(int newState)
            {
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset)
            {
                View mContent = mDrawerLayout.getChildAt(0);
                View mMenu = drawerView;
                float scale = 1 - slideOffset;
                float rightScale = 0.8f + scale * 0.2f;

                if (drawerView.getTag().equals("LEFT"))
                {

                    float leftScale = 1 - 0.3f * scale;

                    ViewHelper.setScaleX(mMenu, leftScale);
                    ViewHelper.setScaleY(mMenu, leftScale);
                    ViewHelper.setAlpha(mMenu, 0.6f + 0.4f * (1 - scale));
                    ViewHelper.setTranslationX(mContent,
                            mMenu.getMeasuredWidth() * (1 - scale));
                    ViewHelper.setPivotX(mContent, 0);
                    ViewHelper.setPivotY(mContent,
                            mContent.getMeasuredHeight() / 2);
                    mContent.invalidate();
                    ViewHelper.setScaleX(mContent, rightScale);
                    ViewHelper.setScaleY(mContent, rightScale);
                } else
                {
                    ViewHelper.setTranslationX(mContent,
                            -mMenu.getMeasuredWidth() * slideOffset);
                    ViewHelper.setPivotX(mContent, mContent.getMeasuredWidth());
                    ViewHelper.setPivotY(mContent,
                            mContent.getMeasuredHeight() / 2);
                    mContent.invalidate();
					/*ViewHelper.setScaleX(mContent, rightScale);
					ViewHelper.setScaleY(mContent, rightScale);*/
                }

            }

            @Override
            public void onDrawerOpened(View drawerView)
            {
            }

            @Override
            public void onDrawerClosed(View drawerView)
            {
                mDrawerLayout.setDrawerLockMode(
                        DrawerLayout.LOCK_MODE_LOCKED_CLOSED, Gravity.RIGHT);
            }
        });
    }

    private void initView()
    {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.id_drawerLayout);
        mDrawerLayout.setScrimColor(Color.TRANSPARENT);
        mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED,
                Gravity.RIGHT);

        mLeftMenu = (MenuLeftFragment) getSupportFragmentManager().findFragmentById(R.id.fg_left_menu);
    }

    public List<Menu> getMenuData() {
        return mMenuData;
    }

    public void switchContent(final Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        try {
            fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            fm.beginTransaction().replace(R.id.content_frame, fragment).commit();
        } catch (Exception e) {
            fm.beginTransaction().replace(R.id.content_frame, fragment).commitAllowingStateLoss();
        }

        mHandler.postDelayed(new Runnable() {
            public void run() {
                mDrawerLayout.closeDrawer(Gravity.LEFT);
            }
        }, 50);
    }
}
