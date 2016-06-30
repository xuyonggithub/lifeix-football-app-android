package com.l99.chinafootball;

/**
 * Created by lifeix-101 on 2016/6/24.
 */
public interface getDataListener<T>{

    void onLoading();
    void onSuccess(T t);
    void onError();


}