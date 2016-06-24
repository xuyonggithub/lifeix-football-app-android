package com.l99.chinafootball.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.l99.chinafootball.R;
import com.l99.chinafootball.adapter.LeftMenuListViewAdapter;
import com.l99.chinafootball.utils.Url;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.api.MenuApi;
import io.swagger.client.model.Menu;

public class MenuLeftFragment extends Fragment
{
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


		MenuApi menuApi = null;
		try {
			menuApi = new MenuApi();
			menuApi.setBasePath(Url.COMMEN_URL);
			menuApi.getMenuListAsync(new Response.Listener<String>() {
				@Override
				public void onResponse(String response) {
					try {
                        Log.i("async", response);
						List<Menu> list = (List<Menu>) ApiInvoker.deserialize(response, "array", Menu.class);
                        adapter = new LeftMenuListViewAdapter(getActivity(), list, 0);
                        mListView.setAdapter(adapter);
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
}
