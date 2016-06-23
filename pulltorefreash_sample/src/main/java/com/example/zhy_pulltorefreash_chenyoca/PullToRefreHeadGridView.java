package com.example.zhy_pulltorefreash_chenyoca;

import java.util.LinkedList;

import com.handmark.pulltorefresh.library.ILoadingLayout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener;
import com.handmark.pulltorefresh.library.PullToRefreshGridView;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshHeadGridView;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.handmark.pulltorefresh.library.HeaderGridView;

public class PullToRefreHeadGridView extends Activity  {

	private LinkedList<String> mListItems;
	private PullToRefreshHeadGridView mPullRefreshListView;
	private ArrayAdapter<String> mAdapter;
	private int mItemCount = 26;
	GridView g;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_ptr_head_grid);
		// 得到控件
		mPullRefreshListView = (PullToRefreshHeadGridView) findViewById(R.id.pull_refresh_grid);
		mPullRefreshListView.setMode(Mode.BOTH);
		mPullRefreshListView.setAdapter(null);
		View view = View.inflate(this, R.layout.list_head_view, null);
		HeaderGridView lv = mPullRefreshListView.getRefreshableView();
		lv.setNumColumns(4);
		
		lv.addHeaderView(view);
		initDatas();
		mAdapter = new ArrayAdapter<String>(this, R.layout.grid_item,
				R.id.id_grid_item_text, mListItems);
		mPullRefreshListView.setAdapter(mAdapter);
		// 初始化数据和数据源
	
	
		
	}


	private void initDatas() {
		mListItems = new LinkedList<String>();
		for (int i = 0; i < mItemCount; i++) {
			mListItems.add(i + "");
		}
	}

}
