package com.example.zhy_pulltorefreash_chenyoca;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
	public static final String[] options = { "ListView", "GridView" ,"GridHeadView","testheadgridview"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, options));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent = null;
		switch (position) {
		case 0:
			intent = new Intent(this, PullToRefreshListActivity.class);
			break;
		case 1:
			intent = new Intent(this, PullToRefreshGridActivity.class);
			break;
		case 2:
			intent=new Intent(this,PullToRefreHeadGridView.class);
			break;
		case 3:
			intent=new Intent(this,GridHeadView.class);
		}
		if (intent != null)
			startActivity(intent);
	}

}
