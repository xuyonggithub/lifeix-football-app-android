package com.l99.chinafootball.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import com.l99.chinafootball.R;

public class LandingPage extends Activity {

    private ImageView iv_landing_page;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(msg.what == ToMain) {
                Intent intent = new Intent(LandingPage.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
    };
    public static final int ToMain = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        iv_landing_page = (ImageView) findViewById(R.id.iv_landing_page);

        handler.sendEmptyMessageDelayed(ToMain,3000);
        //发广播 请求左侧侧滑数据 和 首页的数据

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(handler!=null) {
            handler.removeCallbacksAndMessages(null);
            handler = null;
        }

    }
}
