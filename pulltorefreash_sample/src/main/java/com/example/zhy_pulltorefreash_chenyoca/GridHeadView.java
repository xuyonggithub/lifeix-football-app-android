package com.example.zhy_pulltorefreash_chenyoca;

import com.handmark.pulltorefresh.library.HeaderGridView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.app.Activity;

public class GridHeadView extends Activity {

	private com.handmark.pulltorefresh.library.HeaderGridView headgrid;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_head_view);
		headgrid=(HeaderGridView) findViewById(R.id.headergridview);
		View view = View.inflate(this, R.layout.list_head_view, null);
		headgrid.addHeaderView(view);
		headgrid.setAdapter(new MyAdapter());
	}

	class MyAdapter extends BaseAdapter{

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 8;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			convertView=View.inflate(GridHeadView.this, android.R.layout.simple_list_item_1, null);
			TextView text=(TextView) convertView;
			text.setText("你好");
			return text;
		}
		
	}
}
