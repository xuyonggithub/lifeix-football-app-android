package com.l99.chinafootball.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.l99.chinafootball.R;
import com.l99.chinafootball.activity.MainActivity;
import com.l99.chinafootball.adapter.LeftMenuListViewAdapter;
import com.l99.chinafootball.utils.MenuItem;

import java.util.List;

import io.swagger.client.model.Menu;

public class MenuLeftFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView mListView;
    private LeftMenuListViewAdapter adapter;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState)
	{
		return inflater.inflate(R.layout.leftmenu_fragment, container, false);
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

        mListView = (ListView) view.findViewById(R.id.lv_leftmenu_fragment);
        mListView.setDividerHeight(0);
        //防止在低版本按下的时候变色
        mListView.setCacheColorHint(Color.TRANSPARENT);
        //设置把选择某条的时候，没有任何颜色变化
        mListView.setSelector(android.R.color.transparent);

        adapter = new LeftMenuListViewAdapter();

        adapter.addItem(new MenuItem("资讯", "", NewsFragment.class, R.drawable.news));

        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(this);
	}

    public void setData(List<Menu> data) {
        adapter.setData(data);
        adapter.notifyDataSetChanged();
    }

    public void addData(Menu menu, int position) {
        adapter.addItem(menu, position);
        adapter.notifyDataSetChanged();
    }

    public void openFragment(Class<? extends Fragment> fragmentClass, Bundle arguments) {
        Fragment fragment = Fragment.instantiate(getActivity(), fragmentClass.getName(), arguments);
        ((MainActivity) getActivity()).switchContent(fragment);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Menu menu = (Menu) adapter.getItem(position);
        if(menu instanceof MenuItem) {
            openFragment(((MenuItem) menu).fragmentClass, null);
            ((MainActivity) getActivity()).setTitle(menu.getName());
        } else {
            openFragment(HotFragment.class, null);
            ((MainActivity) getActivity()).setTitle(menu.getName());
        }
    }
}
