package com.example.zhy_pulltorefreash_chenyoca;

import java.util.Date;
import java.util.LinkedList;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.Toast;

import com.example.zhy_pulltorefreash_chenyoca.R.layout;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnLastItemVisibleListener;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener2;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

public class PullToRefreshListActivity extends Activity
{

	private LinkedList<String> mListItems;
	/**
	 * 上拉刷新的控件
	 */
	private PullToRefreshListView mPullRefreshListView;

	private ArrayAdapter<String> mAdapter;

	private int mItemCount = 15;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		mPullRefreshListView = (PullToRefreshListView) findViewById(R.id.pull_refresh_list);
	
		/**
		 *  mPullRefreshListView.setMode(Mode.PULL_FROM_END);//向下拉刷新

 			mPullRefreshListView.setMode(Mode.PULL_FROM_START);//向上拉刷新

			mPullRefreshListView.setMode(Mode.BOTH);//两端刷新
		 */
		
		mPullRefreshListView.setMode(Mode.BOTH);
		View view=View.inflate(this, R.layout.list_head_view, null);
        ListView lv = mPullRefreshListView.getRefreshableView();
        lv.addHeaderView(view);
		/**
		 * 刷新时 是否允许可以滑动
		 */
		mPullRefreshListView.setScrollingWhileRefreshingEnabled(false);
	
		
		
		mPullRefreshListView.setOnLastItemVisibleListener(new OnLastItemVisibleListener() {

			@Override
			public void onLastItemVisible() {
					Toast.makeText(PullToRefreshListActivity.this, "已经到了最后一条数据", 0).show();

			}
		});
		
		/**
		 *   打开应用 自动刷新
		 */
	//	mPullRefreshListView.setRefreshing(true);
		// 初始化数据
		initDatas();
		// 设置适配器
		mAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, mListItems);
		mPullRefreshListView.setAdapter(mAdapter);
		mPullRefreshListView.setOnRefreshListener(new OnRefreshListener2<ListView>() {
			@Override
			public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
							Log.e("TAG", "onPullDownToRefresh");
							String label = "刚刚";
			                // 更新显示的label
			                refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);
			                //这里写下拉刷新的任务
			                new GetDataTask().execute();
			}

			@Override
			public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
						Log.e("TAG", "onPullUpToRefresh");
						//这里写上拉加载更多的任务
						new GetDataTask().execute();
					}
		    });

	}

	private void initDatas()
	{
		// 初始化数据和数据源
		mListItems = new LinkedList<String>();

		for (int i = 0; i < mItemCount; i++)
		{
			mListItems.add("" + i);
		}
	}

	private class GetDataTask extends AsyncTask<Void, Void, String>
	{

		@Override
		protected String doInBackground(Void... params)
		{
			try
			{
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
			}
			return "" + (mItemCount++);
		}

		@Override
		protected void onPostExecute(String result)
		{
			mListItems.add(result);
			mAdapter.notifyDataSetChanged();//改变数据
			// Call onRefreshComplete when the list has been refreshed.
			mPullRefreshListView.onRefreshComplete();//停止刷新
			mPullRefreshListView.setMode(Mode.PULL_FROM_START);
		}
	}

	/**
	 * // 设置监听事件 mPullRefreshListView .setOnRefreshListener(new
	 * OnRefreshListener<ListView>() {
	 * 
	 * @Override public void onRefresh( PullToRefreshBase<ListView> refreshView)
	 *           { String label = DateUtils.formatDateTime(
	 *           getApplicationContext(), System.currentTimeMillis(),
	 *           DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE |
	 *           DateUtils.FORMAT_ABBREV_ALL); // 显示最后更新的时间
	 *           refreshView.getLoadingLayoutProxy()
	 *           .setLastUpdatedLabel(label);
	 * 
	 *           // 模拟加载任务 new GetDataTask().execute(); } });
	 */

}
